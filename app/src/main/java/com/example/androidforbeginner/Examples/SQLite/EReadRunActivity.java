package com.example.androidforbeginner.Examples.SQLite;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidforbeginner.R;

public class EReadRunActivity extends AppCompatActivity {

        DataBaseHelper dataBaseHelper;
        TextView textView;
        Button button;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_eread_run);
            setTitle("SQLite Read");

            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

           textView = findViewById(R.id.txt_result);
            button = findViewById(R.id.button);

            dataBaseHelper = new DataBaseHelper(this);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ClickMe();
                }
            });

        }

        private void ClickMe() {
            Cursor res = dataBaseHelper.getAllData();
            StringBuffer stringBuffer = new StringBuffer();
            if (res != null && res.getCount() > 0) {
                while (res.moveToNext()) {
                    stringBuffer.append("Id: " + res.getString(0) + "\n");
                    stringBuffer.append("Name: " + res.getString(1) + "\n");
                    stringBuffer.append("SurName: " + res.getString(2) + "\n");
                    stringBuffer.append("Marks: " + res.getString(3) + "\n");
                }
                textView.setText(stringBuffer.toString());
                Toast.makeText(this, "Data Retrieved Succesfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "No Data to Retrieve", Toast.LENGTH_SHORT).show();
            }

        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    finish();
                    overridePendingTransition(R.anim.anim_enter_right, R.anim.anim_exit_right);
                    break;
            }
            return super.onOptionsItemSelected(item);
        }
    }
