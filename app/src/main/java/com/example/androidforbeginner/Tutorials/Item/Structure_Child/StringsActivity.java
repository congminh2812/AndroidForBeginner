package com.example.androidforbeginner.Tutorials.Item.Structure_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class StringsActivity extends AppCompatActivity {
    TextView rowOneTextView,rowOneTextView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strings);
        setTitle(getString(R.string.strings).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_strings);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowOneTextView2 = findViewById(R.id.row_one_text_view2);

        String rowOne = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<resources>\n" +
                "      <string name=\"hello\">hello</string>\n" +
                "      <string name=\"app_name\">hello appname</string>\n" +
                "      <string-array name=\"test_array\">\n" +
                "                 <item>one</item>\n" +
                "                 <item>two</item>\n" +
                "                 <item>three</item>\n" +
                "      </string-array>\n" +
                "</resources>";
        String rowOne2 = "//Get access to Resources object from an Activity\n" +
                "Resources res = your_Activity.getResources();\n" +
                "String strings[] = res.getStringArray(R.array.test_array);\n" +
                "\n" +
                "//Print strings\n" +
                "for (String s: strings)\n" +
                "{\n" +
                "    Log.d(\"example\", s);\n" +
                "}";

        rowOneTextView.setText(rowOne);
        rowOneTextView2.setText(rowOne2);

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
