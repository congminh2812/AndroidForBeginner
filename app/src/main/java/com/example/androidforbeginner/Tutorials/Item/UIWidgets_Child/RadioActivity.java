package com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class RadioActivity extends AppCompatActivity {

    TextView rowOneTextView, rowTwoTextView, codeTextView, code2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        setTitle(getString(R.string.radio));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        codeTextView = findViewById(R.id.code);
        code2TextView = findViewById(R.id.code2);

        String rowOne = "<p><b>RadioButton</b> has two states: either checked or unchecked. " +
                "This allows the user to select one option from a set.</p>";
        String rowTwo = "<h3><b>Example</b></h3>" +
                "This example will take you through simple steps to show how to create your own " +
                "Android application using Linear Layout and RadioButton.";

        String code = "public class MainActivity extends ActionBarActivity {\n" +
                "   RadioGroup rg1;\n" +
                "   RadioButton rb1;\n" +
                "   Button b1;\n" +
                "   \n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "      addListenerRadioButton();\n" +
                "   }\n" +
                "   \n" +
                "   private void addListenerRadioButton() {\n" +
                "      rg1 = (RadioGroup) findViewById(R.id.radioGroup);\n" +
                "      b1 = (Button) findViewById(R.id.button2);\n" +
                "      b1.setOnClickListener(new View.OnClickListener() {\n" +
                "         @Override\n" +
                "         public void onClick(View v) {\n" +
                "            int selected=rg1.getCheckedRadioButtonId();\n" +
                "            rb1=(RadioButton)findViewById(selected);\n" +
                "            Toast.makeText(MainActivity.this,rb1.getText(),Toast.LENGTH_LONG).show();\n" +
                "         }\n" +
                "      });\n" +
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
                "   tools:context=\".MainActivity\">\n" +
                "   \n" +
                "   <TextView\n" +
                "      android:id=\"@+id/textView1\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Example of Radio Button\"\n" +
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
                "   <Button\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:id=\"@+id/button2\"\n" +
                "      android:text=\"ClickMe\"\n" +
                "      android:layout_alignParentBottom=\"true\"\n" +
                "      android:layout_centerHorizontal=\"true\" />\n" +
                "   \n" +
                "   <RadioGroup\n" +
                "      android:id=\"@+id/radioGroup\"\n" +
                "      android:layout_width=\"fill_parent\"\n" +
                "      android:layout_height=\"fill_parent\"\n" +
                "      android:layout_below=\"@+id/imageButton\"\n" +
                "      android:layout_alignLeft=\"@+id/textView2\"\n" +
                "      android:layout_alignStart=\"@+id/textView2\">\n" +
                "         \n" +
                "      <RadioButton\n" +
                "         android:layout_width=\"142dp\"\n" +
                "         android:layout_height=\"wrap_content\"\n" +
                "         android:text=\"JAVA\"\n" +
                "         android:id=\"@+id/radioButton\"\n" +
                "         android:textSize=\"25dp\"\n" +
                "         android:textColor=\"@android:color/holo_red_light\"\n" +
                "         android:checked=\"false\"\n" +
                "         android:layout_gravity=\"center_horizontal\" />\n" +
                "         \n" +
                "      <RadioButton\n" +
                "         android:layout_width=\"wrap_content\"\n" +
                "         android:layout_height=\"wrap_content\"\n" +
                "         android:text=\"ANDROID\"\n" +
                "         android:id=\"@+id/radioButton2\"\n" +
                "         android:layout_gravity=\"center_horizontal\"\n" +
                "         android:checked=\"false\"\n" +
                "         android:textColor=\"@android:color/holo_red_dark\"\n" +
                "         android:textSize=\"25dp\" />\n" +
                "         \n" +
                "      <RadioButton\n" +
                "         android:layout_width=\"136dp\"\n" +
                "         android:layout_height=\"wrap_content\"\n" +
                "         android:text=\"HTML\"\n" +
                "         android:id=\"@+id/radioButton3\"\n" +
                "         android:layout_gravity=\"center_horizontal\"\n" +
                "         android:checked=\"false\"\n" +
                "         android:textSize=\"25dp\"\n" +
                "         android:textColor=\"@android:color/holo_red_dark\" />\n" +
                "         \n" +
                "   </RadioGroup>\n" +
                "      \n" +
                "</RelativeLayout>\n";

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
