package com.example.androidforbeginner.Tutorials.Item.DataStorage_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class SharedPreferenceActivity extends AppCompatActivity {
    TextView rowOneTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        setTitle(getString(R.string.shared_preference));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);

        String rowOne = "Android SharedPreference:- \n" +
                "It is the simplest data storing option available in Android. It stores data in key value pairs. \n" +
                "\n" +
                "E.g. Key Value Username Arjun Password Newuser@123 location India \n" +
                "Data is stored in XML file in the directory \n" +
                "dataidata/<package-name>/shared-prefs folder \n" +
                "\n" +
                "What kind of data can be stored? Any primitive data: booleans, floats, ints, longs, and strings. This data will persist across user sessions (even if your application is killed). \n" +
                "\n" +
                "How to access them? To get a SharedPreferences object for your application, use one of two methods: \n" +
                "1. getSharedPreferences(int mode): Use this if you need multiple preferences files identified by name, which you specify with the first parameter\n" +
                " 2. getPreferences(String name,int mode): Use this if you need only one preferences file for your Activity. Because this will be the only preferences file for your Activity, you don't supply a name. \n" +
                "Modes:\n" +
                "\n" +
                "Modes refer to operating modes. Use 0 or MODE_PRIVATE for the default operation. MODE PRIVATE: Only your app can acces the file \n" +
                "MODE apps can read the file  \n" +
                "MODE_WORLD_WRITEABLE:All apps can write the file \n" +
                "MODE_MULTI_PROCESS:Multiple process can modify the same shared-prefs file. \n" +
                "MODE_WORLD_READABLE & MODE_WORLD_WRITEABLE are deprecated in current versions. \n" +
                "Uses: \n" +
                "• Check whether user is using your app \n" +
                "• Check when your app was last updated \n" +
                "• Remember user credentials \n" +
                "• Remember user settings \n" +
                "• Location caching \n" +
                "How to use shared preferences to store data? \n" +
                "1. Get a reference to a shared preference object \n" +
                "1. For a single file, call getPreferences(int mode)\n" +
                "2. For several file , call getSharedPreferences(String name,int mode) \n" +
                "2. Call the editor SharedPreference.Editor editor = shared preferences.ed it(); \n" +
                "3. Use the editor to add the data with the key editorputString(\"name7arjun\"); editor.putString(\"password7arjun@123\"); \n" +
                "4. Commit Editor changes editor.commit0 \n" +
                "How to use shared preferences to retrieve data? \n" +
                "1. Get a reference to a shared preference object 1. For a single file, call getPreferences(int mode) 2. For several file , call getSharedPreferences(String name,int mode) \n" +
                "2. Use the key provided earlier to get data \n" +
                "3. Supply default value if data is not found \n" +
                "String name = sharedPreferences.getString(\"name\":N/A\"); String password = sharedPreferences.getString(\"password\",\"N/A\");\n";

        rowOneTextView.setText(rowOne);
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
