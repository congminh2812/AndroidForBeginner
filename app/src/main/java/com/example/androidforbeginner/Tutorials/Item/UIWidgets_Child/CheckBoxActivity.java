package com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class CheckBoxActivity extends AppCompatActivity {

    TextView rowOneTextView, rowTwoTextView, codeTextView, code2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        setTitle(getString(R.string.checkbox));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        codeTextView = findViewById(R.id.code);
        code2TextView = findViewById(R.id.code2);

        String rowOne = "<p><b>CheckBox</b> is an on/off switch that can be toggled by the user. " +
                "You should use check-boxes when presenting users with a group of " +
                "selectable options that are not mutually exclusive.</p>";
        String rowTwo = "<h3><b>Example</b></h3>" +
                "This example will take you through simple steps to show how to create your own" +
                " Android application using Linear Layout and CheckBox.";

        String code = "public class MainActivity extends Activity {\n" +
                "   CheckBox ch1,ch2;\n" +
                "   Button b1,b2;\n" +
                "\n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "      \n" +
                "      ch1=(CheckBox)findViewById(R.id.checkBox1);\n" +
                "      ch2=(CheckBox)findViewById(R.id.checkBox2);\n" +
                "      \n" +
                "      b1=(Button)findViewById(R.id.button);\n" +
                "      b2=(Button)findViewById(R.id.button2);\n" +
                "      b2.setOnClickListener(new View.OnClickListener() {\n" +
                "         \n" +
                "         @Override\n" +
                "         public void onClick(View v) {\n" +
                "            finish();\n" +
                "         }\n" +
                "      });\n" +
                "      b1.setOnClickListener(new View.OnClickListener() {\n" +
                "         \n" +
                "         @Override\n" +
                "         public void onClick(View v) {\n" +
                "            StringBuffer result = new StringBuffer();\n" +
                "            result.append(\"Thanks : \").append(ch1.isChecked());\n" +
                "            result.append(\"\\nThanks: \").append(ch2.isChecked());\n" +
                "            Toast.makeText(MainActivity.this, result.toString(), \n" +
                "               Toast.LENGTH_LONG).show();\n" +
                "         }\n" +
                "      });\n" +
                "   }\n" +
                "}";
        String code2 = "<RelativeLayout \n" +
                "   xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "   android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\"\n" +
                "   \n" +
                "   android:paddingBottom=\"@dimen/activity_vertical_margin\"\n" +
                "   android:paddingLeft=\"@dimen/activity_horizontal_margin\"\n" +
                "   android:paddingRight=\"@dimen/activity_horizontal_margin\"\n" +
                "   android:paddingTop=\"@dimen/activity_vertical_margin\"\n" +
                "   tools:context=\".MainActivity\">\n" +
                "   \n" +
                "   <TextView\n" +
                "      android:id=\"@+id/textView1\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Example of checkbox\"\n" +
                "      android:layout_alignParentTop=\"true\"\n" +
                "      android:layout_centerHorizontal=\"true\"\n" +
                "      android:textSize=\"30dp\" />\n" +
                "      \n" +
                "   <CheckBox\n" +
                "      android:id=\"@+id/checkBox1\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Do you like Tutorials Point\"\n" +
                "      android:layout_above=\"@+id/button\"\n" +
                "      android:layout_centerHorizontal=\"true\" />\n" +
                "      \n" +
                "   <CheckBox\n" +
                "      android:id=\"@+id/checkBox2\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Do you like android \"\n" +
                "      android:checked=\"false\"\n" +
                "      android:layout_above=\"@+id/checkBox1\"\n" +
                "      android:layout_alignLeft=\"@+id/checkBox1\"\n" +
                "      android:layout_alignStart=\"@+id/checkBox1\" />\n" +
                "   \n" +
                "   <TextView\n" +
                "      android:id=\"@+id/textView2\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_alignLeft=\"@+id/checkBox1\"\n" +
                "      android:layout_below=\"@+id/textView1\"\n" +
                "      android:layout_marginTop=\"39dp\"\n" +
                "      android:text=\"Tutorials point\"\n" +
                "      android:textColor=\"#ff87ff09\"\n" +
                "      android:textSize=\"30dp\"\n" +
                "      android:layout_alignRight=\"@+id/textView1\"\n" +
                "      android:layout_alignEnd=\"@+id/textView1\" />\n" +
                "      \n" +
                "   <Button\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Ok\"\n" +
                "      android:id=\"@+id/button\"\n" +
                "      android:layout_alignParentBottom=\"true\"\n" +
                "      android:layout_alignLeft=\"@+id/checkBox1\"\n" +
                "      android:layout_alignStart=\"@+id/checkBox1\" />\n" +
                "      \n" +
                "   <Button\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Cancel\"\n" +
                "      android:id=\"@+id/button2\"\n" +
                "      android:layout_alignParentBottom=\"true\"\n" +
                "      android:layout_alignRight=\"@+id/textView2\"\n" +
                "      android:layout_alignEnd=\"@+id/textView2\" />\n" +
                "      \n" +
                "   <ImageButton\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:id=\"@+id/imageButton\"\n" +
                "      android:src=\"@drawable/abc\"\n" +
                "      android:layout_centerVertical=\"true\"\n" +
                "      android:layout_centerHorizontal=\"true\" />\n" +
                "      \n" +
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
