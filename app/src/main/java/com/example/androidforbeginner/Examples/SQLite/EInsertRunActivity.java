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

public class EInsertRunActivity extends AppCompatActivity {
    DataBaseHelper dataBaseHelper;
    EditText edtName,edtSurname,edtMarks;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_einsert_run);
        setTitle("SQLite Insert");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        edtName = findViewById(R.id.edt_name);
        edtSurname = findViewById(R.id.edt_surname);
        edtMarks = findViewById(R.id.edt_marks);
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
        String name = edtName.getText().toString();
        String surname = edtSurname.getText().toString();
        String mark = edtMarks.getText().toString();
        Boolean reult = dataBaseHelper.insertData(name,surname,mark);
        if (reult == true) {
            Toast.makeText(this, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Data Insertion Failed", Toast.LENGTH_SHORT).show();
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
