package com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class ToggleActivity extends AppCompatActivity {

    TextView rowOneTextView, rowTwoTextView, codeTextView, code2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
        setTitle(getString(R.string.toggle_button));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        codeTextView = findViewById(R.id.code);
        code2TextView = findViewById(R.id.code2);

        String rowOne = "<p><b>ToggleButton</b> displays checked/unchecked states as a button. " +
                "It is basically an on/off button with a light indicator.</p>";
        String rowTwo = "<h3><b>Example</b></h3>" +
                "This example will take you through simple steps to show how to create your own Android " +
                "application using Linear Layout and ToggleButton.";

        String code = "public class MainActivity extends ActionBarActivity {\n" +
                "   ToggleButton tg1,tg2;\n" +
                "   Button b1;\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "      \n" +
                "      tg1=(ToggleButton)findViewById(R.id.toggleButton);\n" +
                "      tg2=(ToggleButton)findViewById(R.id.toggleButton2);\n" +
                "      \n" +
                "      b1=(Button)findViewById(R.id.button2);\n" +
                "      b1.setOnClickListener(new View.OnClickListener() {\n" +
                "         @Override\n" +
                "         public void onClick(View v) {\n" +
                "            StringBuffer result = new StringBuffer();\n" +
                "            result.append(\"You have clicked first ON Button-:) \").append(tg1.getText());\n" +
                "            result.append(\"You have clicked Second ON Button -:) \").append(tg2.getText());\n" +
                "            Toast.makeText(MainActivity.this, result.toString(),Toast.LENGTH_SHORT).show();\n" +
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
                "   tools:context=\".MainActivity\">\n" +
                "   \n" +
                "   <TextView\n" +
                "      android:id=\"@+id/textView2\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Tutorials point\"\n" +
                "      android:textColor=\"#ff87ff09\"\n" +
                "      android:textSize=\"30dp\"\n" +
                "      android:layout_above=\"@+id/imageButton\"\n" +
                "      android:layout_centerHorizontal=\"true\"\n" +
                "      android:layout_marginBottom=\"40dp\" />\n" +
                "      \n" +
                "   <ImageButton\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:id=\"@+id/imageButton\"\n" +
                "      android:src=\"@drawable/abc\"\n" +
                "      android:layout_centerVertical=\"true\"\n" +
                "      android:layout_centerHorizontal=\"true\" />\n" +
                "      \n" +
                "   <ToggleButton\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"On\"\n" +
                "      android:id=\"@+id/toggleButton\"\n" +
                "      android:checked=\"true\"\n" +
                "      android:layout_below=\"@+id/imageButton\"\n" +
                "      android:layout_toEndOf=\"@+id/button2/>\n" +
                "      \n" +
                "   <ToggleButton\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Off\"\n" +
                "      android:id=\"@+id/toggleButton2\"\n" +
                "      android:checked=\"true\"\n" +
                "      android:layout_alignTop=\"@+id/toggleButton\" />\n" +
                "      \n" +
                "   <Button\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:id=\"@+id/button2\"\n" +
                "      android:text=\"ClickMe\"\n" +
                "      android:layout_alignParentBottom=\"true\"\n" +
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
