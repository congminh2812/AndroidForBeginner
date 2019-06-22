package com.example.androidforbeginner.Tutorials.Item.Containers_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class GridViewActivity extends AppCompatActivity {
    TextView rowOne,rowTwo,rowThree,rowFour,codeOne,codeTwo,codeThree,codeFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        setTitle(getString(R.string.gridview));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);
        rowTwo = findViewById(R.id.row_two_text_view);
        rowThree = findViewById(R.id.row_three_text_view);
        rowFour = findViewById(R.id.row_four_text_view);

        codeOne = findViewById(R.id.code1);
        codeTwo = findViewById(R.id.code2);
        codeThree = findViewById(R.id.code3);
        codeFour = findViewById(R.id.code4);

        String row1 = "<b><u>GridView:-</u></b> <br/>" +
                "GridView is a ViewGroup that displays items in a two-dimensional, scrollable grid. <br>" +
                "The grid items are automatically inserted to the layout using a Adapter. (Similar to what we did in the listview).<br><br>" +
                "<b>Steps of using GridView are: </b><br>" +
                "   1. Add the GridView in the Layout XML file ";

        String code1 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                " <LinearLayout \n" +
                "xmlns:android=http://schemas.android.com/apk/res/android\n" +
                "   android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\" \n" +
                "   android:orientation=\"vertical\" \n" +
                "   android:id=\"@+id/idLayout\"› \n" +
                "   <GridView \n" +
                "   android:layout_width=\"match_parent\"\n" +
                "   android: layout_height=\"match_parent\" \n" +
                "   android:numColumns=\"2\" \n" +
                "   android:id=\"@+id/idGridView\"/> \n" +
                "</LinearLayout>\n";

        String row2 = "2. Create the DataSource for the GridView in Activity <br>";
        String code2 = "String [] data={\"datal\",\"data2\",\"data3\",\"data4\",\"data5\",\"data6\",\"data7\",\"data8\"};";
        String row3 = "3. Instantiate the Gridview XML into Java Object";
        String code3 = "GridView gridView = (GridView) findViewByld(R.id.idGridView);";
        String row4 = "4. Define an Adapter for the GridView and set it to the GridView";
        String code4 = "ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_l,data); \n" +
        "gridView.setAdapter(adapter);\n";

        rowOne.setText(android.text.Html.fromHtml(row1));
        rowTwo.setText(android.text.Html.fromHtml(row2));
        rowThree.setText(android.text.Html.fromHtml(row3));
        rowFour.setText(android.text.Html.fromHtml(row4));

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
