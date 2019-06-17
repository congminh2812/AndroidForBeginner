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
import com.example.androidforbeginner.Tutorials.Item.SQLite_Child.CreateActivity;
import com.example.androidforbeginner.Tutorials.Item.SQLite_Child.DeleteActivity;
import com.example.androidforbeginner.Tutorials.Item.SQLite_Child.InsertActivity;
import com.example.androidforbeginner.Tutorials.Item.SQLite_Child.ReadActivity;
import com.example.androidforbeginner.Tutorials.Item.SQLite_Child.UpdateActivity;

import java.util.ArrayList;

public class SQLiteActivity extends AppCompatActivity {

    ItemAdapter adapter;
    ArrayList<Item> arrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite2);
        setTitle(getString(R.string.sqlite).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.list_view);

        // add content in arraylist
        arrayList = new ArrayList<>();
        arrayList.add(new Item(R.drawable.database_table,getString(R.string.database_table)));
        arrayList.add(new Item(R.drawable.insert,getString(R.string.insert)));
        arrayList.add(new Item(R.drawable.read,getString(R.string.read)));
        arrayList.add(new Item(R.drawable.update,getString(R.string.update)));
        arrayList.add(new Item(R.drawable.delete,getString(R.string.delete)));

        adapter = new ItemAdapter(this,R.layout.row_tutorials,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;

                switch (position) {
                    case 0:
                        intent = new Intent(SQLiteActivity.this, CreateActivity.class);
                        break;
                    case 1:
                        intent = new Intent(SQLiteActivity.this, InsertActivity.class);
                        break;
                    case 2:
                        intent = new Intent(SQLiteActivity.this, ReadActivity.class);
                        break;
                    case 3:
                        intent = new Intent(SQLiteActivity.this, UpdateActivity.class);
                        break;
                    case 4:
                        intent = new Intent(SQLiteActivity.this, DeleteActivity.class);
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
