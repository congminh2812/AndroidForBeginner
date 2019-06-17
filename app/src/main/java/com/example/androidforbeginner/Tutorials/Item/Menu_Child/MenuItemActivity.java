package com.example.androidforbeginner.Tutorials.Item.Menu_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class MenuItemActivity extends AppCompatActivity {

    TextView rowOneTextView,rowTwoTextView,rowThreeTextView,rowFourTextView;
    TextView codeOne,codeTwo,codeThree,codeFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_item);
        setTitle(getString(R.string.menu_item));

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

        String rowOne = "<p>Menu:<br /> It is an efficient and friendly way to display multiple options, from which users can choose what they like. </p>\n" +
                "<p>\n" +
                "Android provides the following three type of menus: \n" +
                "• Options menu \n" +
                "• Context menu \n" +
                "• Popup menu \n" +
                "</p>\n" +
                "Steps:-\n" +
                "<br /> \n" +
                "<p>\n" +
                "<b>Defining  a Menu in XML:</b><br />  To define the menu, create an XML file inside your project's res/menu/ directory and build the menu with the following elements: \n" +
                "</p>\n" +
                "<p>\n" +
                "<menu><br />\n" +
                " Defines a Menu, which is a container for menu items. A <menu> element must be the root node for the file and can hold one or more <item> and <group> elements. \n" +
                " </p>\n" +
                " <p>\n" +
                "<item> <br />\n" +
                "Creates a Menultem, which represents a single item in a menu. This element may contain a nested <menu> element in order to create a submenu. </p>\n" +
                "Here is an example of name menu.xml;\n";
        String rowTwo = "The <item> element supports several attributes you can use to define an item's appearance and behavior. For information about all the supported attributes, see the Menu Resource  document\n" +
                "\n" +
                "\n" +
                "Adding a submenu(Nested Menu): You can add a submenu to an item in any menu (except a submenu) by adding a <menu> element as the child of an <item>.\n";
        String rowThree = "How to use the menu in your Activity? " +
                "\nTo use the menu in your activity, you need to inflate the menu resource (convert the XML resource into a programmable object) using Menuinflaterinflate0. ";
        String rowFour = "Defining action on Menu Click : ";

        String code1 = "<?xml version =\"1.0\" encoding=\"utf-8\"?>\n" +
                " <menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "<item android:id=\"@+id/new_game\" android:icon=\"@drawable/ic_new_game\" \n" +
                "\tandroid:title=\"@string/new_game\" \n" +
                "android: showAsAction=\"ifRoom\"/> \n" +
                "<item android: id=\"@+id/help\" android:icon=\"@drawable/ic_help\" \n" +
                "\tandroid:title=\"@string/help\"/> \n" +
                "</menu>\n";
        String code2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?> \n" +
                "<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                " <item\n" +
                " android: id=\"@+id/file\"\n" +
                " android:title=\"@string/file\" > \n" +
                "<!-- \"file\" submenu --> \n" +
                "<menu> \n" +
                "<item     android: id=\"@+id/create_new\"\n" +
                " android:title=\"@string/create_new\" /> \n" +
                "<item     android: id=\"@+id/open\" \n" +
                "android:title=\"@string/open\" I> \n" +
                "</menu> \n" +
                "</item>\n" +
                " </menu>\n";
        String code3 = "Menulnflater inflater = getMenuInflater();\n" +
                " inflater.inflate(R.menu.game_menu, menu); \n";
        String code4 = "public boolean onOptionsItemSelected(MenuItem item) { \n" +
                "return super.onOptionsltemSelected(item); \n" +
                "}\n";


        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
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
