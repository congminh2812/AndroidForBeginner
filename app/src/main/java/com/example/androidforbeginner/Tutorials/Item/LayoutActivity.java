package com.example.androidforbeginner.Tutorials.Item;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;
import com.example.androidforbeginner.Tutorials.Item.Layouts_Child.FrameActivity;
import com.example.androidforbeginner.Tutorials.Item.Layouts_Child.IntroLayoutActivity;
import com.example.androidforbeginner.Tutorials.Item.Layouts_Child.LinearActivity;
import com.example.androidforbeginner.Tutorials.Item.Layouts_Child.RelativeActivity;
import com.example.androidforbeginner.Tutorials.Item.Layouts_Child.TableActivity;
import com.example.androidforbeginner.Tutorials.Item.Layouts_Child.ViewActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.JavaActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.ManifestActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.ModuleActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.ResActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.StringsActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.StructureChildActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.StylesActivity;

import java.util.ArrayList;

public class LayoutActivity extends AppCompatActivity {
    ItemAdapter adapter;
    ArrayList<Item> layoutArrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        setTitle(getString(R.string.layouts).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_layout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.list_view_layout);

        // add content in arraylist
        layoutArrayList = new ArrayList<>();
        layoutArrayList.add(new Item(R.drawable.image_view,getString(R.string.view)));
        layoutArrayList.add(new Item(R.drawable.image_introduction_layout,getString(R.string.introduction_layout)));
        layoutArrayList.add(new Item(R.drawable.image_linear,getString(R.string.linear)));
        layoutArrayList.add(new Item(R.drawable.image_relative,getString(R.string.relative)));
        layoutArrayList.add(new Item(R.drawable.image_table,getString(R.string.table)));
        layoutArrayList.add(new Item(R.drawable.image_frame,getString(R.string.frame)));

        adapter = new ItemAdapter(this,R.layout.row_tutorials,layoutArrayList);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) { // bắt sự kiện click chuyển Intent
                Intent intent = null;

                switch (layoutArrayList.get(position).getImage()) {
                    case R.drawable.image_view:
                        intent = new Intent(LayoutActivity.this, ViewActivity.class);
                        break;
                    case R.drawable.image_introduction_layout:
                        intent = new Intent(LayoutActivity.this, IntroLayoutActivity.class);
                        break;
                    case R.drawable.image_linear:
                        intent = new Intent(LayoutActivity.this, LinearActivity.class);
                        break;
                    case R.drawable.image_relative:
                        intent = new Intent(LayoutActivity.this, RelativeActivity.class);
                        break;
                    case R.drawable.image_table:
                        intent = new Intent(LayoutActivity.this, TableActivity.class);
                        break;
                    case R.drawable.image_frame:
                        intent = new Intent(LayoutActivity.this, FrameActivity.class);
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
