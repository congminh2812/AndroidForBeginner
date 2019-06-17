package com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class ImageButtonActivity extends AppCompatActivity {

    TextView rowOneTextView, rowTwoTextView, codeTextView, code2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);
        setTitle(getString(R.string.image_button));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        codeTextView = findViewById(R.id.code);
        code2TextView = findViewById(R.id.code2);

        String rowOne = "<p><b>ImageButton</b> is an AbsoluteLayout which enables you to specify the exact location of its children. " +
                "This shows a button with an image (instead of text) that can be pressed or clicked by the user.</p>";
        String rowTwo = "<h3><b>Example</b></h3>" +
                "This example will take you through simple steps to show how to create" +
                " your own Android application using Linear Layout and ImageButton.";

        String code = "public class MainActivity extends Activity {\n" +
                "   ImageButton imgButton;\n" +
                "   \n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "      \n" +
                "      imgButton =(ImageButton)findViewById(R.id.imageButton);\n" +
                "      imgButton.setOnClickListener(new View.OnClickListener() {\n" +
                "         @Override\n" +
                "         public void onClick(View v) {\n" +
                "            Toast.makeText(getApplicationContext(),\"You download is \n" +
                "               resumed\",Toast.LENGTH_LONG).show();\n" +
                "         }\n" +
                "      });\n" +
                "   }\n" +
                "}";
        String code2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout \n" +
                "   xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   xmlns:tools=\"http://schemas.android.com/tools\" android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\" android:paddingLeft=\"@dimen/activity_horizontal_margin\"\n" +
                "   android:paddingRight=\"@dimen/activity_horizontal_margin\"\n" +
                "   android:paddingTop=\"@dimen/activity_vertical_margin\"\n" +
                "   android:paddingBottom=\"@dimen/activity_vertical_margin\" \n" +
                "   tools:context=\".MainActivity\">\n" +
                "   \n" +
                "   <TextView android:text=\"Tutorials Point\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:textSize=\"30dp\"\n" +
                "      android:layout_alignParentTop=\"true\"\n" +
                "      android:layout_alignRight=\"@+id/imageButton\"\n" +
                "      android:layout_alignEnd=\"@+id/imageButton\" />\n" +
                "      \n" +
                "   <ImageButton\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:id=\"@+id/imageButton\"\n" +
                "      android:layout_centerVertical=\"true\"\n" +
                "      android:layout_centerHorizontal=\"true\"\n" +
                "      android:src=\"@drawable/abc\"/>\n" +
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
