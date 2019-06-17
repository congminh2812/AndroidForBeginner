package com.example.androidforbeginner.Tutorials.Item.Structure_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class ModuleActivity extends AppCompatActivity {
    TextView rowOneTextView,rowTwoTextView1,rowTwoTextView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);
        setTitle(getString(R.string.module).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_module);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView1 = findViewById(R.id.row_two_text_view);
        rowTwoTextView2 = findViewById(R.id.row_two_text_view_2);

        String rowOne = "<b>App:</b><br>" +
                "When you create a new project , the default module name is \"<b>app</b>\". ";
        String rowTwo1= "A module is a collection of source files and build settings that allow you to divide your project into" +
                " discrete units of functionality. Your project can have one or many modules and " +
                "one module may use another module as a dependency." +
                " Each module can be independently built, tested, and debugged." +
                "<p>Provides a container for your app's source code, resource files," +
                " and app level settings such as the module-level build file and Android Manifest file.</p>" +
                "<p><b>How to add a new module to your project?</b><br>" +
                "Click File > New > New Module</p>";
        String rowTwo2 = "In the Create New Module window, Android Studio offers the following types of app modules:<br>" +
                "<ul>" +
                    "<li> Phone & Tablet Module<li>" +
                    "<li> Wear OS Module</li>" +
                    "<li> Android TV Module</li>" +
                    "<li> Glass Module</li>" +
                "</ul><br>" +
                "They each provide essential files and some code templates that are appropriate for the corresponding app or device type.";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        rowTwoTextView1.setText(android.text.Html.fromHtml(rowTwo1));
        rowTwoTextView2.setText(android.text.Html.fromHtml(rowTwo2));
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
