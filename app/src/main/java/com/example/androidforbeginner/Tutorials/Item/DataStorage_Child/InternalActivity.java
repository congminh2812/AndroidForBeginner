package com.example.androidforbeginner.Tutorials.Item.DataStorage_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class InternalActivity extends AppCompatActivity {
    TextView rowOneTextView,rowTwoTextView,codeOne,codeTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal);
        setTitle(getString(R.string.internal));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        codeOne = findViewById(R.id.code);
        codeTwo = findViewById(R.id.code2);

        String rowOne = "Internal Storage:\n" +
                " In Android we can even save files directly on the devices internal storage. By default, files saved to the internal storage are private to your application and other applications cannot access them (nor can the user). When the user uninstalls your application, these files are removed. \n" +
                "\n" +
                "What kind of data can be stored in Internal Storage? The type of data involves things such as a text file, image file, video file, audio file etc. \n" +
                "\n" +
                "Where are the files stored? Files are stored in the directory data/date<package-name>/files folder To create and write a private file to the internal storage: \n" +
                "1. Call openFileOutput(String filename, int mode) with the name of the file and the operating mode.This returns a FileOutputStream. \n" +
                "Modes: \n" +
                "Modes refer to operating modes. Context.MODE_PRIVATE: Only your app can acces the file Context.MODE_APPEND: Append the data to the existing content \n" +
                "2. Write to the file with write°. \n" +
                "3. Close the stream with close().\n";
        String rowTwo = "How to read data from Internal Storage?\n" +
                " 1. Call openFilelnput() and pass it the name of the file to read. This returns a FilelnputStream.\n" +
                " 2. Read bytes from the file with read().Note:Since we are going to read data byte by byte we need to append each character.\n" +
                " 3. Then close the stream with close(). \n";
        String code1 = "String FILENAME = \"hello_file\";\n" +
                " String string = \"hello world!\"; \n" +
                "FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE); \n" +
                "fos.write(string.getBytes()); fos.close();\n";
        String code2 = "FilelnputStream fis = openFileInput(FILENAME); \n" +
                "int read=-1; \n" +
                "StringBuffer buffer= new StringBuffer();\n" +
                " while(read=fis.read())!=-1) {\n" +
                "\t\tbuffer.append((char)read); \n" +
                "}\n" +
                " fis.close();\n";

        rowOneTextView.setText(rowOne);
        rowTwoTextView.setText(rowTwo);
        codeOne.setText(code1);
        codeTwo.setText(code2);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            overridePendingTransition(R.anim.anim_enter_right, R.anim.anim_exit_right);
        }
        return super.onOptionsItemSelected(item);
    }
}
