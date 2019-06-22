package com.example.androidforbeginner.Tutorials.Item.SQLite_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class ReadActivity extends AppCompatActivity {
    TextView rowOne, rowTwo, rowThree, rowFour, rowFive, rowSix,rowSeven,rowEight,rowNine,rowTen,rowEleven,
            codeOne, codeTwo, codeThree, codeFour, codeFive,codeSix,codeSeven,codeEight,codeNine,codeTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
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


        String row1 = "<b>Steps to Read Values in SQLite Database:- </b><br>" +
                "1. In DataBaseHelper class create a method to read data with return type as Cursor.";
                String code1="public Cursor getAllData(){ " +
                "} \n";
                String row2="2. Open Database for reading data in the tables using getWritableDatabase0.";
                String code2="public Cursor getAllDatauf SQLiteDatabase db = this.getWritableDatabase(); \n";
                String row3="3. Write your query for reading values in the rawQuery0 method. It runs the provided SQL and returns a Cursor over the result set.";
                String code3="Cursor res = db.rawQuery(\"Select * from \" + TABLE_NAME,null);\n"+
                "/* Thus the complete method would be:- */\n" +
                "public Cursor getAllData(){ \n" +
                "   SQLiteDatabase db = this.getWritableDatabase(); \n" +
                "   Cursor res = db.rawQuery(\"Select * from \" + TABLE_NAME,null); \n" +
                "   return res; \n" +
                "} \n";
                String row4="4. Now go to your MainActivity.class <br>"+
                "Call the method for reading Data from DataBaseHelper.class <br>";
                String code4="DataBaseHelper myDb; \n" +
                "myDb.getAllData();";
                String row5="Since the return type of this method is Cursor.We need to store the data in an Object of class Cursor.<br> Thus the statment would be:";
                String code5="Cursor res = myDb.getAllData();\n";
                String row6="Now, we can get the result by moving cursor to the next row and appending the result in StringBuffer. <br>" +
                "To get the result from the resultset we pass the parameter Columnlndex in getString0 method. <br>" +
                "Thus: ";
                String code6 = "while (res.moveToNext()){ \n" +
                "   stringBuffer.append(\"Id: \"+res.getString(0)+\"\\n\"); \n" +
                "} \n" +
                "/* This is how we read entries from SQLite DataBase */\n";
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
