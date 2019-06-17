package com.example.androidforbeginner.Tutorials.Item.Layouts_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class RelativeActivity extends AppCompatActivity {
    TextView rowOneTextView,rowTwoTextView,code1TextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        setTitle(getString(R.string.relative));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        code1TextView = findViewById(R.id.code_linear);

        String rowOne = "<p><b>Android RelativeLayout</b> enables you to specify how child views are positioned relative to each other. " +
                "The position of each view can be specified as relative to sibling elements or relative to the parent.</p>";
        String rowTwo = "<p>This example will take you through simple steps to show how to create your own Android application using Relative Layout.</p>";
        String code = "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   android:layout_width=\"fill_parent\"\n" +
                "   android:layout_height=\"fill_parent\"\n" +
                "   android:paddingLeft=\"16dp\"\n" +
                "   android:paddingRight=\"16dp\" >\n" +
                "   \n" +
                "   <EditText\n" +
                "      android:id=\"@+id/name\"\n" +
                "      android:layout_width=\"fill_parent\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:hint=\"@string/reminder\" />\n" +
                "      \n" +
                "   <LinearLayout\n" +
                "      android:orientation=\"vertical\"\n" +
                "      android:layout_width=\"fill_parent\"\n" +
                "      android:layout_height=\"fill_parent\"\n" +
                "      android:layout_alignParentStart=\"true\"\n" +
                "      android:layout_below=\"@+id/name\">\n" +
                "      \n" +
                "      <Button\n" +
                "         android:layout_width=\"wrap_content\"\n" +
                "         android:layout_height=\"wrap_content\"\n" +
                "         android:text=\"New Button\"\n" +
                "         android:id=\"@+id/button\" />\n" +
                "      \n" +
                "      <Button\n" +
                "         android:layout_width=\"wrap_content\"\n" +
                "         android:layout_height=\"wrap_content\"\n" +
                "         android:text=\"New Button\"\n" +
                "         android:id=\"@+id/button2\" />\n" +
                "      \n" +
                "   </LinearLayout>\n" +
                "\n" +
                "</RelativeLayout>";

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
