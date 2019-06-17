package com.example.androidforbeginner.Examples.ImplicitIntent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.androidforbeginner.R;

public class EDialRunActivity extends AppCompatActivity {
    EditText editText;
    String sNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edial_run);
        setTitle("Phone Dial");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        editText = findViewById(R.id.edit_text_number);
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
        Intent intent = new Intent(Intent.ACTION_DIAL);
        sNum = editText.getText().toString();
        if (sNum.trim().isEmpty()) {
            intent.setData(Uri.parse("tel:0123456789"));
        }else
            intent.setData(Uri.parse("tel: "+sNum));

        startActivity(intent);
    }
}
