package com.example.androidforbeginner.Tutorials.Item.SQLite_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class CreateActivity extends AppCompatActivity {

    TextView rowOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        setTitle(getString(R.string.sqlite));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);

        String row1 = "Android SOLite:-  \n" +
                "SQLite is a very light weight database which comes with Android OS. \n" +
                "Note:-\n" +
                "Since SQLite is embeded in Android by Default, we dont need to perform any database setup or installation for using it. SQLite supports standard relational database features like SQL syntax, transactions and prepared statements. \n" +
                "Steps of Creating DataBase and Table:- \n" +
                "1. Create a new Java Class called DataBaseHelper.\n" +
                "2. Extend the class with SQLiteOpenHelper. \n" +
                "public class DataBaseHelper extends SQLiteOpenHelper{ \n" +
                "}\n" +
                "3. Implement the methods. \n" +
                "public class DataBaseHelper extends SQLiteOpenHelper { \n" +
                "@Override \n" +
                "public void onCreate(SQLiteDatabase db) { \n" +
                "} \n" +
                "@Override\n" +
                " public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { \n" +
                "}\n" +
                "}\n" +
                "4. Create the Default constructor. \n" +
                "public class DataBaseHelper extends SQLiteOpenHelper { \n" +
                "public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){\n" +
                " super(context, name, factory, version); \n" +
                "} \n" +
                "@Override\n" +
                " public void onCreate(SQLiteDatabase db) { \n" +
                "} \n" +
                "@Override \n" +
                "public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {\n" +
                "}\n" +
                "}\n" +
                "5. Define name for your DataBase and Table. \n" +
                "public static final String DATABASE_NAME = \"Student.db\"; \n" +
                "public static final String TABLE_NAME = \"Student_table\"; \n" +
                "\n" +
                "\n" +
                "6. Define name for your columns \n" +
                "public static final String COL_1 - \"ID\"; \n" +
                "public static final String COL_2 = \"NAME\"; \n" +
                "public static final String COL_3 = \"SURNAME\"; \n" +
                "public static final String COL_4 = \"MARKS\";\n" +
                "\n" +
                "Code Till now:- \n" +
                "public class DataBaseHelper extends SQLiteOpenHelper {\n" +
                "public static final String DATABASE_NAME = \"Student.db\"; \n" +
                "public static final String TABLE_NAME = \"Student_table\"; \n" +
                "public static final String COL_1 = \"ID\";\n" +
                "public static final String COL_2 = \"NAME\";\n" +
                "public static final String COL_3 = \"SURNAME\";\n" +
                "public static final String COL_4 = \"MARKS\"; \n" +
                "public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory int version) \n" +
                "super(context, name, factory, version); \n" +
                "} \n" +
                "@Override \n" +
                "public void onCreate(SQLiteDatabase db) { \n" +
                "}\n" +
                "@Override\n" +
                " public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { \n" +
                "}\n" +
                "}\n" +
                "7. Modify the Constructor to take only Context. Provide the database name and version to the superclass. \n" +
                "public DataBaseHelper(Context context) { \n" +
                "super(context, DATABASE_NAME, null, 1); \n" +
                "} \n" +
                "8. In OnCreate method write a Query to Create a Table. \n" +
                "public void onCreate(SQLiteDatabase db) { \n" +
                "db.execSQL(\"CREATE \" + DATABASE_NAME + \"(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT, SURNAEM TEXT, MARKS INTEGER)”);\n" +
                "} \n" +
                "9. In onUpgrade method write a Query to drop the table if it exists. \n" +
                "public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { \n" +
                "db.execSQL(\"DROP TABLE IF EXISTS n+TABLE_NAME); \n" +
                "}\n" +
                "10. To create database use getWritableDatabase() method in our constructor \n" +
                "public DataBaseHelper(Context context) { \n" +
                "super(context, DATABASE_NAME, null, 1); \n" +
                "SQLiteDatabase db = this.getWritableDatabase(); \n" +
                "}\n" +
                "\n" +
                "Final Code of our DataBaseHelper.class is:-\n" +
                "\tPublic class DataBaseHelper extends SQLiteOpenHelper{\n" +
                "Public static final String DATABASE_NAME = “Student.db”;\n" +
                "Public static final String TABLE_NAME = “Student_table”;\n" +
                "public static final String COL_1 = \"ID\";\n" +
                "public static final String COL_2 = \"NAME\";\n" +
                "public static final String COL_3 = \"SURNAME\";\n" +
                "public static final String COL_4 = \"MARKS\"; \n" +
                "Public DataBaseHelper(Context context){\n" +
                "Super(context, DATABASE_NAME, null, 1);\n" +
                "SQLiteDatabase db = this.getWritableDatabase();\n" +
                "}\n" +
                "@Override\n" +
                "Public void onCreate(SQLiteDataBase db){\n" +
                "Db.execSQL(“CREATE TABLE” + TABLE_NAME + ”(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, SURNAME TEXT, MARKS INTEGER)”);\n" +
                "}\n" +
                "@Override\n" +
                "Public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){\n" +
                "Db.execSQL(“DROP TABLE IF EXISTS”+TABLE_NAME);\n" +
                "}\n" +
                "}\n" +
                "11. Create an object of our DataBaseHelper class in MainActivity and pass Context to it. \n" +
                "DataBaseHelper myDb = new DataBaseHelper(this); \n" +
                "Thus it will call our constructor in DataBaseHelper class which will create our DataBase and Table in the database. \n" +
                "This is how we create DataBase and Table in SQLite.\n";

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
