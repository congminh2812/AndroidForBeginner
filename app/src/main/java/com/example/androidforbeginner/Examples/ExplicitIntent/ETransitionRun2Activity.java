package com.example.androidforbeginner.Examples.ExplicitIntent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.androidforbeginner.R;

public class ETransitionRun2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etransition2);
        setTitle("Activity Transition");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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

    public void btnClickAct2(View view) {
        Intent intent = new Intent(this, ETransitionRunActivity.class);
        startActivity(intent);
        finish();
    }
}
