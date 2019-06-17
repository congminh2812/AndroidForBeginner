package com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class AutoCompleteActivity extends AppCompatActivity {

    TextView rowOneTextView, rowTwoTextView, codeTextView, code2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);
        setTitle(getString(R.string.autocomplete));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        codeTextView = findViewById(R.id.code);
        code2TextView = findViewById(R.id.code2);

        String rowOne = "<p><b>AutoCompleteTextView</b> is a view that is similar to EditText, except that it shows a list of completion suggestions automatically while the user is typing.</p>";
        String rowTwo = "<h3><b>Example</b></h3>" +
                "This example will take you through simple steps to show how to create your own" +
                " Android application using Linear Layout and AutoCompleteTextView.";

        String code = "public class MainActivity extends Activity {\n" +
                "   AutoCompleteTextView autocomplete;\n" +
                "   \n" +
                "   String[] arr = { \"Paries,France\", \"PA,United States\",\"Parana,Brazil\", \n" +
                "      \"Padua,Italy\", \"Pasadena,CA,United States\"};\n" +
                "   \n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "\n" +
                "      autocomplete = (AutoCompleteTextView)             \n" +
                "      findViewById(R.id.autoCompleteTextView1);\n" +
                "\n" +
                "      ArrayAdapter<String> adapter = new ArrayAdapter<String>  \n" +
                "      (this,android.R.layout.select_dialog_item, arr);\n" +
                "\n" +
                "      autocomplete.setThreshold(2);\n" +
                "      autocomplete.setAdapter(adapter);\n" +
                "   }\n" +
                "}";
        String code2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "   android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\"\n" +
                "   android:paddingBottom=\"@dimen/activity_vertical_margin\"\n" +
                "   android:paddingLeft=\"@dimen/activity_horizontal_margin\"\n" +
                "   android:paddingRight=\"@dimen/activity_horizontal_margin\"\n" +
                "   android:paddingTop=\"@dimen/activity_vertical_margin\"\n" +
                "   tools:context=\".MainActivity\" >\n" +
                "   \n" +
                "   <TextView\n" +
                "      android:id=\"@+id/textView2\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_alignParentTop=\"true\"\n" +
                "      android:layout_centerHorizontal=\"true\"\n" +
                "      android:layout_marginTop=\"25dp\"\n" +
                "      android:text=\"@string/example_autocompletetextview\" />\n" +
                "      \n" +
                "   <AutoCompleteTextView\n" +
                "      android:id=\"@+id/autoCompleteTextView1\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_alignLeft=\"@+id/textView2\"\n" +
                "      android:layout_below=\"@+id/textView2\"\n" +
                "      android:layout_marginTop=\"54dp\"\n" +
                "      android:ems=\"10\" />\n" +
                "    \n" +
                "</RelativeLayout>";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        rowTwoTextView.setText(android.text.Html.fromHtml(rowTwo));
        codeTextView.setText(code);
        code2TextView.setText(code2);

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
