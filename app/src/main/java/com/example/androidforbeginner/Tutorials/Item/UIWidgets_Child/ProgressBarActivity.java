package com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class ProgressBarActivity extends AppCompatActivity {

    TextView rowOneTextView, rowTwoTextView, codeTextView, code2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        setTitle(getString(R.string.progress));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        codeTextView = findViewById(R.id.code);
        code2TextView = findViewById(R.id.code2);

        String rowOne = "<p><b>Progress Bars</b> are used to show progress of a task. For example, when you are uploading or downloading something from the internet, it is better to show the progress of download/upload to the user.</p>";
        String rowTwo = "<h3><b>Example</b></h3>" +
                "This example demonstrates the horizontal use of the progress dialog which is in fact a progress bar. It display a progress bar on pressing the button.";

        String code = "public class MainActivity extends ActionBarActivity {\n" +
                "   Button b1;\n" +
                "   private ProgressDialog progress;\n" +
                "   \n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "      b1 = (Button) findViewById(R.id.button2);\n" +
                "   }\n" +
                "   \n" +
                "   public void download(View view){\n" +
                "      progress=new ProgressDialog(this);\n" +
                "      progress.setMessage(\"Downloading Music\");\n" +
                "      progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);\n" +
                "      progress.setIndeterminate(true);\n" +
                "      progress.setProgress(0);\n" +
                "      progress.show();\n" +
                "      \n" +
                "      final int totalProgressTime = 100;\n" +
                "      final Thread t = new Thread() {\n" +
                "         @Override\n" +
                "         public void run() {\n" +
                "            int jumpTime = 0;\n" +
                "            \n" +
                "            while(jumpTime < totalProgressTime) {\n" +
                "               try {\n" +
                "                  sleep(200);\n" +
                "                  jumpTime += 5;\n" +
                "                  progress.setProgress(jumpTime);\n" +
                "               } catch (InterruptedException e) {\n" +
                "                  // TODO Auto-generated catch block\n" +
                "                  e.printStackTrace();\n" +
                "               }\n" +
                "            }\n" +
                "         }\n" +
                "      };\n" +
                "      t.start();\n" +
                "   }\n" +
                "}";
        String code2 = "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   xmlns:tools=\"http://schemas.android.com/tools\" android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\" android:paddingLeft=\"@dimen/activity_horizontal_margin\"\n" +
                "   android:paddingRight=\"@dimen/activity_horizontal_margin\"\n" +
                "   android:paddingTop=\"@dimen/activity_vertical_margin\"\n" +
                "   android:paddingBottom=\"@dimen/activity_vertical_margin\" tools:context=\".MainActivity\">\n" +
                "   \n" +
                "   <TextView\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:id=\"@+id/textView\"\n" +
                "      android:layout_alignParentTop=\"true\"\n" +
                "      android:layout_centerHorizontal=\"true\"\n" +
                "      android:textSize=\"30dp\"\n" +
                "      android:text=\"Progress bar\" />\n" +
                "      \n" +
                "   <TextView\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Tutorials Point\"\n" +
                "      android:id=\"@+id/textView2\"\n" +
                "      android:layout_below=\"@+id/textView\"\n" +
                "      android:layout_centerHorizontal=\"true\"\n" +
                "      android:textSize=\"35dp\"\n" +
                "      android:textColor=\"#ff16ff01\" />\n" +
                "      \n" +
                "   <Button\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"Download\"\n" +
                "      android:onClick=\"download\"\n" +
                "      android:id=\"@+id/button2\"\n" +
                "      android:layout_marginLeft=\"125dp\"\n" +
                "      android:layout_marginStart=\"125dp\"\n" +
                "      android:layout_centerVertical=\"true\" />\n" +
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
