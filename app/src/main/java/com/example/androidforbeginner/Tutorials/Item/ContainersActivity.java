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
import com.example.androidforbeginner.Tutorials.Item.Containers_Child.CustomListActivity;
import com.example.androidforbeginner.Tutorials.Item.Containers_Child.GridViewActivity;
import com.example.androidforbeginner.Tutorials.Item.Containers_Child.ListViewActivity;
import com.example.androidforbeginner.Tutorials.Item.Containers_Child.SearchViewActivity;
import com.example.androidforbeginner.Tutorials.Item.Containers_Child.WebViewActivity;

import java.util.ArrayList;

public class ContainersActivity extends AppCompatActivity {

    ItemAdapter adapter;
    ArrayList<Item> arrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_containers);
        setTitle(getString(R.string.containers).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.list_view);

        // add content in arraylist
        arrayList = new ArrayList<>();
        arrayList.add(new Item(R.drawable.image_listview,getString(R.string.listview)));
        arrayList.add(new Item(R.drawable.image_custom_lv,getString(R.string.custom_lv)));
        arrayList.add(new Item(R.drawable.image_gridview,getString(R.string.gridview)));
        arrayList.add(new Item(R.drawable.image_webview,getString(R.string.webview)));
        arrayList.add(new Item(R.drawable.image_searchview,getString(R.string.searchview)));

        adapter = new ItemAdapter(this,R.layout.row_tutorials,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;

                switch (position) {
                    case 0:
                        intent = new Intent(ContainersActivity.this, ListViewActivity.class);
                        break;
                    case 1:
                        intent = new Intent(ContainersActivity.this, CustomListActivity.class);
                        break;
                    case 2:
                        intent = new Intent(ContainersActivity.this, GridViewActivity.class);
                        break;
                    case 3:
                        intent = new Intent(ContainersActivity.this, WebViewActivity.class);
                        break;
                    case 4:
                        intent = new Intent(ContainersActivity.this, SearchViewActivity.class);
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
