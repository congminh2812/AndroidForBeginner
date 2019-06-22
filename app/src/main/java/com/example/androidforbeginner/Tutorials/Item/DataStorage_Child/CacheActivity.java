package com.example.androidforbeginner.Tutorials.Item.DataStorage_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class CacheActivity extends AppCompatActivity {
    TextView rowOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cache);
        setTitle(getString(R.string.cache));
        StatusBar.changingStatusBar(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);

        String row1= "<b><u>Cache Storage:-</u></b><br>" +
                "The files stored in internal storage by user has to be explicitly deleted by the user explicitly otherwise it would exist till then. Cache data stored in memory is not a permanent data because the system automatically deletes it if it feels there is shortage of memory. \n" +
                    "Where are the files stored? Files are stored in the directory data klata<package-name>/cache folder <br>" +
                "<br>" +
                "<b>Steps to store data in cache:</b>-<br>" +
                "1. Use getCacheDir0 to open a File that represents the internal directory where your application should save temporary cache files. <br>" +
                "2. Use the File class to create a file inside that cache folder. <br>" +
                "3. Call openFileOutput(String filename) with the name of the file. <br>" +
                "<br>" +
                "<b>Steps to retrieve data from cache:-</b><br>" +
                "1. Again get a reference to the cache directory. <br>" +
                "2. Get the file using File class by specifying its name. <br>" +
                "3. Use FileInputStream to read data from the files.<br>";

        rowOne.setText(android.text.Html.fromHtml(row1));
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
