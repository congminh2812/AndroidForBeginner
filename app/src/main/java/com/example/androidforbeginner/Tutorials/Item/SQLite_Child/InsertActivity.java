package com.example.androidforbeginner.Tutorials.Item.SQLite_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class InsertActivity extends AppCompatActivity {

    TextView rowOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        setTitle(getString(R.string.sqlite));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);

        String row1 = "Steps to Insert Values in SQLite Database:- \n" +
                "1. Follow to Steps of Creating a Database and Table. \n" +
                "2. Create a method in DatabaseHelper Class to insert values in Table. \n" +
                "public boolean insertData{ \n" +
                "} \n" +
                "3. Pass all the values which needs to be inserted in the Table as parameters to the function. \n" +
                "public boolean insertData(String name, String surname ,String Marks){ \n" +
                "}\n" +
                "4. Create an instance of a class ContentValues and use put method to store values in the object. \n" +
                "ContentValues contentValues = new ContentValues(); \n" +
                "contentValues.put(C01„2,name); \n" +
                "contentValues.put(C01„3,surname); \n" +
                "contentValues.put(COL_41marks); \n" +
                "5. Insert Data in the table using insert method on the SQLiteDatabase instance. \n" +
                "long insert (String table,String nullColumnHack,ContentValues values)\n" +
                "\n" +
                "It takes three parameters, \n" +
                "table : the table to insert the row into.\n" +
                "nullColumnHack: \n" +
                "optional; may be null. SQL doesn't allow inserting a completely empty row without naming at least one column name. If your provided values is empty, no column names are known and an empty row can't be inserted. If not set to null, the nullColumnHack parameter provides the name of nullable column name to explicitly insert a NULL into in the case where your values is empty. \n" +
                "values: \n" +
                "this map contains the initial column values for the row. The keys should be the column names and the values the column values\n" +
                "So the complete code of DatabaseHelper class is: \n" +
                "public class DataBaseHelper extends SQLiteOpenHelper { \n" +
                "public static final String DATABASE_NAME = \"Student.db\"; \n" +
                "public static final String TABLE_NAME = \"Student_table\"; \n" +
                "public static final String COL_1 = \"ID\"; \n" +
                "public static final String COL_2 = \"NAME\"; \n" +
                "public static final String COL_3 = \"SURNAME\"; \n" +
                "public static final String COL_4 = \"MARKS\"; \n" +
                "public DataBaseHelper(Context context) { \n" +
                "super(context, DATABASE_NAME, null, 1);\n" +
                " }\n" +
                "@Override \n" +
                "public void onCreate(SQLiteDatabase db) { \n" +
                "db.execSQL(\"CREATE TABLE \" + TABLE_NAME + ”(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, SURNAME TEXT, MARKS INTEGER)”);\n" +
                "}\n" +
                "@Override public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {\n" +
                " db.execSQL(\"DROP TABLE IF EXISTS \"+TABLE_NAME); \n" +
                "} \n" +
                "public boolean insertData(String name,String surname,String marks){ \n" +
                "SQLiteDatabase db = this.getWritableDatabase(); \n" +
                "ContentValues contentValues = new ContentValues(); \n" +
                "contentValues.put(COL_2,name); \n" +
                "contentValues.put(COL_3,surname); \n" +
                "contentValues.put(COL_4,marks); \n" +
                "long result = db.insert(TABLE_NAME,null,contentValues); \n" +
                "db.close(); \n" +
                "//To Check Whether Data is Inserted in DataBase \n" +
                "if(result==-1){ \n" +
                "return false; \n" +
                "}\n" +
                "else{ \n" +
                "return true; \n" +
                "}\n" +
                " }\n" +
                "\n" +
                "6. Now in MainActivity, \n" +
                "Get the values of the textFields which needs to be inserted in the DataBase. \n" +
                "Create an object of class DataBaseHelper and call the method of inserting Data in it. \n" +
                "DataBaseHelper myDb; \n" +
                "myDb.insertData(valuel,value2,value3); \n" +
                "This is how we insert entries from SQLite DataBase\n";

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
