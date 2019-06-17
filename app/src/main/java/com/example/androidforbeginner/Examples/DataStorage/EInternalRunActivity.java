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

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class EInternalRunActivity extends AppCompatActivity {
    Button btnSave,btnRead;
    TextView txtRead;
    EditText edtName;
    String FileName = "myFile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_einternal_run);
        setTitle("Internal Storage");

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
        try {
            FileOutputStream fileOutputStream = openFileOutput(FileName,Context.MODE_PRIVATE);
            String name = edtName.getText().toString();
            fileOutputStream.write(name.getBytes());
            fileOutputStream.close();
            Toast.makeText(this, "Data Saved Successfully", Toast.LENGTH_SHORT).show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void readFile() {
        try {
            FileInputStream fileInputStream = openFileInput(FileName);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            fileInputStream.close();
            inputStreamReader.close();
            txtRead.setText("Name: "+stringBuilder.toString());
            Toast.makeText(this, "Data: "+stringBuilder.toString(), Toast.LENGTH_SHORT).show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
