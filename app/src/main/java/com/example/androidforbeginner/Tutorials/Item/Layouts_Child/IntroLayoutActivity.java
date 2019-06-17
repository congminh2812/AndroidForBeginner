package com.example.androidforbeginner.Tutorials.Item.Layouts_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class IntroLayoutActivity extends AppCompatActivity {
    TextView rowOneTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_layout);
        setTitle("Introduction Layouts");
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);

        String rowOne = "        <p>There are number of Layouts provided by Android which you will use in almost all the Android applications to provide different view, look and feel.</p>\n" +
                "            <p><b>LinearLayout</b><br />\n" +
                "    LinearLayout is a view group that aligns all children in a single direction, vertically or horizontally.</p>\n" +
                "    <p><b>RelativeLayout</b><br />\n" +
                "    RelativeLayout is a view group that displays child views in relative positions.</p>\n" +
                "    <p><b>TableLayout\t</b><br />\n" +
                "    TableLayout is a view that groups views into rows and columns.</p>\n" +
                "    <p><b>FrameLayout</b><br />\n" +
                "    The FrameLayout is a placeholder on screen that you can use to display a single view.</p>\n";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
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
