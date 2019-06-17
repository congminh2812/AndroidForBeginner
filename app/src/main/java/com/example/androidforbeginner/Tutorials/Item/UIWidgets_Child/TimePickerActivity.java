package com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class TimePickerActivity extends AppCompatActivity {

    TextView rowOneTextView, rowTwoTextView, codeTextView, code2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        setTitle(getString(R.string.timepicker));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        codeTextView = findViewById(R.id.code);
        code2TextView = findViewById(R.id.code2);

        String rowOne = "<p><b>Android Time Picker</b> allows you to select the time of day in either 24 hour or AM/PM mode. The time consists of hours, minutes and clock format. Android provides this functionality through TimePicker class.</p>";
        String rowTwo = "<h3><b>Example</b></h3>" +
                "Here is an example demonstrating the use of TimePicker class. It creates a basic Time Picker application that allows you to set the time using TimePicker Widget";

        String code = "public class MainActivity extends Activity {\n" +
                "   private TimePicker timePicker1;\n" +
                "   private TextView time;\n" +
                "   private Calendar calendar;\n" +
                "   private String format = \"\";\n" +
                "\n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "      \n" +
                "      timePicker1 = (TimePicker) findViewById(R.id.timePicker1);\n" +
                "      time = (TextView) findViewById(R.id.textView1);\n" +
                "      calendar = Calendar.getInstance();\n" +
                "      \n" +
                "      int hour = calendar.get(Calendar.HOUR_OF_DAY);\n" +
                "      int min = calendar.get(Calendar.MINUTE);\n" +
                "      showTime(hour, min);\n" +
                "   }\n" +
                "\n" +
                "   public void setTime(View view) {\n" +
                "      int hour = timePicker1.getCurrentHour();\n" +
                "      int min = timePicker1.getCurrentMinute();\n" +
                "      showTime(hour, min);\n" +
                "   }\n" +
                "\n" +
                "   public void showTime(int hour, int min) {\n" +
                "      if (hour == 0) {\n" +
                "         hour += 12;\n" +
                "         format = \"AM\";\n" +
                "      } else if (hour == 12) {\n" +
                "         format = \"PM\";\n" +
                "      } else if (hour > 12) {\n" +
                "         hour -= 12;\n" +
                "         format = \"PM\";\n" +
                "      } else {\n" +
                "         format = \"AM\";\n" +
                "      }\n" +
                "\t\t\n" +
                "      time.setText(new StringBuilder().append(hour).append(\" : \").append(min)\n" +
                "      .append(\" \").append(format));\n" +
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
                "      android:text=\"@string/time_pick\"\n" +
                "      android:textAppearance=\"?android:attr/textAppearanceMedium\" />\n" +
                "      \n" +
                "   <Button\n" +
                "      android:id=\"@+id/set_button\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_alignParentBottom=\"true\"\n" +
                "      android:layout_centerHorizontal=\"true\"\n" +
                "      android:layout_marginBottom=\"180dp\"\n" +
                "      android:onClick=\"setTime\"\n" +
                "      android:text=\"@string/time_save\" />\n" +
                "      \n" +
                "   <TimePicker\n" +
                "      android:id=\"@+id/timePicker1\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_above=\"@+id/set_button\"\n" +
                "      android:layout_centerHorizontal=\"true\"\n" +
                "      android:layout_marginBottom=\"24dp\" />\n" +
                "      \n" +
                "   <TextView\n" +
                "      android:id=\"@+id/textView3\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_alignLeft=\"@+id/timePicker1\"\n" +
                "      android:layout_alignTop=\"@+id/set_button\"\n" +
                "      android:layout_marginTop=\"67dp\"\n" +
                "      android:text=\"@string/time_current\"\n" +
                "      android:textAppearance=\"?android:attr/textAppearanceMedium\" />\n" +
                "      \n" +
                "   <TextView\n" +
                "      android:id=\"@+id/textView1\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_below=\"@+id/textView3\"\n" +
                "      android:layout_centerHorizontal=\"true\"\n" +
                "      android:layout_marginTop=\"50dp\"\n" +
                "      android:text=\"@string/time_selected\"\n" +
                "      android:textAppearance=\"?android:attr/textAppearanceMedium\" />\n" +
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
