package com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class ButtonActivity extends AppCompatActivity {
    TextView rowOneTextView,rowTwoTextView,codeTextView,code2TextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        setTitle(getString(R.string.button));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        codeTextView = findViewById(R.id.code);
        code2TextView = findViewById(R.id.code2);

        String rowOne = "<p>A Button is a Push-button which can be pressed, or clicked, by the user to perform an action.</p>";
        String rowTwo = "<h3><b>Example</b></h3>" +
                "This example will take you through simple steps to show how to create " +
                "your own Android application using Linear Layout and Button. <br>" +
                "Following is the content of the modified main activity file <b>src/MainActivity.java</b>. " +
                "This file can include each of the fundamental lifecycle methods.";
        String code = "public class MainActivity extends ActionBarActivity {\n" +
                "   Button b1,b2,b3;\n" +
                "   \n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "      \n" +
                "      b1=(Button)findViewById(R.id.button);\n" +
                "      b1.setOnClickListener(new View.OnClickListener() {\n" +
                "         @Override\n" +
                "         public void onClick(View v) {\n" +
                "            Toast.makeText(MainActivity.this,\"YOUR MESSAGE\",Toast.LENGTH_LONG).show();\n" +
                "         }\n" +
                "      });\n" +
                "   }\n" +
                "}";
        String code2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout \n" +
                "   xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   xmlns:tools=\"http://schemas.android.com/tools\" \n" +
                "   android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\" \n" +
                "   android:paddingLeft=\"@dimen/activity_horizontal_margin\"\n" +
                "   android:paddingRight=\"@dimen/activity_horizontal_margin\"\n" +
                "   android:paddingTop=\"@dimen/activity_vertical_margin\"\n" +
                "   android:paddingBottom=\"@dimen/activity_vertical_margin\"\n" +
                "   tools:context=\".MainActivity\">\n" +
                "   \n" +
                "   <TextView\n" +
                "      android:id=\"@+id/textView1\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Button Control\"\n" +
                "      android:layout_alignParentTop=\"true\"\n" +
                "      android:layout_centerHorizontal=\"true\"\n" +
                "      android:textSize=\"30dp\" />\n" +
                "      \n" +
                "   <TextView\n" +
                "      android:id=\"@+id/textView2\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Tutorials point\"\n" +
                "      android:textColor=\"#ff87ff09\"\n" +
                "      android:textSize=\"30dp\"\n" +
                "      android:layout_below=\"@+id/textView1\"\n" +
                "      android:layout_centerHorizontal=\"true\" />\n" +
                "      \n" +
                "   <ImageButton\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:id=\"@+id/imageButton\"\n" +
                "      android:src=\"@drawable/abc\"\n" +
                "      android:layout_below=\"@+id/textView2\"\n" +
                "      android:layout_centerHorizontal=\"true\" />\n" +
                "      \n" +
                "   <EditText\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:id=\"@+id/editText\"\n" +
                "      android:layout_below=\"@+id/imageButton\"\n" +
                "      android:layout_alignRight=\"@+id/imageButton\"\n" +
                "      android:layout_alignEnd=\"@+id/imageButton\" />\n" +
                "      \n" +
                "   <Button\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Button\"\n" +
                "      android:id=\"@+id/button\"\n" +
                "      android:layout_alignTop=\"@+id/editText\"\n" +
                "      android:layout_alignLeft=\"@+id/textView1\"\n" +
                "      android:layout_alignStart=\"@+id/textView1\"\n" +
                "      android:layout_alignRight=\"@+id/editText\"\n" +
                "      android:layout_alignEnd=\"@+id/editText\" />\n" +
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
            overridePendingTransition(R.anim.anim_enter_right,R.anim.anim_exit_right);
        }
        return super.onOptionsItemSelected(item);
    }

}
