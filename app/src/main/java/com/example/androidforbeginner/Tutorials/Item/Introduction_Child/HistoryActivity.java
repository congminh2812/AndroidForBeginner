package com.example.androidforbeginner.Tutorials.Item.Introduction_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class HistoryActivity extends AppCompatActivity {
    TextView rowOneTextView,rowTwoTextView,rowThreeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        setTitle(getString(R.string.history).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_history);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        rowThreeTextView = findViewById(R.id.row_three_text_view);

        String rowOne ="<h3><b><u>Android History and Versions:-</u></b></h3>"+
                "<ul>" +
                    "<li> \tAndy Rubin founded Android Incorporation in Palo Alto,California in October,2003.</li>" +
                    "<li> \tGoogle acquired Android on 17th August 2005.Since the it is a subsidiary of Google Incorporation.</li>" +
                    "<li> \tGoogle formed Open Handset alliance (OHA) on 5th November 2007.</li>" +
                "</ul>";
        String rowTwo = "<h3><b><u>What is Open Handset Alliance?</u></b></h3>" +
                "<p>The Open Handset Alliance is a group of 84 technology and mobile companies " +
                "who have come together to accelerate innovation in mobile and offer consumers a richer," +
                " less expensive, and better mobile experience</p>" +
                "<p><b>Which was the first commercially available Smartphone running Android</b>\n" +
                "The first commercially available smartphone running Android was the HTC Dream it came to the market as the T-Mobile G1 in the USA,realeased on " +
                "October 22, 2008.</p>";
        String rowThree = "<h3><b><u>Android Version Names:-</u></b></h3>" +
                "<p>Android has its version named after sweets.<br> Starting with:<br>" +
                "<i>Aestro, Blender, Cupcake, Doughnut, Eclair, Froyo, Gingerbread, Honeycomb, IcescreamSandwhich, Jellybean, Kitkat," +
                "Lolipop, Nougat, Oreo</i>.The most recent being Android 8.0 with Oreo API level 26.</p>";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        rowTwoTextView.setText(android.text.Html.fromHtml(rowTwo));
        rowThreeTextView.setText(android.text.Html.fromHtml(rowThree));
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
