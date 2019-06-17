package com.example.androidforbeginner.Tutorials.Item.Menu_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class PopUpMenuActivity extends AppCompatActivity {

    TextView rowOneTextView,rowTwoTextView,rowThreeTextView,rowFourTextView;
    TextView codeOne,codeTwo,codeThree,codeFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_menu);
        setTitle(getString(R.string.popup_menu));

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
        codeFour = findViewById(R.id.code4);

        String rowOne = "Android PopUp Menu: \n" +
                " Android Popup Menu displays the menu below the anchor text if space is available otherwise above the anchor text. \n" +
                "\n" +
                "1. Define menu items in res/menu.xml \n ";
        String rowTwo = "2. If you define your menu in XML, here's how you can show the popup menu:\n" +
                " E.g A button with the android:onClick attribute that shows a popup menu: \n";
        String rowThree = "3. The activity can then show the popup menu like this: ";
        String rowFour = "4. Define Click Events ";

        String code1 = "<menu xmlns:androclass=\"http://schemas.android.com/apk/res/android\" >\n" +
                " <item android:id=\"@+id/item1\" \n" +
                "android:title=\"Item 1\"/> \n" +
                "<item android:id=\"@+id/item2\" \n" +
                "android:title=\"Item 2\"/>\n" +
                " <item android: id=\"@+id/item3\"\n" +
                " android:title=\"Item 3\"/> \n" +
                "</menu>\n";
        String code2 = "<ImageButton\n" +
                " android:layout_width=\"wrap_content\"\n" +
                " android:layout_height=\"wrap_content\"\n" +
                " android:src=\"@drawable/ic_overflow_holo_dark\"\n" +
                " android: contentDescription=\"@string/descr_overflow_button\"\n" +
                " android:onClick=\"showPopup\" /> \n";
        String code3 = "public void showPopup(View v) {\n" +
                " PopupMenu popup = new PopupMenu(this, v); \n" +
                "\n" +
                "Menulnflater inflater = popup.getMenuInflater(); \n" +
                "inflater.inflate(R.menu.actions, popup.getMenu()); \n" +
                "popup.show(); \n" +
                "}\n";
        String code4 = "public void showMenu(View v) {\n" +
                " PopupMenu popup = new PopupMenu(this, v);\n" +
                " Menulnflater inflater = popup.getMenuInflater(); \n" +
                "inflater.inflate(R.menu.actions, popup.getMenu()); \n" +
                "// This activity implements \n" +
                "]OnMenultemClickListener popup.setOnMenuItemClickListener(this); \n" +
                "\tpopup.show();\n" +
                "}\n" +
                "\n" +
                "@Override\n" +
                " public boolean onMenuItemClick(MenuItem item) {\n" +
                " switch (item.getItemId()) { \n" +
                "case R.id.archive: \n" +
                "//Your Code Here return true; \n" +
                "case R.id.delete: \n" +
                "//Your Code Here return true; \n" +
                "default: \n" +
                "return false;\n" +
                "\t}\n" +
                "}\n";



        rowOneTextView.setText(rowOne);
        rowTwoTextView.setText(rowTwo);
        rowThreeTextView.setText(rowThree);
        rowFourTextView.setText(rowFour);

        codeOne.setText(code1);
        codeTwo.setText(code2);
        codeThree.setText(code3);
        codeFour.setText(code4);

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
