package com.example.androidforbeginner.Tutorials.Item.Structure_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class JavaActivity extends AppCompatActivity {
    TextView rowOneTextView,codeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        setTitle(getString(R.string.java).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_java);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        codeTextView = findViewById(R.id.code_java_text_view);

        String rowOne = "<p><b><u>java:</u></b><br>" +
                "Contains the Java source code files, separated by package names,including JUnit test code." +
                "All the Activity class are stored inside java folder. For e.g The Activity class called MainActivity.java is " +
                "stored in this directory under  the package name you mentioned in the wizard.</p>" +
                "<p><b><u>MainActivity.java:-</u></b><br>" +
                "The MainActivity.java class looks like this:</p>";
        String code =
                "package com.example.androidforbeginner;\n" +
                "public class IntroductionChildActivity extends AppCompatActivity {\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_introduction);\n" +
                "    }\n" +
                "}";
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
