package com.example.androidforbeginner.Examples.Toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.androidforbeginner.R;

public class EMessageRunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emessage_run);
        setTitle("Message Toast");

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

    public void ClickMe(View view) {
        Toast toast1 = Toast.makeText(this,"Toast:Gravity.TOP",Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.TOP,0,0);
        toast1.show();

        Toast toast2 = Toast.makeText(this,"Toast:Gravity.CENTER",Toast.LENGTH_SHORT);
        toast2.setGravity(Gravity.CENTER,0,0);
        toast2.show();

        Toast toast3 = Toast.makeText(this,"Toast:Gravity.BOTTOM",Toast.LENGTH_SHORT);
        toast3.setGravity(Gravity.BOTTOM,0,0);
        toast3.show();

        Toast toast4 = Toast.makeText(this,"Toast:Gravity.LEFT",Toast.LENGTH_SHORT);
        toast4.setGravity(Gravity.LEFT,0,0);
        toast4.show();

        Toast toast5 = Toast.makeText(this,"Toast:Gravity.RIGHT",Toast.LENGTH_SHORT);
        toast5.setGravity(Gravity.RIGHT,0,0);
        toast5.show();

        Toast toast6 = Toast.makeText(this,"Toast:TOP LEFT",Toast.LENGTH_SHORT);
        toast6.setGravity(Gravity.LEFT | Gravity.TOP,0,0);
        toast6.show();

        Toast toast7 = Toast.makeText(this,"Toast:BOTTOM RIGHT",Toast.LENGTH_SHORT);
        toast7.setGravity(Gravity.RIGHT | Gravity.BOTTOM,0,0);
        toast7.show();
    }
}
