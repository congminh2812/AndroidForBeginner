package com.example.androidforbeginner.Tutorials.Item.Containers_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class WebViewActivity extends AppCompatActivity {

    TextView rowOne,rowTwo,rowThree,rowFour,rowFive,codeOne,codeTwo,codeThree,codeFour,codeFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        setTitle(getString(R.string.webview));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rowOne = findViewById(R.id.row_one_text_view);
        rowTwo = findViewById(R.id.row_two_text_view);
        rowThree = findViewById(R.id.row_three_text_view);
        rowFour = findViewById(R.id.row_four_text_view);
        rowFive = findViewById(R.id.row_five_text_view);
        codeOne = findViewById(R.id.code1);
        codeTwo = findViewById(R.id.code2);
        codeThree = findViewById(R.id.code3);
        codeFour = findViewById(R.id.code4);
        codeFive = findViewById(R.id.code5);

        String row1 = "<b>WebView</b><br> is a view that display web pages inside your application thus enabling our application to become webapplication. <br>" +
                "<br><b>Steps of using webview in our application: </b><br>" +
                "<i>1. Add <WebView> element to your xml layout file </i>";
                String code1= "<WebView \n" +
                "   xmlns:android=\"http://schemas.android.com/apk/res/android\" \n" +
                "   android:id=\"@+id/webview\" \n" +
                "   android: layout_width=\"fill_parent\" \n" +
                "   android:layout_height=\"fill_parent\" />\n";
                String row2 = "<i>2. Get a reference of this view in Java file </i>";
                String code2 = "WebView browser = (WebView) findViewById(R.id.webview);";
                String row3 = "<i>3. Load the webview url inside webview </i>";
                String code3 = "browser.loadUrl(\"https://opencv-tutorial-codes.blogspot.in\");";
                String row4 = "<b>Note:-</b><br>" +
                "If you want to access a file hosted on the server. <br>" +
                "It would require an Internet Connection. <br>" +
                "So you need to include its permission in AndroidManifest.xml file. ";
                String code4 = "<manifest ... > \n" +
                "<uses-permission android:name=\"android.permission.INTERNET\" /> \n" +
                "</manifest>\n";
                String row5 = "<b>Enabling Javascript in Webview:</b><br>" +
                "JavaScript is disabled in a WebView by default. <br>" +
                "You can enable it through the WebSettings attached to your WebView.<br>" +
                "You can retrieve WebSettings with getSettings(), then enable JavaScript with setJavaScriptEnabled().";
                String code5 = "WebView browser = (WebView) findViewById(R.id.webview); \n" +
                "WebSettings webSettings = browser.getSettings(); \n" +
                "WebSettings.setJavaScriptEnabled(true);\n" ;

        rowOne.setText(android.text.Html.fromHtml(row1));
        rowTwo.setText(android.text.Html.fromHtml(row2));
        rowThree.setText(android.text.Html.fromHtml(row3));
        rowFour.setText(android.text.Html.fromHtml(row4));
        rowFive.setText(android.text.Html.fromHtml(row5));
        codeOne.setText(code1);
        codeTwo.setText(code2);
        codeThree.setText(code3);
        codeFour.setText(code4);
        codeFive.setText(code5);
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
