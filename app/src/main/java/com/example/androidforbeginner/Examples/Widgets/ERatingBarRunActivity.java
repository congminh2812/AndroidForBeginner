package com.example.androidforbeginner.Examples.Widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.androidforbeginner.R;

public class ERatingBarRunActivity extends AppCompatActivity {
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erating_bar_run);
        setTitle("RatingBar");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ratingBar = findViewById(R.id.rating_bar);

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

    public void onBtnClick(View view) {
        float ratingValue = ratingBar.getRating();
        Toast.makeText(this, "Rating: "+ratingValue, Toast.LENGTH_SHORT).show();
    }
}
