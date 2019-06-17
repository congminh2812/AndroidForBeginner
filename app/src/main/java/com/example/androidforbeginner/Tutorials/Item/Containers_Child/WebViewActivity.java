package com.example.androidforbeginner.Tutorials.Item.Containers_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class WebViewActivity extends AppCompatActivity {

    TextView rowOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        setTitle(getString(R.string.webview));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);

        String row1 = "WebView is a view that display web pages inside your application thus enabling our application to become webapplication. \n" +
                "Steps of using webview in our application: \n" +
                "1. Add <WebView> element to your xml layout file \n" +
                "<WebView \n" +
                "xmlns:android=\"http://schemas.android.com/apk/res/android\" \n" +
                "android:id=\"@+id/webview\" \n" +
                "android: layout_width=\"fill_parent\" \n" +
                "android:layout_height=\"fill_parent\" />\n" +
                "2. Get a reference of this view in Java file \n" +
                "WebView browser = (WebView) findViewById(R.id.webview); \n" +
                "3. Load the webview url inside webview \n" +
                "browser.loadUrl(\"https://opencv-tutorial-codes.blogspot.in\");\n" +
                "Note:-\n" +
                "If you want to access a file hosted on the server. \n" +
                "It would require an Internet Connection. \n" +
                "So you need to include its permission in AndroidManifest.xml file. \n" +
                "<manifest ... > \n" +
                "<uses-permission android:name=\"android.permission.INTERNET\" /> \n" +
                "</manifest>\n" +
                "Enabling Javascript in Webview:\n" +
                "JavaScript is disabled in a WebView by default. \n" +
                "You can enable it through the WebSettings attached to your WebView.\n" +
                "You can retrieve WebSettings with getSettings(), then enable JavaScript with setJavaScriptEnabled(). \n" +
                "WebView browser = (WebView) findViewById(R.id.webview); \n" +
                "WebSettings webSettings = browser.getSettings(); \n" +
                "WebSettings.setJavaScriptEnabled(true);\n" +
                "\n";

        rowOne.setText(row1);
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
