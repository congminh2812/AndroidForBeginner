package com.example.androidforbeginner.Tutorials.Item.Containers_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class ListViewActivity extends AppCompatActivity {
    TextView rowOne,rowTwo,rowThree,rowFour,rowFive,codeOne,codeTwo,codeThree,codeFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        setTitle(getString(R.string.listview));
        StatusBar.changingStatusBar(this);
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

        String row1 = "<b>What is a ListView ? </b><br>" +
                "ListView is a view group that displays a list of scrollable items. <br>" +
                "The list items are inserted from the source using an Adapter Class.<br>";
        String row2 = "<b>Note: </b><br>The source of list item can be anything ranging from simple Array to Database queries.<br>" +
                "The Adapter acts as a bridge between the listview and the source.<br>" +
                "Thus the Adapter provides access to the data items by fetching the data from the source. <br>" +
                "The Adapter is also responsible for making a View for each item in the data set.<br>" +

                "<b>Steps of Implementing ListView to display lists in Android: </b><br><br>" +
                "\t1. Define the array or the data source \n";
                String code1 = "\tString[] days={\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Friday\",\"Saturday\"}; \n";
                String row3 = "2. Define the adapter and provide the layout of a single view to the adapter. ";
                String code2 = "\tArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_11days); \n";
                String row4 = "Here \"android.R.layout.simple_list_item_l \" is the default layout file available in android for displaying listview.<br>" +
                "3. Set the adapter to the listview ";
                String code3 = "\tListView lv = (ListView) findViewById(R.id.idListView); \n" +
                        "lv.setAdapter(adapter);";
                String row5 = "\t4. Attach an onitemClickListener to define what action should take place on click of the list item ";
                String code4 = "\tlv.setOnItemClickListener(new AdapterView.OnitemClickListener() \n" +
                "{ \n" +
                "   @Override\n" +
                " \tpublic void onitemClick(AdapterView adapterView, View view, int i, long 1) \n" +
                "   \t{ \n" +
                "   \t}\n" +
                "\t});\n";

        rowOne.setText(android.text.Html.fromHtml(row1));
        rowTwo.setText(android.text.Html.fromHtml(row2));
        rowThree.setText(android.text.Html.fromHtml(row3));
        rowFour.setText(android.text.Html.fromHtml(row4));
        rowFive.setText(android.text.Html.fromHtml(row5));
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
