package com.example.androidforbeginner.Tutorials.Item;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;
import com.example.androidforbeginner.Tutorials.Item.FragAndAct_Child.FragJavaActivity;
import com.example.androidforbeginner.Tutorials.Item.FragAndAct_Child.FragXmlActivity;
import com.example.androidforbeginner.Tutorials.Item.FragAndAct_Child.Intent1Activity;
import com.example.androidforbeginner.Tutorials.Item.FragAndAct_Child.Intent2Activity;
import com.example.androidforbeginner.Tutorials.Item.FragAndAct_Child.InterFragActivity;
import com.example.androidforbeginner.Tutorials.Item.FragAndAct_Child.LifeCycleActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.BuildActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.ComponentsActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.HistoryActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.IntroductionChildActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.SetupActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.StackActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.SymbolsActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.VirtualActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.WhysActivity;

import java.util.ArrayList;

public class FragAndActActivity extends AppCompatActivity {

    ItemAdapter adapter;
    ArrayList<Item> arrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_and_act);
        setTitle(getString(R.string.activities_fragments).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.list_view);

        // add content in arraylist
        arrayList = new ArrayList<>();
        arrayList.add(new Item(R.drawable.image_lifecycle,getString(R.string.lifecycle)));
        arrayList.add(new Item(R.drawable.image_intent,getString(R.string.intent)));
        arrayList.add(new Item(R.drawable.image_intent,getString(R.string.intent_resolution)));
        arrayList.add(new Item(R.drawable.image_frag_java,getString(R.string.frag_java)));
        arrayList.add(new Item(R.drawable.image_fag_xml,getString(R.string.frag_xml)));
        arrayList.add(new Item(R.drawable.image_fag_xml,getString(R.string.inter_fragment)));

        adapter = new ItemAdapter(this,R.layout.row_tutorials,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;

                switch (position) {
                    case 0:
                        intent = new Intent(FragAndActActivity.this, LifeCycleActivity.class);
                        break;
                    case 1:
                        intent = new Intent(FragAndActActivity.this, Intent1Activity.class);
                        break;
                    case 2:
                        intent = new Intent(FragAndActActivity.this, Intent2Activity.class);
                        break;
                    case 3:
                        intent = new Intent(FragAndActActivity.this, FragJavaActivity.class);
                        break;
                    case 4:
                        intent = new Intent(FragAndActActivity.this, FragXmlActivity.class);
                        break;
                    case 5:
                        intent = new Intent(FragAndActActivity.this, InterFragActivity.class);
                        break;
                }
                if (intent != null) {
                    startActivity(intent);
                    overridePendingTransition(R.anim.anim_exit_left,R.anim.anim_enter_left);
                }
            }
        });
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
