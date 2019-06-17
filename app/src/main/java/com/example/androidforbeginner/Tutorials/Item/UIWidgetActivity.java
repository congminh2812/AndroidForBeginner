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
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.JavaActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.ManifestActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.ModuleActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.ResActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.StringsActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.StructureChildActivity;
import com.example.androidforbeginner.Tutorials.Item.Structure_Child.StylesActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.AlertActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.AutoCompleteActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.ButtonActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.CheckBoxActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.DatePickerActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.EditTextActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.ImageButtonActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.ProgressBarActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.RadioActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.RatingBarActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.SpinnerActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.TimePickerActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.ToastActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.ToggleActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child.UIIntroActivity;

import java.util.ArrayList;

public class UIWidgetActivity extends AppCompatActivity {
    ItemAdapter adapter;
    ArrayList<Item> uiWidgetArrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uiwidget);
        setTitle(getString(R.string.ui).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.list_view);

        // add content in arraylist
        uiWidgetArrayList = new ArrayList<>();
        uiWidgetArrayList.add(new Item(R.drawable.image_ui_intro,getString(R.string.ui_introduction)));
        uiWidgetArrayList.add(new Item(R.drawable.image_button,getString(R.string.button)));
        uiWidgetArrayList.add(new Item(R.drawable.image_edittext,getString(R.string.edittext)));
        uiWidgetArrayList.add(new Item(R.drawable.image_image,getString(R.string.image_button)));
        uiWidgetArrayList.add(new Item(R.drawable.image_toggle,getString(R.string.toggle_button)));
        uiWidgetArrayList.add(new Item(R.drawable.image_radio,getString(R.string.radio)));
        uiWidgetArrayList.add(new Item(R.drawable.image_checkbox,getString(R.string.checkbox)));
        uiWidgetArrayList.add(new Item(R.drawable.image_spinner,getString(R.string.spinner)));
        uiWidgetArrayList.add(new Item(R.drawable.image_rating,getString(R.string.rating)));
        uiWidgetArrayList.add(new Item(R.drawable.image_progress,getString(R.string.progress)));
        uiWidgetArrayList.add(new Item(R.drawable.image_date,getString(R.string.datepicker)));
        uiWidgetArrayList.add(new Item(R.drawable.image_time,getString(R.string.timepicker)));
        uiWidgetArrayList.add(new Item(R.drawable.image_toast,getString(R.string.toast)));
        uiWidgetArrayList.add(new Item(R.drawable.image_auto,getString(R.string.autocomplete)));
        uiWidgetArrayList.add(new Item(R.drawable.image_alert,getString(R.string.alert)));


        adapter = new ItemAdapter(this,R.layout.row_tutorials,uiWidgetArrayList);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) { // bắt sự kiện click chuyển Intent
                Intent intent = null;

                switch (uiWidgetArrayList.get(position).getImage()) {
                    case R.drawable.image_ui_intro:
                        intent = new Intent(UIWidgetActivity.this, UIIntroActivity.class);
                        break;
                    case R.drawable.image_button:
                        intent = new Intent(UIWidgetActivity.this, ButtonActivity.class);
                        break;
                    case R.drawable.image_edittext:
                        intent = new Intent(UIWidgetActivity.this, EditTextActivity.class);
                        break;
                    case R.drawable.image_image:
                        intent = new Intent(UIWidgetActivity.this, ImageButtonActivity.class);
                        break;
                    case R.drawable.image_toggle:
                        intent = new Intent(UIWidgetActivity.this, ToggleActivity.class);
                        break;
                    case R.drawable.image_radio:
                        intent = new Intent(UIWidgetActivity.this, RadioActivity.class);
                        break;
                    case R.drawable.image_checkbox:
                        intent = new Intent(UIWidgetActivity.this, CheckBoxActivity.class);
                        break;
                    case R.drawable.image_spinner:
                        intent = new Intent(UIWidgetActivity.this, SpinnerActivity.class);
                        break;
                    case R.drawable.image_rating:
                        intent = new Intent(UIWidgetActivity.this, RatingBarActivity.class);
                        break;
                    case R.drawable.image_progress:
                        intent = new Intent(UIWidgetActivity.this, ProgressBarActivity.class);
                        break;
                    case R.drawable.image_date:
                        intent = new Intent(UIWidgetActivity.this, DatePickerActivity.class);
                        break;
                    case R.drawable.image_time:
                        intent = new Intent(UIWidgetActivity.this, TimePickerActivity.class);
                        break;
                    case R.drawable.image_toast:
                        intent = new Intent(UIWidgetActivity.this, ToastActivity.class);
                        break;
                    case R.drawable.image_auto:
                        intent = new Intent(UIWidgetActivity.this, AutoCompleteActivity.class);
                        break;
                    case R.drawable.image_alert:
                        intent = new Intent(UIWidgetActivity.this, AlertActivity.class);
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
