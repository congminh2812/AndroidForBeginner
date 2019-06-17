package com.example.androidforbeginner.Tutorials.Item.SQLite_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class ReadActivity extends AppCompatActivity {

    TextView rowOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        setTitle(getString(R.string.sqlite));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);

        String row1 = "Steps to Read Values in SQLite Database:- \n" +
                "1. In DataBaseHelper class create a method to read data with return type as Cursor. \n" +
                "public Cursor getAllData(){ \n" +
                "} \n" +
                "2. Open Database for reading data in the tables using getWritableDatabase0. \n" +
                "public Cursor getAllDatauf SQLiteDatabase db = this.getWritableDatabase(); \n" +
                "3. Write your query for reading values in the rawQuery0 method. It runs the provided SQL and returns a Cursor over the result set. \n" +
                "Cursor res = db.rawQuery(\"Select * from \" + TABLE_NAME,null);\n" +
                "Thus the complete method would be:- \n" +
                "public Cursor getAllData(){ \n" +
                "SQLiteDatabase db = this.getWritableDatabase(); \n" +
                "Cursor res = db.rawQuery(\"Select * from \" + TABLE_NAME,null); \n" +
                "return res; \n" +
                "} \n" +
                "4. Now go to your MainActivity.class \n" +
                "Call the method for reading Data from DataBaseHelper.class \n" +
                "DataBaseHelper myDb; \n" +
                "myDb.getAllData(); \n" +
                "Since the return type of this method is Cursor.We need to store the data in an Object of class Cursor. Thus the statment would be, \n" +
                "Cursor res = myDb.getAllData();\n" +
                "Now, we can get the result by moving cursor to the next row and appending the result in StringBuffer. \n" +
                "To get the result from the resultset we pass the parameter Columnlndex in getString0 method. \n" +
                "Thus, \n" +
                "while (res.moveToNext()){ \n" +
                "stringBuffer.append(\"Id: \"+res.getString(0)+\"\\n\"); \n" +
                "} \n" +
                "This is how we read entries from SQLite DataBase\n";

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
