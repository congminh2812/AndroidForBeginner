package com.example.androidforbeginner.Tutorials.Item.Introduction_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class VirtualActivity extends AppCompatActivity {
    TextView rowOneTextView,rowTwoTextView,rowThreeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtual);
        setTitle(getString(R.string.virtual).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_virtual);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        rowThreeTextView = findViewById(R.id.row_three_text_view);

        String rowOne = "The official language for Android App Development is <b>Java</b>.<br>" +
                "<b>JDK</b>(Java Development Kit) will compile our Java code and it is going to produce a file called <b>.class</b>" +
                " file. Also called as Java bytecode." +
                "<p><u><font color='blue'>Java bytecode is platform independent code because it can run on multiple platforms.</font></u></p>";
        String rowTwo = "In android Dex Compiler takes all the .class file as input and it is going to produce a single lightweight file called <b>.dex</b> file." +
                "<p><b>Note:</b><br>Dex Compiler produces a single .dex file for multiple .class file.</p>" +
                "<p><font color='blue'><u>Dex is termed as Dalvik Executable Code.</u></font></p>" +
                "<p>DVM takes this single .dex file as input and generates the final machine code.</p>" +
                "<p>With Android Version 2.2 (Froyo) Google introduced <b>JIT (Just in Time)</b> compilation in Dalvik.</p>" +
                "<p>Till Android Version 5.0 (Lollipop) Dalvik was the runtime use by Android which is being replaced by <b>ART (Android Run Time)</b> in later version.</p>";
        String rowThree = "<b>Why do we need a .dex file when actually even .class file is platform independent?</b><br>" +
                "1. DVM is Register based which is designed to run on low memory unlike JVM which is Stack based. Thus through DVM we are able to" +
                " achieve small memory footprint with higher battery life.<br>" +
                "2. Java tools are free but the JVM is not free, so the android developers from google have made their own virtual machine and made it as free.";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        rowTwoTextView.setText(android.text.Html.fromHtml(rowTwo));
        rowThreeTextView.setText(android.text.Html.fromHtml(rowThree));
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
