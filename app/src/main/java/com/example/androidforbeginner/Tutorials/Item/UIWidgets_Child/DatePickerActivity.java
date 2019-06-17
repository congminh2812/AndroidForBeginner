package com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class DatePickerActivity extends AppCompatActivity {

    TextView rowOneTextView, rowTwoTextView, codeTextView, code2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        setTitle(getString(R.string.datepicker));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        codeTextView = findViewById(R.id.code);
        code2TextView = findViewById(R.id.code2);

        String rowOne = "<p><b>Android Date Picker</b> allows you to select the date consisting of day, month and year in your custom user interface. For this functionality android provides DatePicker and DatePickerDialog components.</p>";
        String rowTwo = "<h3><b>Example</b></h3>" +
                "Here is an example demonstrating the use of DatePickerDialog class. It creates a basic Date Picker application that allows you to set the Date using DatePicker Widget";

        String code = "public class MainActivity extends Activity {\n" +
                "   private DatePicker datePicker;\n" +
                "   private Calendar calendar;\n" +
                "   private TextView dateView;\n" +
                "   private int year, month, day;\n" +
                "\n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "      \n" +
                "      dateView = (TextView) findViewById(R.id.textView3);\n" +
                "      calendar = Calendar.getInstance();\n" +
                "      year = calendar.get(Calendar.YEAR);\n" +
                "      \n" +
                "      month = calendar.get(Calendar.MONTH);\n" +
                "      day = calendar.get(Calendar.DAY_OF_MONTH);\n" +
                "      showDate(year, month+1, day);\n" +
                "   }\n" +
                "\n" +
                "   @SuppressWarnings(\"deprecation\")\n" +
                "   public void setDate(View view) {\n" +
                "      showDialog(999);\n" +
                "      Toast.makeText(getApplicationContext(), \"ca\", \n" +
                "         Toast.LENGTH_SHORT)\n" +
                "      .show();\n" +
                "   }\n" +
                "\n" +
                "   @Override\n" +
                "   protected Dialog onCreateDialog(int id) {\n" +
                "      // TODO Auto-generated method stub\n" +
                "      if (id == 999) {\n" +
                "         return new DatePickerDialog(this, \n" +
                "            myDateListener, year, month, day);\n" +
                "      }\n" +
                "      return null;\n" +
                "   }\n" +
                "\n" +
                "   private DatePickerDialog.OnDateSetListener myDateListener = new \n" +
                "      DatePickerDialog.OnDateSetListener() {\n" +
                "      @Override\n" +
                "      public void onDateSet(DatePicker arg0, \n" +
                "         int arg1, int arg2, int arg3) {\n" +
                "         // TODO Auto-generated method stub\n" +
                "         // arg1 = year\n" +
                "         // arg2 = month\n" +
                "         // arg3 = day\n" +
                "         showDate(arg1, arg2+1, arg3);\n" +
                "      }\n" +
                "   };\n" +
                "\n" +
                "   private void showDate(int year, int month, int day) {\n" +
                "      dateView.setText(new StringBuilder().append(day).append(\"/\")\n" +
                "      .append(month).append(\"/\").append(year));\n" +
                "   }\n" +
                "}";
        String code2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout \n" +
                "   xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "   android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\"\n" +
                "   android:paddingBottom=\"@dimen/activity_vertical_margin\"\n" +
                "   android:paddingLeft=\"@dimen/activity_horizontal_margin\"\n" +
                "   android:paddingRight=\"@dimen/activity_horizontal_margin\"\n" +
                "   android:paddingTop=\"@dimen/activity_vertical_margin\"\n" +
                "   tools:context=\".MainActivity\" >\n" +
                "\n" +
                "   <Button\n" +
                "      android:id=\"@+id/button1\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_alignParentTop=\"true\"\n" +
                "      android:layout_centerHorizontal=\"true\"\n" +
                "      android:layout_marginTop=\"70dp\"\n" +
                "      android:onClick=\"setDate\"\n" +
                "      android:text=\"@string/date_button_set\" />\n" +
                "\n" +
                "   <TextView\n" +
                "      android:id=\"@+id/textView1\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_alignParentTop=\"true\"\n" +
                "      android:layout_centerHorizontal=\"true\"\n" +
                "      android:layout_marginTop=\"24dp\"\n" +
                "      android:text=\"@string/date_label_set\"\n" +
                "      android:textAppearance=\"?android:attr/textAppearanceMedium\" />\n" +
                "\n" +
                "   <TextView\n" +
                "      android:id=\"@+id/textView2\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_below=\"@+id/button1\"\n" +
                "      android:layout_marginTop=\"66dp\"\n" +
                "      android:layout_toLeftOf=\"@+id/button1\"\n" +
                "      android:text=\"@string/date_view_set\"\n" +
                "      android:textAppearance=\"?android:attr/textAppearanceMedium\" />\n" +
                "\n" +
                "   <TextView\n" +
                "      android:id=\"@+id/textView3\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_alignRight=\"@+id/button1\"\n" +
                "      android:layout_below=\"@+id/textView2\"\n" +
                "      android:layout_marginTop=\"72dp\"\n" +
                "      android:text=\"@string/date_selected\"\n" +
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
