package com.example.androidforbeginner.Tutorials.Item.Containers_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class ListViewActivity extends AppCompatActivity {
    TextView rowOne,rowTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        setTitle(getString(R.string.listview));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);
        rowTwo = findViewById(R.id.row_two_text_view);

        String row1 = "What is a ListView ? \n" +
                "ListView is a view group that displays a list of scrollable items. \n" +
                "The list items are inserted from the source using an Adapter Class.\n";
        String row2 = "Note: The source of list item can be anything ranging from simple Array to Database queries.\n" +
                "The Adapter acts as a bridge between the listview and the source.\n" +
                "Thus the Adapter provides access to the data items by fetching the data from the source. \n" +
                "The Adapter is also responsible for making a View for each item in the data set.\n" +
                "\n" +
                "Steps of Implementing ListView to display lists in Android: \n" +
                "\t1. Define the array or the data source \n" +
                "\tString[] days={\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Friday\",\"Saturday\"}; \n" +
                "\t2. Define the adapter and provide the layout of a single view to the adapter. \n" +
                "\tArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_11days); \n" +
                "\tHere \"android.R.layout.simple_list_item_l \" is the default layout file available in android for displaying listview. \n" +
                "\t3. Set the adapter to the listview \n" +
                "\tListView lv = (ListView) findViewById(R.id.idListView); lv.setAdapter(adapter);\n" +
                "\t4. Attach an onitemClickListener to define what action should take place on click of the list item \n" +
                "\tlv.setOnItemClickListener(new AdapterView.OnitemClickListener() \n" +
                "{ \n" +
                "@Override\n" +
                " \tpublic void onitemClick(AdapterView adapterView, View view, int i, long 1) \n" +
                "\t{ \n" +
                "\t}\n" +
                "\t});\n";

        rowOne.setText(row1);
        rowTwo.setText(row2);
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
