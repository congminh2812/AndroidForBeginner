package com.example.androidforbeginner.Tutorials.Item.Menu_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class ContextMenuActivity extends AppCompatActivity {

    TextView rowOneTextView,rowTwoTextView,rowThreeTextView;
    TextView codeOne,codeTwo,codeThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);
        setTitle(getString(R.string.context_menu));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        rowThreeTextView = findViewById(R.id.row_three_text_view);

        codeOne = findViewById(R.id.code);
        codeTwo = findViewById(R.id.code2);
        codeThree = findViewById(R.id.code3);

        String rowOne = "<b><u>* Android Context Menu: </u></b><br/>" +
                "   Android context menu appears when user long clicks on the item/element. It is also known as floating menu. \n" +
                "\n" +
                "<br/><b>1. Define menu items in res/menu.xml</b>";
        String rowTwo = "In Activity class: \n" +
                "<br/><b>2. Implement onContextItemSelected()</b>";
        String rowThree = "<b>3. Define Click Events</b><br/>" +
                " When the user selects a menu item, the system calls onContextItemSelected() method so you can perform the appropriate action. For example: \n";

        String code1 = "<menu xmlns:android=\"http://schemas.android.com/apk/res/android\" >\n" +
                "   <item android: id=\"@+id/item1\" \n" +
                "   android:title=\"Item 1\"/> \n" +
                "   <item android:id=\"@+id/item2\"\n" +
                "   android:title=\"Item 2\"/> \n" +
                "   <item android: id=\"@+id/item3\"\n" +
                "   android:title=\"Item 3\"/> \n" +
                "</menu>\n";
        String code2 = "@Override \n" +
                "public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menulnfo) {\n" +
                "   super.onCreateContextMenu(menu, v, menuInfo);\n" +
                "   MenuInflater inflater = getMenuInflater(); \n" +
                "   inflater.inflate(R.menu.context_menu, menu);\n" +
                "}\n";
        String code3 = "@Override \n" +
                "public boolean onContextItemSelected(MenuItem item) { \n" +
                "   AdapterContextMenuInfo info = (AdapterContextMenuInfo) item.getMenuInfo();\n" +
                "   switch (item.getItemId()) { \n" +
                "       case R.id.edit:\n" +
                "       //Your Code here return true; \n" +
                "       case R.id.delete: \n" +
                "       //Your Code here return true;\n" +
                "       default:\n" +
                "           return super.onContextItemSelected(item); \n" +
                "} \n";



        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        rowTwoTextView.setText(android.text.Html.fromHtml(rowTwo));
        rowThreeTextView.setText(android.text.Html.fromHtml(rowThree));

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
