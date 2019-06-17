package com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class UIIntroActivity extends AppCompatActivity {
    TextView rowOneTextView,codeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uiintro);
        setTitle("UI Introduction");
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        codeTextView = findViewById(R.id.code);

        String rowOne = "<p><b>Input Controls</b></p>" +
                "Input controls are the interactive components in your app's user interface." +
                " Android provides a wide variety of controls you can use in your UI, such as buttons," +
                " text fields, seek bars, checkboxes, zoom buttons, toggle buttons, and many more.\n" +
                "Adding an input control to your UI is as simple as adding an XML element to your XML layout." +
                " For example, here's a layout with a text field and button:";
        String code = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    android:layout_width=\"fill_parent\"\n" +
                "    android:layout_height=\"fill_parent\"\n" +
                "    android:orientation=\"horizontal\">\n" +
                "    <EditText android:id=\"@+id/edit_message\"\n" +
                "        android:layout_weight=\"1\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:hint=\"@string/edit_message\" />\n" +
                "    <Button android:id=\"@+id/button_send\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"@string/button_send\"\n" +
                "        android:onClick=\"sendMessage\" />\n" +
                "</LinearLayout>";
        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        codeTextView.setText(code);
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
