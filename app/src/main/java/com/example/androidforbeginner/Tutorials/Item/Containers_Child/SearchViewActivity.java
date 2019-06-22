package com.example.androidforbeginner.Tutorials.Item.Containers_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class SearchViewActivity extends AppCompatActivity {

    TextView rowOne, rowTwo, rowThree, rowFour, rowFive, codeOne, codeTwo, codeThree, codeFour, codeFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);
        setTitle(getString(R.string.searchview));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rowOne = findViewById(R.id.row_one_text_view);
        rowTwo = findViewById(R.id.row_two_text_view);
        rowThree = findViewById(R.id.row_three_text_view);
        codeOne = findViewById(R.id.code1);
        codeTwo = findViewById(R.id.code2);
        codeThree = findViewById(R.id.code3);

        String row1 = "<b>Search View</b><br>" +
                "Provides a user interface for the user to enter a search query and submit a request to a search provider. <br>" +
                "<br><b>Steps of using SearchView in Android: </b><br>" +
                "<i>1. Add <SearchView> element to your xml layout file </i><br>";
        String code1 = "<SearchView \n" +
                "   android:id=\"@+id/idsearch\" \n" +
                "   android:layout_width=\"match_parent\" \n" +
                "   android: layout_height=\"wrap_content\" \n" +
                "   android:iconifiedByDefault=\"false\"› \n" +
                "   <requestFocus /> " +
                "</SearchView>\n";
        String row2 = "<i>2. Get a reference of this view in Java file </i>";
        String code2 = "SearchView searchView = (SearchView) findViewById(R.id.idsearch);";
        String row3 = "<i>3. To execute the query add the method setOnQueryTextListener to the searchview </i>";
        String code3 = "searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() \n" +
                "{ \n" +
                "   @Override \n" +
                "   public boolean onQueryTextSubmit(String s)\n" +
                "   { " +
                "       return false; " +
                "   } \n" +
                "   @Override\n" +
                "   public boolean onQueryTextChange(String s) \n" +
                "   { " +
                "       return false; " +
                "   }\n" +
                "});\n" +
                "\n";

        rowOne.setText(android.text.Html.fromHtml(row1));
        rowTwo.setText(android.text.Html.fromHtml(row2));
        rowThree.setText(android.text.Html.fromHtml(row3));
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
