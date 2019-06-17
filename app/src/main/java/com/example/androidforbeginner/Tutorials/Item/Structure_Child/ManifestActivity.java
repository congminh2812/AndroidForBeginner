package com.example.androidforbeginner.Tutorials.Item.Structure_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class ManifestActivity extends AppCompatActivity {
    TextView rowOneTextView1,rowOneTextView2,codeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manifest);
        setTitle(getString(R.string.manifest).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_manifest);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView1 = findViewById(R.id.row_one_text_view);
        rowOneTextView2 = findViewById(R.id.row_one_text_view2);
        codeTextView = findViewById(R.id.code_manifest_text_view);

        String rowOne1 = "<p><b>manifest:-</b><br>" +
                "It contains the <b>AndroidManifest.xml</b> file</p>" +
                "<p>AndroidManifest.xml describes the fundamental characteristics of an app and each of its components.</p>" +
                "<p>It works as an interface between your Android OS and your application, so if you forget to declare your" +
                " components in this file the it will not be considered by the OS.</p>" +
                "The default AndroidManifest.xml files looks like this:";
        String code = "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    package=\"com.example.androidforbeginner\">\n" +
                "\n" +
                "    <application\n" +
                "        android:allowBackup=\"true\"\n" +
                "        android:icon=\"@mipmap/ic_launcher\"\n" +
                "        android:label=\"@string/app_name\"\n" +
                "        android:roundIcon=\"@mipmap/ic_launcher_round\"\n" +
                "        android:supportsRtl=\"true\"\n" +
                "        android:theme=\"@style/AppTheme.NoAcTionBar\">\n" +
                "        <activity\n" +
                "            android:name=\".Tutorials.Item.IntroductionActivity\"\n" +
                "            android:theme=\"@style/AppTheme.NoAcTionBar\" />\n" +
                "        <activity\n" +
                "            android:name=\".BackgroundActivity\"\n" +
                "            android:theme=\"@style/AppTheme.NoAcTionBar\">\n" +
                "            <intent-filter>\n" +
                "                <action android:name=\"android.intent.action.MAIN\" />\n" +
                "\n" +
                "                <category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                "            </intent-filter>\n" +
                "        </activity>\n" +
                "        <activity\n" +
                "            android:name=\".MainActivity\"\n" +
                "            android:theme=\"@style/AppTheme.NoAcTionBar\" />\n" +
                "    </application>\n" +
                "\n" +
                "</manifest>";
        String rowOne2 = "<p><b><u>xmlns:android</u></b><br>" +
                "Defines the Android namespace. This attribute should always be set to \"http://schemas.android.com/apk/res/android\".</p>" +
                "<p><b><u>Package:</u></b><br>" +
                "A full Java Language style package name for Android Application. It should be unique. The package name servers as a unique" +
                " identifier for the application, It's also the default name for the application process.<br>" +
                "<u>Caution:</u><br>" +
                "Once you publish your application, you cannot change the package name. The package name defines your application's identity," +
                " so if you change it, then it is considered to be different application and users of the previous version cannot " +
                "update to the new version.</p>" +
                "<p><b><u>VersionCode:</u></b><br>" +
                "It is an integer which is only userd to determine whether one version is more recent than the other, " +
                "with higher number denoting more recent versions.<br>" +
                "<u>Note:</u><br>" +
                "This value is not displayed to the user, it is used by the system to check the upgrade or downgrade relationship.<br>" +
                "<u>Warning:</u><br>" +
                "<i>The greatest possible value for versionCode is MAXINT (2147483647). However, if you upload an app with this value, " +
                "your app can't ever be updated.</i></p>" +
                "<p><b><u>versionName:</u></b><br>" +
                "This attribute can be set as a raw string or as a reference to a string resource. " +
                "The string has no other purpose than to be displayed to users.</p>" +
                "<p><b><u>android:minSdkVersion</u></b><br>" +
                "An integer designating the minimum API Level required for the application to run." +
                " The Android system will prevent the user from installing the application if the system's API Level is lowe" +
                "r than the value specified in this attribute. " +
                "You should always declare this attribute.<br>" +
                "<u>Caution:</u><br>" +
                "<i>If you do not declare this attribute, the system assumes a default value of \"1\", " +
                "which indicates that your application is compatible with all versions of Android. " +
                "If your application is not compatible with all versions (for instance, " +
                "it uses APIs introduced in API Level 3) and you have not declared the proper minSdkVersion, " +
                "then when installed on a system with an API Level less than 3," +
                " the application will crash during runtime when attempting to access the unavailable APIs. " +
                "For this reason, be certain to declare the appropriate API Level in the minSdkVersion attribute.</i></p>" +
                "<p><b><u>android:targetSdkVersion</u></b><br>" +
                "An integer designating the API Level that the application targets. If not set, " +
                "the default value equals that given to minSdkVersion.\n" +
                "This attribute informs the system that you have tested against the target version and the system should not enable any compatibility " +
                "behaviors to maintain your app's forward-compatibility with the target version. " +
                "The application is still able to run on older versions (down to minSdkVersion).</p>" +
                "<p><b>application:</b><br>" +
                "It includes all the declaration to the application. android:icon :It will point to the application icon" +
                " available under res/mipmap. The application uses the image named ic_launcher.png located in the mipmap folders.</p>" +
                "<p><b>android:allowBackup</b><br>" +
                "Whether to allow the application to participate in the backup and restore infrastructure.</p>"+
                "<p><b>android:theme</b><br>" +
                "A reference to a style resource defining a default theme for all activities in the application. " +
                "Individual activities can override the default by setting their own theme attributes.</p>" +
                "<p><b>activity:</b><br>" +
                "Declares an activity (an Activity subclass) that implements part of the application's visual user interface. " +
                "All activities must be represented by <activity> elements in the manifest file. " +
                "Any that are not declared there will not be seen by the system and will never be run.</p>" +
                "<p>The action for the intent filter is named android.intent.action.MAIN to indicate that this activity servers as the entry " +
                "point for the application. The category for the intent-filter is named android.intent.category.LAUNCHER to indicate that the application" +
                " can be launched from device's launcher icon.</p>" +
                "<p>Following is the list of tags which you will use in your manifest file to specify different Android application components:<br>" +
                "activity elements for activities<br>" +
                "service elements for services<br>" +
                "receiver elements for broadcast receivers<br>" +
                "provider elements for content providers</p>";

        rowOneTextView1.setText(android.text.Html.fromHtml(rowOne1));
        rowOneTextView2.setText(android.text.Html.fromHtml(rowOne2));
        codeTextView.setText(code);

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
