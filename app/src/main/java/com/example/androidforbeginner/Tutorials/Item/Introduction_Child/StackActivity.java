package com.example.androidforbeginner.Tutorials.Item.Introduction_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class StackActivity extends AppCompatActivity {
    TextView rowOneTextView,rowTwoTextView,rowTwo2TextView,rowThreeTextView,rowFourTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);
        setTitle(getString(R.string.software_stack).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_stack);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        rowTwo2TextView = findViewById(R.id.row_two_text_view_2);
        rowThreeTextView = findViewById(R.id.row_three_text_view);
        rowFourTextView = findViewById(R.id.row_four_text_view);

        String rowOne = "<font color=\\\"blue\\\"><b><u>Android Software Stack:</u></b></font>";
        String rowTwo = "<b>Operating System:</b><br>In Android,the Operating System is <b>Linux Kernel.</b><br>" +
                "You can find the Linux kernel version running on your device under \"About phone\" or \"About table\"" +
                " in Android's Settings";
        String rowTwo2 = "<u>Functions of Linux Kernel/Operating System:</u>"+
                "<ul>" +
                    "<li> &ensp;Memory Management:<br>Allocate a memory when a specific file is deleted etc.</li>" +
                    "<li> &ensp;Power Management:<br>Providing power to various devices like bluetooth,camera etc.</li>" +
                    "<li> &ensp;Resource Management:<br>It provides resource to each process, thus providing the ability to do multiple" +
                    "operations at the same time.i.e Surfing Internet,Listening Songs etc.</li>" +
                    "<li> &ensp;Driver Management:<br>It handles installation of various drivers.</li>" +
                "</ul>";
        String rowThree = "<b><p>MiddleWare:</p></b>" +
                "<ol>" +
                    "<li>" +
                        "<b>Native Applications:</b><br>Just by using Java we cannot interact with native" +
                        " applications. (Here native applications means that programs written in some other languages like C,C++,Assembly which are specific" +
                        " to hardware and operating system).Thus we need the support of native libraries for interacting with such low level media components." +
                    "</li>" +
                    "<li>" +
                        "<b>Application Framework:</b><br>" +
                        "The android framework is the set of API's that allow developers to quickly and easily write apps for android phones." +
                        "For e.g we need to guess the state of a wifi. Then rather than writing huge amounts of code for accessing wifi we can just" +
                        "include a class called wifiManger which would look upon all the tasks related to wifi. Thus simple saying The Application" +
                        " Framework layer provides many higher-level services to applications in the form of Java classes. Application developers" +
                        " are allowed to make use of these services in their applications."+
                    "</li>" +
                    "<li>" +
                        "<b>Android Runtime:</b>" +
                        "It comprises of Dalvik Virtual Machine and Core Libraries. <br>Which we will be covering in next Section."+
                    "</li>" +
                "</ol>";
        String rowFour = "<b>Applications:</b><br>" +
                "Applications layer is the top most layer of Android Architecture. All applications using android framework uses android runtime and " +
                "libraries. While android runtime and native libraries are using Linux Kernel.";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        rowTwoTextView.setText(android.text.Html.fromHtml(rowTwo));
        rowTwo2TextView.setText(android.text.Html.fromHtml(rowTwo2));
        rowThreeTextView.setText(android.text.Html.fromHtml(rowThree));
        rowFourTextView.setText(android.text.Html.fromHtml(rowFour));
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
