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
import com.example.androidforbeginner.Tutorials.Item.PhpMySQL_Child.IntroActivity;
import com.example.androidforbeginner.Tutorials.Item.PhpMySQL_Child.LoginActivity;
import com.example.androidforbeginner.Tutorials.Item.PhpMySQL_Child.RegisterActivity;
import com.example.androidforbeginner.Tutorials.Item.SQLite_Child.CreateActivity;
import com.example.androidforbeginner.Tutorials.Item.SQLite_Child.DeleteActivity;
import com.example.androidforbeginner.Tutorials.Item.SQLite_Child.InsertActivity;
import com.example.androidforbeginner.Tutorials.Item.SQLite_Child.ReadActivity;
import com.example.androidforbeginner.Tutorials.Item.SQLite_Child.UpdateActivity;

import java.util.ArrayList;

public class PhpMySQLActivity extends AppCompatActivity {

    ItemAdapter adapter;
    ArrayList<Item> arrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_my_sql);
        setTitle(getString(R.string.mysql_php).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.list_view);

        // add content in arraylist
        arrayList = new ArrayList<>();
        arrayList.add(new Item(R.drawable.intro,getString(R.string.intro)));
        arrayList.add(new Item(R.drawable.login,getString(R.string.login)));
        arrayList.add(new Item(R.drawable.register,getString(R.string.register)));

        adapter = new ItemAdapter(this,R.layout.row_tutorials,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;

                switch (position) {
                    case 0:
                        intent = new Intent(PhpMySQLActivity.this, IntroActivity.class);
                        break;
                    case 1:
                        intent = new Intent(PhpMySQLActivity.this, LoginActivity.class);
                        break;
                    case 2:
                        intent = new Intent(PhpMySQLActivity.this, RegisterActivity.class);
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
