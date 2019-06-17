package com.example.androidforbeginner.Tutorials.Item;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.androidforbeginner.StatusBar;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.HistoryActivity;
import com.example.androidforbeginner.R;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.SymbolsActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.BuildActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.ComponentsActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.IntroductionChildActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.SetupActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.StackActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.VirtualActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.WhysActivity;

import java.util.ArrayList;

public class IntroductionActivity extends AppCompatActivity {

    ItemAdapter adapter;
    ArrayList<Item> introductionArrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);
        setTitle(getString(R.string.introduction).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_tutorials);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.list_view_tutorials);

        addIntroduction();

        adapter = new ItemAdapter(this,R.layout.row_tutorials,introductionArrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;

                switch (introductionArrayList.get(position).getImage()) {
                    case R.drawable.image_introduction_child:
                        intent = new Intent(IntroductionActivity.this, IntroductionChildActivity.class);
                        break;
                    case R.drawable.image_history:
                        intent = new Intent(IntroductionActivity.this, HistoryActivity.class);
                        break;
                    case R.drawable.image_symbols:
                        intent = new Intent(IntroductionActivity.this, SymbolsActivity.class);
                        break;
                    case R.drawable.image_why:
                        intent = new Intent(IntroductionActivity.this, WhysActivity.class);
                        break;
                    case R.drawable.image_software:
                        intent = new Intent(IntroductionActivity.this, StackActivity.class);
                        break;
                    case R.drawable.image_virtual:
                        intent = new Intent(IntroductionActivity.this, VirtualActivity.class);
                        break;
                    case R.drawable.image_components:
                        intent = new Intent(IntroductionActivity.this, ComponentsActivity.class);
                        break;
                    case R.drawable.image_setup:
                        intent = new Intent(IntroductionActivity.this, SetupActivity.class);
                        break;
                    case R.drawable.image_building:
                        intent = new Intent(IntroductionActivity.this, BuildActivity.class);
                        break;

                }
                if (intent != null) {
                    startActivity(intent);
                    overridePendingTransition(R.anim.anim_exit_left,R.anim.anim_enter_left);
                }
            }
        });
    }

    private void addIntroduction() {
        // add content in arraylist
        introductionArrayList = new ArrayList<>();
        introductionArrayList.add(new Item(R.drawable.image_introduction_child,getString(R.string.introduction).replace("\n","")));
        introductionArrayList.add(new Item(R.drawable.image_history,getString(R.string.history)));
        introductionArrayList.add(new Item(R.drawable.image_symbols,getString(R.string.symbols)));
        introductionArrayList.add(new Item(R.drawable.image_why,getString(R.string.why)));
        introductionArrayList.add(new Item(R.drawable.image_software,getString(R.string.software_stack)));
        introductionArrayList.add(new Item(R.drawable.image_virtual,getString(R.string.virtual)));
        //introductionArrayList.add(new Item(R.drawable.image_art_dalvik,getString(R.string.art_dalvik)));
        introductionArrayList.add(new Item(R.drawable.image_components,getString(R.string.android_components)));
        introductionArrayList.add(new Item(R.drawable.image_setup,getString(R.string.setup)));
        introductionArrayList.add(new Item(R.drawable.image_building,getString(R.string.build_app)));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            overridePendingTransition(R.anim.anim_enter_right,R.anim.anim_exit_right);
        }
        return super.onOptionsItemSelected(item);
    }
}
