package com.example.androidforbeginner.Tutorials.Item.Layouts_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class LinearActivity extends AppCompatActivity {
    TextView rowOneTextView,rowTwoTextView,rowThreeTextView,code1TextView,code2TextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        setTitle(getString(R.string.linear));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        rowThreeTextView = findViewById(R.id.row_three_text_view);
        code1TextView = findViewById(R.id.code_linear);
        code2TextView = findViewById(R.id.code_linear2);

        String rowOne = "<p><b>LinearLayout</b> is a view group that aligns all children in either vertically or horizontally.</p>";
        String rowTwo = "<b>LinearLayout Horizontal:</b><br />\n" +
                "    attribute: <font color=\"blue\">android:orientation=\"horizontal\"</font>";
        String rowThree = "<b>LinearLayout Vertical:</b><br />\n" +
                "    attribute: <font color=\"blue\">android:orientation=\"vertical\"</font>";
        String code1 = "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   android:layout_width=\"fill_parent\"\n" +
                "   android:layout_height=\"fill_parent\"\n" +
                "   android:orientation=\"vertical\" >\n" +
                "   \n" +
                "   <Button android:id=\"@+id/btnStartService\"\n" +
                "      android:layout_width=\"270dp\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"start_service\"/>\n" +
                "      \n" +
                "   <Button android:id=\"@+id/btnPauseService\"\n" +
                "      android:layout_width=\"270dp\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"pause_service\"/>\n" +
                "      \n" +
                "   <Button android:id=\"@+id/btnStopService\"\n" +
                "      android:layout_width=\"270dp\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"stop_service\"/>\n" +
                "      \n" +
                "</LinearLayout>";
        String code2 = "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   android:layout_width=\"fill_parent\"\n" +
                "   android:layout_height=\"fill_parent\"\n" +
                "   android:orientation=\"horizontal\" >\n" +
                "   \n" +
                "   <Button android:id=\"@+id/btnStartService\"\n" +
                "      android:layout_width=\"270dp\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"start_service\"/>\n" +
                "      \n" +
                "   <Button android:id=\"@+id/btnPauseService\"\n" +
                "      android:layout_width=\"270dp\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"pause_service\"/>\n" +
                "      \n" +
                "   <Button android:id=\"@+id/btnStopService\"\n" +
                "      android:layout_width=\"270dp\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:text=\"stop_service\"/>\n" +
                "      \n" +
                "</LinearLayout>";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        rowTwoTextView.setText(android.text.Html.fromHtml(rowTwo));
        rowThreeTextView.setText(android.text.Html.fromHtml(rowThree));
        code1TextView.setText(code1);
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
