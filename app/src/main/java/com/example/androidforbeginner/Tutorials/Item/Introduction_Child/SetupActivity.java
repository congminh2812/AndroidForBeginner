package com.example.androidforbeginner.Tutorials.Item.Introduction_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class SetupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView rowOneTextView1,rowOneTextView2,rowOneTextView3,rowOneTextView4,rowOneTextView5,rowOneTextView6;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        setTitle(getString(R.string.setup).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_setup);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView1 = findViewById(R.id.row_one_text_view);
        rowOneTextView2 = findViewById(R.id.row_one_text_view2);
        rowOneTextView3 = findViewById(R.id.row_one_text_view3);
        rowOneTextView4 = findViewById(R.id.row_one_text_view4);
        rowOneTextView5 = findViewById(R.id.row_one_text_view5);
        rowOneTextView6 = findViewById(R.id.row_one_text_view6);

        String rowOne1 = "<h3><b>Setup and Installation of Android Studio</b></h3>" +
                "Once you have finished with installing JDK and downloading Android Studio IDE setup file, " +
                "double click on the .exe file (setup file) of the Android Studio." +
                " It'll prepare the file for setup and will ask you for the location where you want to install it, as shown in image below.";
        String rowOne2 = "Select an appropriate location and click on Next button.";
        String rowOne3 = "Click on Install button. It will start installing as shown below.";
        String rowOne4 = "Click on Next button.";
        String rowOne5 = "Android Studio has been installed directly and it is ready for use. Click on finish button and Android Studio will open.";
        String rowOne6 = "Android Studio will automatically get the location of the Android SDK if it is in the same location as itself." +
                " But if it fails to discover, then it'll ask you to browse to the Android SDK's location.<br>" +
                "In the next tutorial, we will talk about the Android SDK manager and the additional packages required in the SDK" +
                " manager to complete the system setup for development.";

        rowOneTextView1.setText(android.text.Html.fromHtml(rowOne1));
        rowOneTextView2.setText(android.text.Html.fromHtml(rowOne2));
        rowOneTextView3.setText(android.text.Html.fromHtml(rowOne3));
        rowOneTextView4.setText(android.text.Html.fromHtml(rowOne4));
        rowOneTextView5.setText(android.text.Html.fromHtml(rowOne5));
        rowOneTextView6.setText(android.text.Html.fromHtml(rowOne6));
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
