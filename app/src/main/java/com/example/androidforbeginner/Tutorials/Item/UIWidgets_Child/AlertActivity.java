package com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class AlertActivity extends AppCompatActivity {

    TextView rowOneTextView, rowTwoTextView, codeTextView, code2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        setTitle(getString(R.string.alert));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        codeTextView = findViewById(R.id.code);
        code2TextView = findViewById(R.id.code2);

        String rowOne = "<p><b>Alert Dialog</b> is small window that prompts the user to a decision or enter additional information.</p>";
        String rowTwo = "<h3><b>Example</b></h3>" +
                "The following example demonstrates the use of AlertDialog in android.";

        String code = "public class MainActivity extends ActionBarActivity {\n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "   }\n" +
                "\n" +
                "   public void open(View view){\n" +
                "      AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);\n" +
                "      alertDialogBuilder.setMessage(\"Are you sure,\n" +
                "         You wanted to make decision\");\n" +
                "      alertDialogBuilder.setPositiveButton(\"yes\", \n" +
                "         new DialogInterface.OnClickListener() {\n" +
                "         @Override\n" +
                "         public void onClick(DialogInterface arg0, int arg1) {\n" +
                "            Toast.makeText(MainActivity.this,\"You clicked yes \n" +
                "               button\",Toast.LENGTH_LONG).show();\n" +
                "         }\n" +
                "      });\n" +
                "\n" +
                "      alertDialogBuilder.setNegativeButton(\"No\",new DialogInterface.OnClickListener() {\n" +
                "         Override\n" +
                "         public void onClick(DialogInterface dialog, int which) {\n" +
                "            finish();\n" +
                "         }\n" +
                "      });\n" +
                "\n" +
                "      AlertDialog alertDialog = alertDialogBuilder.create();\n" +
                "      alertDialog.show();\n" +
                "   }\n" +
                "}";
        String code2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout \n" +
                "   xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   xmlns:tools=\"http://schemas.android.com/tools\" android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\" \n" +
                "   android:paddingLeft=\"@dimen/activity_horizontal_margin\"\n" +
                "   android:paddingRight=\"@dimen/activity_horizontal_margin\"\n" +
                "   android:paddingTop=\"@dimen/activity_vertical_margin\"\n" +
                "   android:paddingBottom=\"@dimen/activity_vertical_margin\" \n" +
                "   tools:context=\".MainActivity\">\n" +
                "   \n" +
                "   <TextView\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Alert Dialog\"\n" +
                "      android:id=\"@+id/textView\"\n" +
                "      android:textSize=\"35dp\"\n" +
                "      android:layout_alignParentTop=\"true\"\n" +
                "      android:layout_centerHorizontal=\"true\" />\n" +
                "      \n" +
                "   <TextView\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Tutorialspoint\"\n" +
                "      android:id=\"@+id/textView2\"\n" +
                "      android:textColor=\"#ff3eff0f\"\n" +
                "      android:textSize=\"35dp\"\n" +
                "      android:layout_below=\"@+id/textView\"\n" +
                "      android:layout_centerHorizontal=\"true\" />\n" +
                "      \n" +
                "   <ImageView\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:id=\"@+id/imageView\"\n" +
                "      android:src=\"@drawable/abc\"\n" +
                "      android:layout_below=\"@+id/textView2\"\n" +
                "      android:layout_alignRight=\"@+id/textView2\"\n" +
                "      android:layout_alignEnd=\"@+id/textView2\"\n" +
                "      android:layout_alignLeft=\"@+id/textView\"\n" +
                "      android:layout_alignStart=\"@+id/textView\" />\n" +
                "   <Button\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Alert dialog\"\n" +
                "      android:id=\"@+id/button\"\n" +
                "      android:layout_below=\"@+id/imageView\"\n" +
                "      android:layout_alignRight=\"@+id/textView2\"\n" +
                "      android:layout_alignEnd=\"@+id/textView2\"\n" +
                "      android:layout_marginTop=\"42dp\"\n" +
                "      android:onClick=\"open\"\n" +
                "      android:layout_alignLeft=\"@+id/imageView\"\n" +
                "      android:layout_alignStart=\"@+id/imageView\" />\n" +
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
