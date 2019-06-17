package com.example.androidforbeginner.Tutorials.Item.Structure_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class ResActivity extends AppCompatActivity {
    TextView rowOneTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);
        setTitle(getString(R.string.res).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_res);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);

        String rowOne = "Here are some important subdirectories in the /res folder and the types of resources they host:\n" +
                "\n" +
                "anim: Compiled animation files\n" +
                "drawable: Bitmaps\n" +
                "layout: UI and view definitions\n" +
                "values: Arrays, colors, dimensions, strings, and styles\n" +
                "xml: Compiled arbitrary XML files\n" +
                "raw: Noncompiled raw files";
        rowOneTextView.setText(rowOne);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            overridePendingTransition(R.anim.anim_enter_right,R.anim.anim_exit_right);
        }
        return super.onOptionsItemSelected(item);
    }
}
