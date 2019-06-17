package com.example.androidforbeginner.Tutorials.Item.Introduction_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class IntroductionChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        setTitle(getString(R.string.introduction).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_introduction);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
