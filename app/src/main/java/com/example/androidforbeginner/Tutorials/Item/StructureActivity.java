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
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.BuildActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.ComponentsActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.SetupActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.StackActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.VirtualActivity;
import com.example.androidforbeginner.Tutorials.Item.Introduction_Child.WhysActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.JavaActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.ManifestActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.ModuleActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.ResActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.StringsActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.StructureChildActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.StylesActivity;

import java.util.ArrayList;

public class StructureActivity extends AppCompatActivity {
    ItemAdapter adapter;
    ArrayList<Item> structureArrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_structure);
        setTitle(getString(R.string.structure).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_structure);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.list_view_structure);

        // add content in arraylist
        structureArrayList = new ArrayList<>();
        structureArrayList.add(new Item(R.drawable.image_structure_child,getString(R.string.structure).replace("\n","")));
        structureArrayList.add(new Item(R.drawable.image_module,getString(R.string.module)));
        structureArrayList.add(new Item(R.drawable.image_manifest,getString(R.string.manifest)));
        structureArrayList.add(new Item(R.drawable.image_java,getString(R.string.java)));
        structureArrayList.add(new Item(R.drawable.image_res,getString(R.string.res)));
        structureArrayList.add(new Item(R.drawable.image_strings,getString(R.string.strings)));
        structureArrayList.add(new Item(R.drawable.image_styles,getString(R.string.styles)));

        adapter = new ItemAdapter(this,R.layout.row_tutorials,structureArrayList);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) { // bắt sự kiện click chuyển Intent
                Intent intent = null;

                switch (structureArrayList.get(position).getImage()) {
                    case R.drawable.image_structure_child:
                        intent = new Intent(StructureActivity.this, StructureChildActivity.class);
                        break;
                    case R.drawable.image_module:
                        intent = new Intent(StructureActivity.this, ModuleActivity.class);
                        break;
                    case R.drawable.image_manifest:
                        intent = new Intent(StructureActivity.this, ManifestActivity.class);
                        break;
                    case R.drawable.image_java:
                        intent = new Intent(StructureActivity.this, JavaActivity.class);
                        break;
                    case R.drawable.image_res:
                        intent = new Intent(StructureActivity.this, ResActivity.class);
                        break;
                    case R.drawable.image_strings:
                        intent = new Intent(StructureActivity.this, StringsActivity.class);
                        break;
                    case R.drawable.image_styles:
                        intent = new Intent(StructureActivity.this, StylesActivity.class);
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
