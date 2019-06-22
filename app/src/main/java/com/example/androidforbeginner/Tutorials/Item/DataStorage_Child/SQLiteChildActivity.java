package com.example.androidforbeginner.Tutorials.Item.DataStorage_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class SQLiteChildActivity extends AppCompatActivity {
    TextView rowOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_child);
        setTitle(getString(R.string.sqlite_child));
        StatusBar.changingStatusBar(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);

        String row1= "<b><u>SQLite </u></b><br>" +
                "is a opensource SQL database that stores data to a text file on a device.<br>" +
                "Android comes in with built in SQLite database implementation.<br>" +
                "SQLite supports all the relational database features <br>" +
                "<b>Where are the files stored ?</b> <br>" +
                "Files are stored in the directory <br>" +
                "<i>data/data/<package-name>/databases/folder</i><br>";

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
