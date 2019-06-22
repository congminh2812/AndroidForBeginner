package com.example.androidforbeginner.Tutorials.Item.SQLite_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class DeleteActivity extends AppCompatActivity {

    TextView rowOne, rowTwo, rowThree, rowFour, rowFive, rowSix,rowSeven,rowEight,rowNine,rowTen,rowEleven,
            codeOne, codeTwo, codeThree, codeFour, codeFive,codeSix,codeSeven,codeEight,codeNine,codeTen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        setTitle(getString(R.string.sqlite));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);
        rowTwo = findViewById(R.id.row_two_text_view);
        rowThree = findViewById(R.id.row_three_text_view);
        rowFour = findViewById(R.id.row_four_text_view);
        rowFive = findViewById(R.id.row_five_text_view);
        rowSix = findViewById(R.id.row_six_text_view);

        codeOne = findViewById(R.id.code1);
        codeTwo = findViewById(R.id.code2);
        codeThree = findViewById(R.id.code3);
        codeFour = findViewById(R.id.code4);
        codeFive = findViewById(R.id.code5);
        codeSix = findViewById(R.id.code6);

        String row1 = "<b>Steps to Update Values in SQLite Database:- </b><br>" +
                "1. In DataBaseHelper class create a method with return type as Integer to delete data in the Database.";
                String code1="public Integer deleteData(){" +
                "} \n" ;
                String row2="2. Pass the primary key according to which according the data needs to be deleted from the database as parameters to the function.";
                String code2="public Integer deleteData(String id){ " +
                "}\n" ;
                String row3="3. Open Database for updating data in the tables using getWritableDatabase().";
                String code3="SQLiteDatabase db = this.getWritableDatabase();\n";
                String row4="4. Delete Data from table using delete method on the SQLiteDatabase instance.";
                String code4="int delete (String table, String whereClause, String[] whereArgs) ";
                String row5="<b>It takes three parameters </b>table: the table to delete from whereClause : the optional WHERE clause to apply when deleting. Passing null will delete all rows. whereArgs: You may include ?s in the where clause, which will be replaced by the values from whereArgs. The values will be bound as Strings. <br>" +
                "5. Thus the complete method for deleting the data would be: ";
                String code5="public Integer deleteData(String id){ \n" +
                "   SQLiteDatabase db = this.getWritableDatabase();\n" +
                "   int i =db.delete(TABLE_NAME,\"ID=?\",new String[]{id}); \n" +
                "   return i;\n" +
                " }\n" ;
                String row6="6. Now in MainActivity <br>" +
                "Get the values of the primarykey according to which data needs to be deleted. <br>" +
                "Create an object of class DataBaseHelper and call the method of inserting Data in it." ;
                String code6="DataBaseHelper myDb; \n" +
                "myDb.deleteData(valuel); \n" +
                "/* This is how we delete entries from SQLite DataBase */\n";
        rowOne.setText(android.text.Html.fromHtml(row1));
        rowTwo.setText(android.text.Html.fromHtml(row2));
        rowThree.setText(android.text.Html.fromHtml(row3));
        rowFour.setText(android.text.Html.fromHtml(row4));
        rowFive.setText(android.text.Html.fromHtml(row5));
        rowSix.setText(android.text.Html.fromHtml(row6));

        codeOne.setText(code1);
        codeTwo.setText(code2);
        codeThree.setText(code3);
        codeFour.setText(code4);
        codeFive.setText(code5);
        codeSix.setText(code6);
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
