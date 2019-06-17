package com.example.androidforbeginner.Tutorials.Item.SQLite_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class UpdateActivity extends AppCompatActivity {

    TextView rowOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        setTitle(getString(R.string.sqlite));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);

        String row1 = "Steps to Update Values in SQLite Database:- \n" +
                "1. In DataBaseHelper class create a method with return type as boolean to update data in the Database. \n" +
                "public boolean updateData(){ \n" +
                "} \n" +
                "2. Pass all the arguments which need to be updated in the database as parameters to the function. \n" +
                "public boolean updateData(String id,String name,String surname,String marks){ \n" +
                "} \n" +
                "3. Open Database for updating data in the tables using getWritableDatabase(). \n" +
                "SQLiteDatabase db = this.getWritableDatabase();\n" +
                "4. Create an instance of a class ContentValues and use put method to store values in the object. \n" +
                "ContentValues contentValues = new ContentValues(); \n" +
                "contentValues.put(COL_2,name); \n" +
                "contentValues.put(COL_3,surname); \n" +
                "contentValues.put(COL_4,marks); \n" +
                "5. Update Data in the table using update method on the SQLiteDatabase instance. \n" +
                "int update (String table, ContentValues values, String whereClause, String[] whereArgs)\n" +
                "It takes four parameters, \n" +
                "table: \n" +
                "the table to update in \n" +
                "values:\n" +
                " a map from column names to new column values. null is a valid value that will be translated to NULL. \n" +
                "whereClause: \n" +
                "the optional WHERE clause to apply when updating. Passing null will update all rows. \n" +
                "whereArgs: \n" +
                "You may include ?s in the where clause, which will be replaced by the values from whereArgs. The values will be bound as Strings. \n" +
                "6. Thus the complete method for pdating the data would be, \n" +
                "public boolean updateData(String id,String name,String surname,String marks){\n" +
                " SQLiteDatabase db = this.getWritableDatabase(); \n" +
                "ContentValues contentValues = new ContentValues(); \n" +
                "contentValues.put(COL_2,name); \n" +
                "contentValues.put(COL_3,surname); \n" +
                "contentValues.put(COL4,marks); \n" +
                "db.update(TABLE_NAME,contentValues,\"ID =?\",new String[]{id});\n" +
                " return true; }\n" +
                "7. Now in MainActivity, Get the values of the textFields which needs to be inserted in the DataBase. Create an object of class DataBaseHelper and call the method of inserting Data in it. \n" +
                "DataBaseHelper myDb; myDb.updateData(valuel,value2,value3); \n" +
                "This is how we update entries in SQLite DataBase.\n";

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
