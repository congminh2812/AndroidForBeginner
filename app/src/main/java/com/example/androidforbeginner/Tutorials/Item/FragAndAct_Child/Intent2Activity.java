package com.example.androidforbeginner.Tutorials.Item.FragAndAct_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class Intent2Activity extends AppCompatActivity {
    TextView rowOneTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);
        setTitle(getString(R.string.intent_resolution));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);

        String rowOne = "<p><b><u>Intent Resolution: </u></b><br>The intent resolution is the process matching an Intent against all of the descriptions in the installed application packages. When you create an implicit intent, the Android system finds the appropriate component to start by comparing the contents of the intent to the intent filters declared in the manifest file of other apps on the device. If the intent matches an intent filter, the system starts that component and delivers it the Intent object. </p>\n" +
                "<p>There are three pieces of information in the Intent that are used for resolution: <br>\n" +
                "• Action<br>\n" +
                " • Data (both URI and data type).<br>\n" +
                " • Category <br>\n" +
                "</p>\n" +
                "<p>Action Test: <br> A filter can have zero or more action elements. To pass, the intent's action must match one of the filter's actions. If the filter does not have an action, then no intents get through. If the intent does not have an action, it will pass but only if the filter has at least one action. </p>\n" +
                "<p>Data Test:<br> A filter can declare zero or more data elements. Each data element can specify:  \n" +
                "MIME type — the data type of the data being matched. For example text/plain Uri - the URI is structured like this:<br>\n" +
                " < scheme>://<host>:<port>/<path>.\n" +
                " Here's an example http://myDomain:8080/abc where:\n" +
                " scheme — http host — myDomain\n" +
                " port — 8080 path — abc \n" +
                "The data test compares both the URI and the MIME type in the intent to a URI and MIME type specified in the filter. The rules are as follows: <br>\n" +
                "</p>\n" +
                "<p>The data test compares both the URI and the MIME type in the intent to a URI and MIME type specified in the filter. The rules are as follows: \n" +
                "• An intent that contains neither a URI not a MIME type passes the test only if the filter does not specify any URIs or MIME types.<br>\n" +
                " • An intent that contains a URI but no MIME type (neither explicit nor inferable from the URI) passes the test only if its URI matches the filter's URI format and the filter likewise does not specify a MIME type. <br>\n" +
                "• An intent that contains a MIME type but not a URI passes the test only if the filter lists the same MIME type and does not specify a URI format.\n" +
                " • An intent that contains both a URI and a MIME type (either explicit or inferable from the URI) passes the MIME type part of the test only if that type matches a type listed in the filter. It passes the URI part of the test either if its URI matches a URI in the filter or if it has a content or file: URI and the filter does not specify a URI. In other words, a component is presumed to support content:\n" +
                "or file: URI and the filter does not specify a URI. In other words, a component is presumed to support content and file: data if its filter lists only a MIME type. \n" +
                "</p>\n" +
                "<p>Category Test:<br> A filter can declare zero or more category elements. To pass, every category in the intent must match a category in the filter. If the intent does not have a category, it will pass regardless of whether there are any categories in the filter. <br>\n" +
                "For example, the Android system populates the application launcher, the top-level screen that shows the applications that are available for the user to launch, by finding all the activities with intent filters that specify the \"android.intent.action.MAIN\" action and \"android.intent.category.LAUNCHER\" category (as illustrated in the previous section). It then displays the icons and labels of those activities in the launcher. Similarly, it discovers the home screen by looking for the activity with \"android.intent.category.HOME\" in its filter.\n" +
                "</p>";

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
