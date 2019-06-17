package com.example.androidforbeginner.Tutorials.Item.FragAndAct_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class LifeCycleActivity extends AppCompatActivity {
    TextView rowOneTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        setTitle(getString(R.string.lifecycle));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);

        String rowOne = "<p><u><b>Activity:-</b> <font color=\"blue\">Activity represents a sing e screen with which a user can interact with.</font></u></p>\n" +
                "<p>For a <font color=\"blue\"><u>.java</u></font> class to qualify as an Activity it should extend the Activity class. Activities in the system are managed as an activity stack. </p>\n" +
                "<p>When a new activity is started, it is placed on the top of the stack and becomes the running activity. The previous activity always remains below it in the stack, and will not come to the foreground again until the new activity exits.</p>\n" +
                " <hr />\n" +
                "<p><b><u>An activity essentially has 4 states:-</u></b><br />\n" +
                "\n" +
                "1. <b>Foreground State:</b>  If an activity is in the foreground of the screen (at the top of the stack), it is active or running. </p>\n" +
                "\n" +
                "<p>2. <b>Paused State:</b>  If an activity has lost focus but is still visible (that is, a new non-full-sized or transparent activity has focus on top of your activity e.g. Opening a Dialog Box), it is in paused state. A paused activity is completely alive (it maintains all state and member information and remains attached to the window manager), but can be killed by the system in extreme low memory situations. </p>\n" +
                "<hr />" +
                "\n" +
                "<p>3. <b>Background State:</b><br />  If an activity is completely obscured by another activity, it is stopped. It still retains all state and member information, however, it is no longer visible to the user so its window is hidden and it will often be killed by the system when memory is needed elsewhere. </p>\n" +
                "<p>4. <b>Destroyed State: </b><br />\n" +
                "Is  paused or stopped the system If an activity Is P71 memo, by either asking it to finish ,or simply killing its process. When it displayed again to the user, It must be completely restarted and restored to its previous state. </p>\n" +
                "<hr />" +
                "<p><b>Activity Life Cycle Methods:</b></p>\n" +
                " <p><b>onCreate():</b><br />\n" +
                "Called when  the activity Is first created. This this is where you should do all of your normal static set up : create views, bind data to lists, etc.  This method also provides you with a Bundle containing the activity’s previously frozen state, if there was one. Always followed by onStart().</p>\n" +
                "<p><b>onRestart():</b><br />\n" +
                "Called after tour activity has been stopped, prior to it being started again.\n" +
                "Always followed by onStart().</p>\n" +
                "<p><b>onStart():</b><br />\n" +
                "Called when the activity is becoming visible to the user.\n" +
                "Followed by onResume() If the activity comes to the foreground, or onStop() if it becomes hidden.</p>\n" +
                "<p><b>onResume():</b><br /> Called when the activity will start interacting with the user. At this point your activity is at the top of the activity stack, with user input going to it. Always followed by onPause0. </p>\n" +
                "<p><b>onPause(): </b><br />Called when the system is about to start resuming a previous activity. The paused activity does not receive user input and cannot execute any code . Followed by either onResume0 if the activity returns back to the front, or onStop() if it becomes invisible to the user. \n" +
                "onStop(): Called when the activity is no longer visible to the user, because another activity has been resumed and is covering this one. This may happen either because a new activity is being started, an existing one is being brought in front of this one, or this one is being destroyed. Followed by either onRestart0 if this activity is coming back to interact with the user, or onDestroy0 if this activity is going away. <p>\n" +
                "<p><b>onDestroy():</b><br /> The final call you receive before your activity is destroyed. This can happen either because the activity is finishing (someone called finish() on it, or because the system is temporarily destroying this instance of the activity to save space.<p>";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
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
