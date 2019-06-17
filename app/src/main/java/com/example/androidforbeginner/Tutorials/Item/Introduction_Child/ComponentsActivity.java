package com.example.androidforbeginner.Tutorials.Item.Introduction_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class ComponentsActivity extends AppCompatActivity {
    TextView rowOneTextView,rowTwoTextView,rowThreeTextView,rowFourTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);
        setTitle(getString(R.string.android_components).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_components);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        rowThreeTextView = findViewById(R.id.row_three_text_view);
        rowFourTextView = findViewById(R.id.row_four_text_view);

        String rowOne = "<font color=\\\"blue\\\"><u><p><b>Activities:-</b></p></u></font>" +
                "An activity represents a single screen with a user interface,in-short Activity performs actions on the screen. " +
                "For example, an email application might have one activity that shows a list of new emails, another activity to " +
                "compose an email, and another activity for reading emails. If an application has more than one activity, " +
                "then one of them should be marked as the activity that is presented when the application is launched.";
        String rowTwo = "<font color=\\\"blue\\\"><u><p><b>Services:-</b></p></u></font>" +
                "A service is a component that runs in the background to perform long-running operations. " +
                "For example, a service might play music in the background while the user is in a different application, " +
                "or it might fetch data over the network without blocking user interaction with an activity.";
        String rowThree = "<font color=\\\"blue\\\"><u><p><b>Broadcast Receivers:-</b></p></u></font>" +
                "Broadcast Receivers simply respond to broadcast messages from other applications or from the system." +
                " For example, applications can also initiate broadcasts to let other applications know that some data has been " +
                "downloaded to the device and is available for them to use, so this is broadcast receiver who will intercept this " +
                "communication and will initiate appropriate action." +
                "<br>" +
                "A broadcast receiver is implemented as a subclass of BroadcastReceiver class and each message is broadcaster as an Intent object.";
        String rowFour = "<font color=\\\"blue\\\"><u><p><b>Content Providers:-</b></p></u></font>" +
                "A content provider component supplies data from one application to others on request. Such requests are handled by the methods of" +
                " the ContentResolver class." +
                " The data may be stored in the file system, the database or somewhere else entirely.<br>" +
                "A content provider is implemented as a subclass of ContentProvider class and must implement a standard set of APIs " +
                "that enable other applications to perform transactions.";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        rowTwoTextView.setText(android.text.Html.fromHtml(rowTwo));
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
