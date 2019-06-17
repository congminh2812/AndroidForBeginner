package com.example.androidforbeginner.Examples.DataStorage;

import android.content.Context;
import android.content.SharedPreferences;
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

public class ESharedRunActivity extends AppCompatActivity {
    Button btnSave,btnRead;
    TextView txtRead;
    EditText edtName;
    String FileName = "myFile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eshared_run);
        setTitle("SharedPreference");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnRead = findViewById(R.id.btn_read);
        btnSave = findViewById(R.id.btn_save);
        txtRead = findViewById(R.id.txt_read);
        edtName = findViewById(R.id.edt_name);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveFile();
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readFile();
            }
        });
    }
    private void saveFile(){
        String strName = edtName.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences(FileName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name",strName);
        editor.commit();
        Toast.makeText(this, "Data Saved Successfully", Toast.LENGTH_SHORT).show();
    }

    private void readFile() {
        SharedPreferences sharedPreferences = getSharedPreferences(FileName,Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("name","defaule");
        txtRead.setText(name);
        Toast.makeText(this, "Data: "+name, Toast.LENGTH_SHORT).show();
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
