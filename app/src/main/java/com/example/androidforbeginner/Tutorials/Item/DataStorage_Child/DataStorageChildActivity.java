package com.example.androidforbeginner.Tutorials.Item.DataStorage_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class DataStorageChildActivity extends AppCompatActivity {
    TextView rowOneTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_storage_child);
        setTitle(getString(R.string.datastorage_child));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);

        String rowOne = "<b><u>Android Data Storage:</u></b><br>" +
                " Android provides several options for you to save persistent application data. <br>" +
                "It totally depends on our needs, which storage option we want to select to store data. <br>" +
                "<br>" +
                "<b>The data storage options in Android are:-Shared Preferences:</b><br>" +
                " Store private primitive data in key-value pairs. Thus whenever we want to retrieve the data we give the \"Key\" to the database and getting the corresponding \"value of it from the database. E.g. storing data as \"Username\":\"Arjun\" \"Password\":\"xyz_123\". Now, for retriving we would just feed the database with a key , here it is \"Username\" and would get the corresponding value of it i.e.\"Arjun\". <br>" +
                "<br>" +
                "<b>Internal Storage:</b> Store private data on the device memory. <br>" +
                "<br>" +
                "<b>External Storage: </b>Store public data on the shared external storage. <br>" +
                "<br>" +
                "<b>SQLite Databases:</b> Store structured data in a private database. For storing data in the form of related tables. <br>" +
                "<br>" +
                "<b>Network Connection:</b> Store data on the web with your own network server.<br>";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
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
