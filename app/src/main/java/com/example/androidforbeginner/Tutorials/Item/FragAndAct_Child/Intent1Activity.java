package com.example.androidforbeginner.Tutorials.Item.FragAndAct_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class Intent1Activity extends AppCompatActivity {
    TextView textView1,textView2,textView3,code1,code2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);
        setTitle(getString(R.string.intent));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textView1 = findViewById(R.id.row_one_text_view);
        textView2 = findViewById(R.id.row_two_text_view);
        textView3 = findViewById(R.id.row_three_text_view);
        code1 = findViewById(R.id.code);
        code2 = findViewById(R.id.code2);

        String rowOne = "<p><b>What is an Intent?</b><br>  An Intent is a messaging object you can use to request an action from another app component </p>\n" +
                "<p>It's a way to communicate between Android components (not just activities) to request an action from and by different components. It's like a message that Android listens for and react accordingly by identifying and invoking the targeted app's appropriate component (like an Activity, Service, Content Provider, etc.).The components can be within that same application or some other app.</p>\n" +
                "<p>If multiple apps are capable of responding to the message then Android provides the user with a list of those apps from which a choice can be made. It is known as Chooser.</p>\n" +
                "<p><b>Uses of Intents:</b> <br>\n" +
                "\t<ul>\n" +
                "    \t<li>Starting an Activity</li>\n" +
                "    \t<li>Starting a service</li>\n" +
                "    \t<li>Delivering a broadcast</li>\n" +
                "    </ul>\n" +
                "</p>\n" +
                "<p><b>Types of Intent:-</b><br>\n" +
                "1. Explicit Intent:  <br>While creating an Intent object when we explicitly specify the target component name(e.g Package name or Class name) directly in the intent, its an explicit intent. E.g.\n" +
                "</p>";
        String rowTwo = "<p>Thus specifying that we want to navigate to LoginActivity.class </p>\n" +
                "<p>2. Implicit Intent: <br> Implicit Intent doesn't specify the component.they must include enough information for the system to determine which of the available components is best to run for that intent. E.g. </p>";
        String rowThree = "Thus asking the system to find a suitable component to run this URL.";
        String code = "Intent intent = new Intent(this, LoginActivity.class);\n" +
                " startActivity(intent); \n";
        String code22 = "Intent intent=new Intent( Intent .ACTION_VIEW);\n" +
                " intent. setData(Uri.parse(“http: //www. Javapoint.com”));\n" +
                " startActivity(intent); \n";

        textView1.setText(android.text.Html.fromHtml(rowOne));
        textView2.setText(android.text.Html.fromHtml(rowTwo));
        textView3.setText(android.text.Html.fromHtml(rowThree));
        code1.setText(code);
        code2.setText(code22);


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
