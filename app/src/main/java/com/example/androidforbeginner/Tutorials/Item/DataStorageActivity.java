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
import com.example.androidforbeginner.Tutorials.Item.DataStorage_Child.CacheActivity;
import com.example.androidforbeginner.Tutorials.Item.DataStorage_Child.DataStorageChildActivity;
import com.example.androidforbeginner.Tutorials.Item.DataStorage_Child.ExternalActivity;
import com.example.androidforbeginner.Tutorials.Item.DataStorage_Child.InternalActivity;
import com.example.androidforbeginner.Tutorials.Item.DataStorage_Child.SQLiteChildActivity;
import com.example.androidforbeginner.Tutorials.Item.DataStorage_Child.SharedPreferenceActivity;

import java.util.ArrayList;

public class DataStorageActivity extends AppCompatActivity {

    ItemAdapter adapter;
    ArrayList<Item> arrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_storage);
        setTitle(getString(R.string.datastorage).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.list_view);

        // add content in arraylist
        arrayList = new ArrayList<>();
        arrayList.add(new Item(R.drawable.datastorage,getString(R.string.datastorage_child)));
        arrayList.add(new Item(R.drawable.sharedpreference,getString(R.string.shared_preference)));
        arrayList.add(new Item(R.drawable.internal,getString(R.string.internal)));
        arrayList.add(new Item(R.drawable.external,getString(R.string.external)));
        arrayList.add(new Item(R.drawable.cache,getString(R.string.cache)));
        arrayList.add(new Item(R.drawable.sqlite,getString(R.string.sqlite_child)));

        adapter = new ItemAdapter(this,R.layout.row_tutorials,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;

                switch (position) {
                    case 0:
                        intent = new Intent(DataStorageActivity.this, DataStorageChildActivity.class);
                        break;
                    case 1:
                        intent = new Intent(DataStorageActivity.this, SharedPreferenceActivity.class);
                        break;
                    case 2:
                        intent = new Intent(DataStorageActivity.this, InternalActivity.class);
                        break;
                    case 3:
                        intent = new Intent(DataStorageActivity.this, ExternalActivity.class);
                        break;
                    case 4:
                        intent = new Intent(DataStorageActivity.this, CacheActivity.class);
                        break;
                    case 5:
                        intent = new Intent(DataStorageActivity.this, SQLiteChildActivity.class);
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
