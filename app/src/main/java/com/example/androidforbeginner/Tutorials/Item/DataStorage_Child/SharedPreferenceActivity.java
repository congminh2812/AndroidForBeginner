package com.example.androidforbeginner.Tutorials.Item.DataStorage_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class SharedPreferenceActivity extends AppCompatActivity {
    TextView rowOneTextView,codeOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        setTitle(getString(R.string.shared_preference));
        StatusBar.changingStatusBar(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        codeOne = findViewById(R.id.code1);

        String rowOne = "<b><u>Android SharedPreference:- </u></b><br>" +
                "It is the simplest data storing option available in Android. It stores data in key value pairs. <br>" +
                "<br>" +
                "E.g. Key Value Username Arjun Password Newuser@123 location India <br>" +
                "Data is stored in XML file in the directory <br>" +
                "dataidata/<package-name>/shared-prefs folder <br>" +
                "<br>" +
                "<b>What kind of data can be stored?</b> <br>" +
                "Any primitive data: booleans, floats, ints, longs, and strings." +
                " This data will persist across user sessions (even if your application is killed). <br>" +
                "<br>" +
                "<b>How to access them? </b><br>" +
                "To get a SharedPreferences object for your application, use one of two methods: <br>" +
                " 1. getSharedPreferences(int mode): Use this if you need multiple preferences files identified by name, which you specify with the first parameter<br>" +
                " 2. getPreferences(String name,int mode): Use this if you need only one preferences file for your Activity. Because this will be the only preferences file for your Activity, you don't supply a name. <br>" +
                "Modes:<br>" +
                "<br>" +
                "Modes refer to operating modes. Use 0 or <b>MODE_PRIVATE</b> for the default operation. <b>MODE PRIVATE</b>: Only your app can acces the file \n" +
                "<b>MODE</b> apps can read the file  <br>" +
                "<b>MODE_WORLD_WRITEABLE</b>:All apps can write the file <br>" +
                "<b>MODE_MULTI_PROCESS</b>:Multiple process can modify the same shared-prefs file. <br>" +
                "<b>MODE_WORLD_READABLE</b> & <b>MODE_WORLD_WRITEABLE</b> are deprecated in current versions. <br>" +
                "<b>Uses:</b> <br>" +
                "• Check whether user is using your app <br>" +
                "• Check when your app was last updated <br>" +
                "• Remember user credentials <br>" +
                "• Remember user settings <br>" +
                "• Location caching <br>" +
                "<b>How to use shared preferences to store data?</b> <br>" +
                "1. Get a reference to a shared preference object <br>" +
                " + For a single file, call getPreferences(int mode)<br>" +
                "2. For several file , call getSharedPreferences(String name,int mode) <br>" +
                " + Call the editor SharedPreference.Editor editor = shared preferences.ed it(); <br>" +
                "3. Use the editor to add the data with the key editorputString(\"name7arjun\"); editor.putString(\"password7arjun@123\"); <br>" +
                "4. Commit Editor changes editor.commit0 <br>" +
                "How to use shared preferences to retrieve data? <br>" +
                " + Get a reference to a shared preference object" +
                " - For a single file, call getPreferences(int mode) <br>" +
                " - For several file , call getSharedPreferences(String name,int mode) <br>" +
                " - Use the key provided earlier to get data <br>" +
                " + Supply default value if data is not found <br>";
                String code1 = "String name = sharedPreferences.getString(\"name\":N/A\"); \n" +
                "String password = sharedPreferences.getString(\"password\",\"N/A\");";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        codeOne.setText(code1);
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
