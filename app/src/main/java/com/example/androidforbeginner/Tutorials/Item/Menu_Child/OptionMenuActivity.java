package com.example.androidforbeginner.Tutorials.Item.Menu_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class OptionMenuActivity extends AppCompatActivity {

    TextView rowOneTextView,rowTwoTextView,rowThreeTextView,rowFourTextView;
    TextView codeOne,codeTwo,codeThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);
        setTitle(getString(R.string.option_menu));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        rowThreeTextView = findViewById(R.id.row_three_text_view);
        rowFourTextView = findViewById(R.id.row_four_text_view);

        codeOne = findViewById(R.id.code);
        codeTwo = findViewById(R.id.code2);
        codeThree = findViewById(R.id.code3);

        String rowOne = "<b><u>* Android Option Menu: </u></b><br />" +
                " The options menu is the primary collection of menu items for an activity. \n" +
                "It's where you should place actions that have a global impact on the app, such as \"Search,\" \"Compose email,\" and \"Settings.\" \n" +
                "\n" +
                "<b> Steps of Creating Option Menu: </b><br />" +
                " <i>1. Define menu items in res/menu.xml</i>";
        String rowTwo = "In Activity class: \n" +
                "<i>2. Override onCreateOptionsMenu() </i><br/>" +
                "It is this method where you inflate your menu resource (defined in XML) into the Menu provided in the callback. For example: \n";
        String rowThree = "<i>3. Define Click Events</i>";
        String rowFour = "<b><u>Note:- </u></b><br/>" +
                    "   1. Items for the options menu can be declared from either your Activity subclass or a Fragment subclass.\n" +
                    "   2. If both ,activity and fragment(s) declare items for the options menu, they are combined in the UI. \n" +
                "   3. The activity's items appear first, followed by those of each fragment in the order in which each fragment is added to the activity.\n";

        String code1 = "<menu xmlns:android=\"http://schemas.android.com/apk/res/android\" >\n" +
                "   <item android : id=\"@+id/iteml\"\n" +
                "   android : title=\"Item 1\"/> \n" +
                "   <item android: id=\"@+id/item2\"\n" +
                "   android : title=\"Item 2\"/>\n" +
                "   <item android : id=\"@+id/item3\" \n" +
                "   android : title=\"Item 3\"/> \n" +
                "</menu>\n";
        String code2 = "@Override\n" +
                " public boolean onCreateOptionsMenu(Menu menu) {\n" +
                "   MenuInflater inflater = getMenuInflater();\n" +
                "   inflater.inflate(R.menu.game_menu, menu);\n" +
                "   return true; \n" +
                "   }  \n" +
                "}\n";
        String code3 = "@Override \n" +
                "public boolean onOptionsItemSelected(MenuItem item) { \n" +
                    "switch (item.getItemId()) {\n" +
                "       case R.id.item1:\n" +
                "       //Your Code here\n" +
                "       return true;\n" +
                "       case R.id.item2:\n" +
                "       //Your Code here \n" +
                "       return true; \n" +
                "       case R.id.item3:\n" +
                "       //Your Code here return true; \n" +
                "       default: return super.onOptionsItemSelected(item); \n" +
                "   }  \n" +
                "}\n";



        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        rowTwoTextView.setText(android.text.Html.fromHtml(rowTwo));
        rowThreeTextView.setText(android.text.Html.fromHtml(rowThree));
        rowFourTextView.setText(android.text.Html.fromHtml(rowFour));

        codeOne.setText(code1);
        codeTwo.setText(code2);
        codeThree.setText(code3);

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
