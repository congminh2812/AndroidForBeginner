package com.example.androidforbeginner.Tutorials.Item.DataStorage_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class DataStorageChildActivity extends AppCompatActivity {
    TextView rowOneTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_storage_child);
        setTitle(getString(R.string.datastorage_child));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);

        String rowOne = "Android Data Storage:\n" +
                " Android provides several options for you to save persistent application data. \n" +
                "It totally depends on our needs, which storage option we want to select to store data. \n" +
                "\n" +
                "The data storage options in Android are:-Shared Preferences:\n" +
                " Store private primitive data in key-value pairs. Thus whenever we want to retrieve the data we give the \"Key\" to the database and getting the corresponding \"value of it from the database. E.g. storing data as \"Username\":\"Arjun\" \"Password\":\"xyz_123\". Now, for retriving we would just feed the database with a key , here it is \"Username\" and would get the corresponding value of it i.e.\"Arjun\". \n" +
                "\n" +
                "Internal Storage: Store private data on the device memory. \n" +
                "\n" +
                "External Storage: Store public data on the shared external storage. \n" +
                "\n" +
                "SQLite Databases: Store structured data in a private database. For storing data in the form of related tables. \n" +
                "\n" +
                "Network Connection: Store data on the web with your own network server.\n";

        rowOneTextView.setText(rowOne);
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
