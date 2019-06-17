package com.example.androidforbeginner.Tutorials.Item.Layouts_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class TableActivity extends AppCompatActivity {
    TextView rowOneTextView,rowTwoTextView,code1TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        setTitle(getString(R.string.table));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        code1TextView = findViewById(R.id.code_linear);

        String rowOne = "<p><b>Android TableLayout</b> is going to be arranged groups of views into rows and columns. " +
                "You will use the <TableRow> element to build a row in the table. " +
                "Each row has zero or more cells; each cell can hold one View object.</p>";
        String rowTwo = "<b><u>Code:</u></b>";
        String code = "<TableLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   android:layout_width=\"fill_parent\"\n" +
                "   android:layout_height=\"fill_parent\">\n" +
                "   \n" +
                "   <TableRow\n" +
                "      android:layout_width=\"fill_parent\"\n" +
                "      android:layout_height=\"fill_parent\">\n" +
                "\t\t\n" +
                "      <TextView\n" +
                "         android:text=\"Time\"\n" +
                "         android:layout_width=\"wrap_content\"\n" +
                "         android:layout_height=\"wrap_content\"\n" +
                "         android:layout_column=\"1\" />\n" +
                "\t\t\t\n" +
                "      <TextClock\n" +
                "         android:layout_width=\"wrap_content\"\n" +
                "         android:layout_height=\"wrap_content\"\n" +
                "         android:id=\"@+id/textClock\"\n" +
                "         android:layout_column=\"2\" />\n" +
                "\t\t\t\n" +
                "   </TableRow>\n" +
                "   \n" +
                "   <TableRow>\n" +
                "\t\n" +
                "      <TextView\n" +
                "         android:text=\"First Name\"\n" +
                "         android:layout_width=\"wrap_content\"\n" +
                "         android:layout_height=\"wrap_content\"\n" +
                "         android:layout_column=\"1\" />\n" +
                "\t\t\t\n" +
                "      <EditText\n" +
                "         android:width=\"200px\"\n" +
                "         android:layout_width=\"wrap_content\"\n" +
                "         android:layout_height=\"wrap_content\" />\n" +
                "   </TableRow>\n" +
                "   \n" +
                "   <TableRow>\n" +
                "\t\n" +
                "      <TextView\n" +
                "         android:text=\"Last Name\"\n" +
                "         android:layout_width=\"wrap_content\"\n" +
                "         android:layout_height=\"wrap_content\"\n" +
                "         android:layout_column=\"1\" />\n" +
                "\t\t\t\n" +
                "      <EditText\n" +
                "         android:width=\"100px\"\n" +
                "         android:layout_width=\"wrap_content\"\n" +
                "         android:layout_height=\"wrap_content\" />\n" +
                "   </TableRow>\n" +
                "   \n" +
                "   <TableRow\n" +
                "      android:layout_width=\"fill_parent\"\n" +
                "      android:layout_height=\"fill_parent\">\n" +
                "\t\t\n" +
                "      <RatingBar\n" +
                "         android:layout_width=\"wrap_content\"\n" +
                "         android:layout_height=\"wrap_content\"\n" +
                "         android:id=\"@+id/ratingBar\"\n" +
                "         android:layout_column=\"2\" />\n" +
                "   </TableRow>\n" +
                "   \n" +
                "   <TableRow\n" +
                "      android:layout_width=\"fill_parent\"\n" +
                "      android:layout_height=\"fill_parent\"/>\n" +
                "\t\t\n" +
                "   <TableRow\n" +
                "      android:layout_width=\"fill_parent\"\n" +
                "      android:layout_height=\"fill_parent\">\n" +
                "\t\t\n" +
                "      <Button\n" +
                "         android:layout_width=\"wrap_content\"\n" +
                "         android:layout_height=\"wrap_content\"\n" +
                "         android:text=\"Submit\"\n" +
                "         android:id=\"@+id/button\"\n" +
                "         android:layout_column=\"2\" />\n" +
                "   </TableRow>\n" +
                "\n" +
                "</TableLayout>";
        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        rowTwoTextView.setText(android.text.Html.fromHtml(rowTwo));
        code1TextView.setText(code);
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
