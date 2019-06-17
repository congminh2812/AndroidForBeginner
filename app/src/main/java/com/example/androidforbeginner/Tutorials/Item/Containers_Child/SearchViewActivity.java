package com.example.androidforbeginner.Tutorials.Item.Containers_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class SearchViewActivity extends AppCompatActivity {

    TextView rowOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);
        setTitle(getString(R.string.searchview));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);

        String row1 = "Search view\n" +
                "SearchView provides a user interface for the user to enter a search query and submit a request to a search provider. \n" +
                "Steps of using SearchView in Android: \n" +
                "1. Add <SearchView> element to your xml layout file \n" +
                "<SearchView \n" +
                "android:id=\"@+id/idsearch\" \n" +
                "android:layout_width=\"match_parent\" \n" +
                "android: layout_height=\"wrap_content\" \n" +
                "android:iconifiedByDefault=\"false\"› \n" +
                "<requestFocus /> </SearchView>\n" +
                "2. Get a reference of this view in Java file \n" +
                "SearchView searchView = (SearchView) findViewById(R.id.idsearch); \n" +
                "3. To execute the query add the method setOnQueryTextListener to the searchview \n" +
                "searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() \n" +
                "{ \n" +
                "@Override \n" +
                "public boolean onQueryTextSubmit(String s)\n" +
                " { return false; } \n" +
                "@Override\n" +
                " public boolean onQueryTextChange(String s) \n" +
                "{ return false; }\n" +
                "});\n" +
                "\n" +
                "\n";

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
