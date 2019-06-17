package com.example.androidforbeginner.Examples.Widgets;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.androidforbeginner.R;

public class ECheckBoxRunActivity extends AppCompatActivity {
    Button button;
    CheckBox checkBoxRed,checkBoxGreen,checkBoxBlue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echeck_box_run);
        setTitle("CheckBox");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button = findViewById(R.id.button);
        checkBoxRed = findViewById(R.id.ckb_red);
        checkBoxGreen = findViewById(R.id.ckb_green);
        checkBoxBlue = findViewById(R.id.ckb_blue);



    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                overridePendingTransition(R.anim.anim_enter_right,R.anim.anim_exit_right);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void ClickMe(View view) {
        if (checkBoxRed.isChecked()) {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
        } else if (checkBoxGreen.isChecked()) {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
        } else if (checkBoxBlue.isChecked()) {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FFFF"));
        }else
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
    }
}
