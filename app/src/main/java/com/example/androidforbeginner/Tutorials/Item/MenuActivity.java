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
import com.example.androidforbeginner.Tutorials.Item.Menu_Child.ContextMenuActivity;
import com.example.androidforbeginner.Tutorials.Item.Menu_Child.MenuItemActivity;
import com.example.androidforbeginner.Tutorials.Item.Menu_Child.OptionMenuActivity;
import com.example.androidforbeginner.Tutorials.Item.Menu_Child.PopUpMenuActivity;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    ItemAdapter adapter;
    ArrayList<Item> arrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle(getString(R.string.menu).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.list_view);

        // add content in arraylist
        arrayList = new ArrayList<>();
        arrayList.add(new Item(R.drawable.image_menu_item,getString(R.string.menu_item)));
        arrayList.add(new Item(R.drawable.image_option_menu,getString(R.string.option_menu)));
        arrayList.add(new Item(R.drawable.image_context_menu,getString(R.string.context_menu)));
        arrayList.add(new Item(R.drawable.image_popup_menu,getString(R.string.popup_menu)));

        adapter = new ItemAdapter(this,R.layout.row_tutorials,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;

                switch (position) {
                    case 0:
                        intent = new Intent(MenuActivity.this, MenuItemActivity.class);
                        break;
                    case 1:
                        intent = new Intent(MenuActivity.this, OptionMenuActivity.class);
                        break;
                    case 2:
                        intent = new Intent(MenuActivity.this, ContextMenuActivity.class);
                        break;
                    case 3:
                        intent = new Intent(MenuActivity.this, PopUpMenuActivity.class);
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
