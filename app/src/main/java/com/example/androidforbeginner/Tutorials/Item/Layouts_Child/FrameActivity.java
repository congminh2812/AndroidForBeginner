package com.example.androidforbeginner.Tutorials.Item.Layouts_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class FrameActivity extends AppCompatActivity {
    TextView rowOneTextView,rowTwoTextView,code1TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        setTitle(getString(R.string.frame));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        code1TextView = findViewById(R.id.code_linear);

        String rowOne = "<p><b>Frame Layout</b> is designed to block out an area on the screen to display a single item." +
                " Generally, FrameLayout should be used to hold a single child view," +
                " because it can be difficult to organize child views in a" +
                " way that's scalable to different screen sizes without the children overlapping each other.</p>";
        String rowTwo = "<b><u>Code:</u></b>";
        String code = "<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   android:layout_width=\"fill_parent\"\n" +
                "   android:layout_height=\"fill_parent\">\n" +
                "   \n" +
                "   <ImageView \n" +
                "      android:src=\"@drawable/ic_launcher\"\n" +
                "      android:scaleType=\"fitCenter\"\n" +
                "      android:layout_height=\"250px\"\n" +
                "      android:layout_width=\"250px\"/>\n" +
                "   \n" +
                "   <TextView\n" +
                "      android:text=\"Frame Demo\"\n" +
                "      android:textSize=\"30px\"\n" +
                "      android:textStyle=\"bold\"\n" +
                "      android:layout_height=\"fill_parent\"\n" +
                "      android:layout_width=\"fill_parent\"\n" +
                "      android:gravity=\"center\"/>\n" +
                "</FrameLayout>";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        rowTwoTextView.setText(android.text.Html.fromHtml(rowTwo));
        code1TextView.setText(code);


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
