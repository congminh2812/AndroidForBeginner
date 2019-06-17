package com.example.androidforbeginner.Tutorials.Item.Containers_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class GridViewActivity extends AppCompatActivity {
    TextView rowOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        setTitle(getString(R.string.gridview));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);

        String row1 = "GridView \n" +
                "GridView is a ViewGroup that displays items in a two-dimensional, scrollable grid. \n" +
                "The grid items are automatically inserted to the layout using a Adapter. (Similar to what we did in the listview).\n" +
                "Steps of using GridView are: \n" +
                "1. Add the GridView in the Layout XML file \n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                " <LinearLayout \n" +
                "xmlns:android=http://schemas.android.com/apk/res/android\n" +
                " android:layout_width=\"match_parent\"\n" +
                " android:layout_height=\"match_parent\" \n" +
                "android:orientation=\"vertical\" \n" +
                "android:id=\"@+id/idLayout\"› \n" +
                "<GridView \n" +
                "android:layout_width=\"match_parent\"\n" +
                " android: layout_height=\"match_parent\" \n" +
                "android:numColumns=\"2\" \n" +
                "android:id=\"@+id/idGridView\"/> </LinearLayout>\n" +
                "2. Create the DataSource for the GridView in Activity \n" +
                "String [] data={\"datal\",\"data2\",\"data3\",\"data4\",\"data5\",\"data6\",\"data7\",\"data8\"}; \n" +
                "3. Instantiate the Gridview XML into Java Object \n" +
                "GridView gridView = (GridView) findViewByld(R.id.idGridView); \n" +
                "4. Define an Adapter for the GridView and set it to the GridView \n" +
                "ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_l,data); \n" +
                "gridView.setAdapter(adapter);\n";

        rowOne.setText(row1);
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
