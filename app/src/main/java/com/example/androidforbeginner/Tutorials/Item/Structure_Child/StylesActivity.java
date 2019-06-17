package com.example.androidforbeginner.Tutorials.Item.Structure_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class StylesActivity extends AppCompatActivity {
    TextView codeTextView,codeTextView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_styles);
        setTitle(getString(R.string.styles).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_styles);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        codeTextView = findViewById(R.id.code_styles);
        codeTextView2 = findViewById(R.id.code_styles2);

        String code1 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<resources>\n" +
                "   <style name=\"CustomFontStyle\">\n" +
                "      <item name=\"android:layout_width\">fill_parent</item>\n" +
                "      <item name=\"android:layout_height\">wrap_content</item>\n" +
                "      <item name=\"android:capitalize\">characters</item>\n" +
                "      <item name=\"android:typeface\">monospace</item>\n" +
                "      <item name=\"android:textSize\">12pt</item>\n" +
                "      <item name=\"android:textColor\">#00FF00</item>/> \n" +
                "   </style>\n" +
                "</resources>";
        String code2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   android:layout_width=\"fill_parent\"\n" +
                "   android:layout_height=\"fill_parent\"\n" +
                "   android:orientation=\"vertical\" >\n" +
                "\n" +
                "   <TextView\n" +
                "      android:id=\"@+id/text_id\"\n" +
                "      style=\"@style/CustomFontStyle\"\n" +
                "      android:text=\"@string/hello_world\" />\n" +
                "\n" +
                "</LinearLayout>";

        codeTextView.setText(code1);
        codeTextView2.setText(code2);
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
