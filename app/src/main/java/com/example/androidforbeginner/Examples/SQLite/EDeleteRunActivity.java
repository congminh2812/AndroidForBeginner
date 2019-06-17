package com.example.androidforbeginner.Examples.SQLite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidforbeginner.R;

public class EDeleteRunActivity extends AppCompatActivity {

        DataBaseHelper dataBaseHelper;
        EditText edtId;
        Button button;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_edelete_ru);
            setTitle("SQLite Delete");

            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            edtId = findViewById(R.id.edt_id);
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
            String id = edtId.getText().toString();
           int result = dataBaseHelper.deleteData(id);
            Toast.makeText(this, result+" :Rows Affected", Toast.LENGTH_SHORT).show();
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
