package com.example.androidforbeginner.Tutorials.Item.DataStorage_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class CacheActivity extends AppCompatActivity {
    TextView rowOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cache);
        setTitle(getString(R.string.cache));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);

        String row1= "Cache Storage:-\n" +
                "The files stored in internal storage by user has to be explicitly deleted by the user explicitly otherwise it would exist till then. Cache data stored in memory is not a permanent data because the system automatically deletes it if it feels there is shortage of memory. \n" +
                "Where are the files stored? Files are stored in the directory dataklataRpackage-name>/cache folder \n" +
                "\n" +
                "Steps to store data in cache:-\n" +
                "1. Use getCacheDir0 to open a File that represents the internal directory where your application should save temporary cache files. \n" +
                "2. Use the File class to create a file inside that cache folder. 3. Call openFileOutput(String filename) with the name of the file. \n" +
                "\n" +
                "Steps to retrieve data from cache:-\n" +
                "1. Again get a refernce to the cache directory. \n" +
                "2. Get the file using File class by specifying its name. \n" +
                "3. Use FilelnputStream to read data from the files.\n";

        rowOne.setText(row1);
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
