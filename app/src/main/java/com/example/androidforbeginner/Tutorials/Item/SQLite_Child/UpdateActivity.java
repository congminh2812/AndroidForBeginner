package com.example.androidforbeginner.Tutorials.Item.SQLite_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class UpdateActivity extends AppCompatActivity {

    TextView rowOne, rowTwo, rowThree, rowFour, rowFive, rowSix, rowSeven, rowEight, rowNine, rowTen, rowEleven,
            codeOne, codeTwo, codeThree, codeFour, codeFive, codeSix, codeSeven, codeEight, codeNine, codeTen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
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
        rowSeven = findViewById(R.id.row_seven_text_view);

        codeOne = findViewById(R.id.code1);
        codeTwo = findViewById(R.id.code2);
        codeThree = findViewById(R.id.code3);
        codeFour = findViewById(R.id.code4);
        codeFive = findViewById(R.id.code5);
        codeSix = findViewById(R.id.code6);
        codeSeven = findViewById(R.id.code7);
        String row1 = "<b>Steps to Update Values in SQLite Database:-</b> <br>" +
                "1. In DataBaseHelper class create a method with return type as boolean to update data in the Database.";
        String code1 = "public boolean updateData(){" +
                "} \n";
        String row2 = "2. Pass all the arguments which need to be updated in the database as parameters to the function.";
        String code2 = "public boolean updateData(String id,String name,String surname,String marks){" +
                "} \n";
        String row3 = "3. Open Database for updating data in the tables using getWritableDatabase().";
        String code3 = "SQLiteDatabase db = this.getWritableDatabase();\n";
        String row4 = "4. Create an instance of a class ContentValues and use put method to store values in the object.";
        String code4 = "ContentValues contentValues = new ContentValues(); \n" +
                "contentValues.put(COL_2,name); \n" +
                "contentValues.put(COL_3,surname); \n" +
                "contentValues.put(COL_4,marks); \n";
        String row5 = "5. Update Data in the table using update method on the SQLiteDatabase instance.";
        String code5 = "int update (String table, ContentValues values, String whereClause, String[] whereArgs)\n";
        String row6 = "It takes four parameters, " +
                "table: <br>" +
                "The table to update in " +
                "values:<br>" +
                " A map from column names to new column values. null is a valid value that will be translated to NULL. <br>" +
                "WhereClause: <br>" +
                " The optional WHERE clause to apply when updating. Passing null will update all rows. \n" +
                "WhereArgs: <br>" +
                " You may include ? s in the where clause, which will be replaced by the values from whereArgs. The values will be bound as Strings. \n" +
                "6. Thus the complete method for pdating the data would be: ";
        String code6 = "public boolean updateData(String id,String name,String surname,String marks){\n" +
                "   SQLiteDatabase db = this.getWritableDatabase(); \n" +
                "   ContentValues contentValues = new ContentValues(); \n" +
                "   contentValues.put(COL_2,name); \n" +
                "   contentValues.put(COL_3,surname); \n" +
                "   contentValues.put(COL4,marks); \n" +
                "   db.update(TABLE_NAME,contentValues,\"ID =?\",new String[]{id});\n" +
                "   return true; \n" +
                "}\n";
        String row7 = "7. Now in MainActivity, Get the values of the textFields which needs to be inserted in the DataBase. Create an object of class DataBaseHelper and call the method of inserting Data in it.";
        String code7 = "DataBaseHelper myDb; myDb.updateData(valuel,value2,value3); \n" +
                "/* This is how we update entries in SQLite DataBase.*/\n";

        rowOne.setText(android.text.Html.fromHtml(row1));
        rowTwo.setText(android.text.Html.fromHtml(row2));
        rowThree.setText(android.text.Html.fromHtml(row3));
        rowFour.setText(android.text.Html.fromHtml(row4));
        rowFive.setText(android.text.Html.fromHtml(row5));
        rowSix.setText(android.text.Html.fromHtml(row6));
        rowSeven.setText(android.text.Html.fromHtml(row7));

        codeOne.setText(code1);
        codeTwo.setText(code2);
        codeThree.setText(code3);
        codeFour.setText(code4);
        codeFive.setText(code5);
        codeSix.setText(code6);
        codeSeven.setText(code7);
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
