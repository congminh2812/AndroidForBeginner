package com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class EditTextActivity extends AppCompatActivity {

    TextView rowOneTextView, rowTwoTextView, codeTextView, code2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        setTitle(getString(R.string.edittext));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        codeTextView = findViewById(R.id.code);
        code2TextView = findViewById(R.id.code2);

        String rowOne = "<p><b>EditText</b> is an overlay over TextView that configures itself to be editable. " +
                "It is the predefined subclass of TextView that includes rich editing capabilities.</p>";
        String rowTwo = "<h3><b>Example</b></h3>" +
                "This example will take you through simple steps to show how to create your own" +
                " Android application using Linear Layout and EditText.";

        String code = "public class MainActivity extends Activity {\n" +
                "   EditText eText;\n" +
                "   Button btn;\n" +
                "   \n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "      eText = (EditText) findViewById(R.id.edittext);\n" +
                "      btn = (Button) findViewById(R.id.button);\n" +
                "      btn.setOnClickListener(new OnClickListener() {\n" +
                "         public void onClick(View v) {\n" +
                "            String str = eText.getText().toString();\n" +
                "            Toast msg = Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG);\n" +
                "            msg.show();\n" +
                "         }\n" +
                "      });\n" +
                "   }\n" +
                "}";
        String code2 = "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
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
                "      android:id=\"@+id/textView1\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_alignParentLeft=\"true\"\n" +
                "      android:layout_alignParentTop=\"true\"\n" +
                "      android:layout_marginLeft=\"14dp\"\n" +
                "      android:layout_marginTop=\"18dp\"\n" +
                "      android:text=\"@string/example_edittext\" />\n" +
                "      \n" +
                "   <Button\n" +
                "      android:id=\"@+id/button\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_alignLeft=\"@+id/textView1\"\n" +
                "      android:layout_below=\"@+id/textView1\"\n" +
                "      android:layout_marginTop=\"130dp\"\n" +
                "      android:text=\"@string/show_the_text\" />\n" +
                "      \n" +
                "   <EditText\n" +
                "      android:id=\"@+id/edittext\"\n" +
                "      android:layout_width=\"fill_parent\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_alignLeft=\"@+id/button\"\n" +
                "      android:layout_below=\"@+id/textView1\"\n" +
                "      android:layout_marginTop=\"61dp\"\n" +
                "      android:ems=\"10\"\n" +
                "      android:text=\"@string/enter_text\" android:inputType=\"text\" />\n" +
                "\n" +
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
