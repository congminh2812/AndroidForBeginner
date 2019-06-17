package com.example.androidforbeginner.Tutorials.Item.Menu_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class ContextMenuActivity extends AppCompatActivity {

    TextView rowOneTextView,rowTwoTextView,rowThreeTextView;
    TextView codeOne,codeTwo,codeThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);
        setTitle(getString(R.string.context_menu));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        rowThreeTextView = findViewById(R.id.row_three_text_view);

        codeOne = findViewById(R.id.code);
        codeTwo = findViewById(R.id.code2);
        codeThree = findViewById(R.id.code3);

        String rowOne = "Android Context Menu: \n" +
                " Android context menu appears when user long clicks on the item/element. It is also known as floating menu. \n" +
                "\n" +
                "1. Define menu items in res/menu.xml \n";
        String rowTwo = "In Activity class: \n" +
                "2. Implement onContextltemSelected(). \n";
        String rowThree = "3. Define Click Events\n" +
                " When the user selects a menu item, the system calls onContextltemSelected() method so you can perform the appropriate action. For example: \n";

        String code1 = "<menu xmlns:androclass=\"http://schemas.android.com/apk/res/android\" >\n" +
                " <item android: id=\"@+id/iteml\" \n" +
                "android:title=\"Item 1\"/> \n" +
                "<item android:id=\"@+id/item2\"\n" +
                " android:title=\"Item 2\"/> \n" +
                "<item android: id=\"@+id/item3\"\n" +
                " android:title=\"Item 3\"/> \n" +
                "</menu>\n";
        String code2 = "@Override \n" +
                "public void onCreateContextMenu(ContextMenu menu, View v, ContextMenulnfo menulnfo) {\n" +
                " super.onCreateContextMenu(menu, v, menulnfo);\n" +
                " Menulnflater inflater = getMenuInflater(); \n" +
                "inflater.inflate(R.menu.context_menu, menu);\n" +
                "}\n";
        String code3 = "@Override \n" +
                "public boolean onContextItemSelected(MenuItem item) { \n" +
                "AdapterContextMenulnfo info = (AdapterContextMenuInfo) item.getMenuInfo();\n" +
                " switch (item.getItemId()) { \n" +
                "case R.id.edit:\n" +
                " //Your Code here return true; \n" +
                "case R.id.delete: \n" +
                "//Your Code here return true;\n" +
                " default:\n" +
                " return super.onContextItemSelected(item); \n" +
                "} \n";



        rowOneTextView.setText(rowOne);
        rowTwoTextView.setText(rowTwo);
        rowThreeTextView.setText(rowThree);

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
