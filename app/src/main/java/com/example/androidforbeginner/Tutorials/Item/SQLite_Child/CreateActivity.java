package com.example.androidforbeginner.Tutorials.Item.SQLite_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class CreateActivity extends AppCompatActivity {

    TextView rowOne, rowTwo, rowThree, rowFour, rowFive, rowSix,rowSeven,rowEight,rowNine,rowTen,rowEleven,
            codeOne, codeTwo, codeThree, codeFour, codeFive,codeSix,codeSeven,codeEight,codeNine,codeTen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
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
        rowEight = findViewById(R.id.row_eight_text_view);
        rowNine = findViewById(R.id.row_nine_text_view);
        rowTen = findViewById(R.id.row_ten_text_view);
        rowEleven = findViewById(R.id.row_eleven_text_view);

        codeOne = findViewById(R.id.code1);
        codeTwo = findViewById(R.id.code2);
        codeThree = findViewById(R.id.code3);
        codeFour = findViewById(R.id.code4);
        codeFive = findViewById(R.id.code5);
        codeSix = findViewById(R.id.code6);
        codeSeven = findViewById(R.id.code7);
        codeEight = findViewById(R.id.code8);
        codeNine = findViewById(R.id.code9);
        codeTen = findViewById(R.id.code10);

        String row1 = "<b><u>Android SOLite:- </u></b><br>" +
                "SQLite is a very light weight database which comes with Android OS. <br><br>" +
                "<b>Note:-</b><br>" +
                "Since SQLite is embeded in Android by Default, we dont need to perform any database setup or installation for using it. SQLite supports standard relational database features like SQL syntax, transactions and prepared statements. \n" +
                "<br><b>Steps of Creating DataBase and Table:-</b> <br>" +
                "1. Create a new Java Class called DataBaseHelper.<br>" +
                "2. Extend the class with SQLiteOpenHelper. <br>";
                String code1="public class DataBaseHelper extends SQLiteOpenHelper{ " +
                "}<br>";
                String row2="3. Implement the methods.";
                String code2="public class DataBaseHelper extends SQLiteOpenHelper { \n" +
                "   @Override \n" +
                "   public void onCreate(SQLiteDatabase db) { \n" +
                "   } \n" +
                "   @Override\n" +
                "   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { \n" +
                "   }\n" +
                "}\n";
                String row3 = "4. Create the Default constructor. ";
                String code3="public class DataBaseHelper extends SQLiteOpenHelper { \n" +
                "   public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){\n" +
                "   super(context, name, factory, version); \n" +
                "   } \n" +
                "   @Override\n" +
                "   public void onCreate(SQLiteDatabase db) { \n" +
                "   } \n" +
                "   @Override \n" +
                "   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {\n" +
                "   }\n" +
                "}\n" ;
                String row4="5. Define name for your DataBase and Table.";
                String code4="public static final String DATABASE_NAME = \"Student.db\"; \n" +
                "public static final String TABLE_NAME = \"Student_table\"; \n" +
                "\n";

                String row5="6. Define name for your columns ";
                String code5="public static final String COL_1 - \"ID\"; \n" +
                "public static final String COL_2 = \"NAME\"; \n" +
                "public static final String COL_3 = \"SURNAME\"; \n" +
                "public static final String COL_4 = \"MARKS\";\n" +
                "\n" +
                "/*Code Till now:- */\n" +
                "public class DataBaseHelper extends SQLiteOpenHelper {\n" +
                "   public static final String DATABASE_NAME = \"Student.db\"; \n" +
                "   public static final String TABLE_NAME = \"Student_table\"; \n" +
                "   public static final String COL_1 = \"ID\";\n" +
                "   public static final String COL_2 = \"NAME\";\n" +
                "   public static final String COL_3 = \"SURNAME\";\n" +
                "   public static final String COL_4 = \"MARKS\"; \n" +
                "   public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory int version) \n" +
                "   super(context, name, factory, version); \n" +
                "   } \n" +
                "   @Override \n" +
                "   public void onCreate(SQLiteDatabase db) { \n" +
                "   }\n" +
                "   @Override\n" +
                "    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { \n" +
                "   }  \n" +
                "}\n";
                String row6="7. Modify the Constructor to take only Context. Provide the database name and version to the superclass.";
                String code6="public DataBaseHelper(Context context) { \n" +
                "   super(context, DATABASE_NAME, null, 1); \n" +
                "} \n";
                String row7 ="8. In OnCreate method write a Query to Create a Table.";
                String code7="public void onCreate(SQLiteDatabase db) { \n" +
                "   db.execSQL(\"CREATE \" + DATABASE_NAME + \"(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT, SURNAEM TEXT, MARKS INTEGER)”);\n" +
                "} \n";
                String row8="9. In onUpgrade method write a Query to drop the table if it exists.";
                String code8="public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { \n" +
                "   db.execSQL(\"DROP TABLE IF EXISTS n+TABLE_NAME); \n" +
                "}\n";
                String row9="10. To create database use getWritableDatabase() method in our constructor ";
                String code9="public DataBaseHelper(Context context) { \n" +
                "   super(context, DATABASE_NAME, null, 1); \n" +
                "   SQLiteDatabase db = this.getWritableDatabase(); \n" +
                "}\n" +
                "\n" +
                "/* Final Code of our DataBaseHelper.class is:- */\n" +
                "\tPublic class DataBaseHelper extends SQLiteOpenHelper{\n" +
                "   Public static final String DATABASE_NAME = “Student.db”;\n" +
                "   Public static final String TABLE_NAME = “Student_table”;\n" +
                "   public static final String COL_1 = \"ID\";\n" +
                "   public static final String COL_2 = \"NAME\";\n" +
                "   public static final String COL_3 = \"SURNAME\";\n" +
                "   public static final String COL_4 = \"MARKS\"; \n" +
                "   Public DataBaseHelper(Context context){\n" +
                "       Super(context, DATABASE_NAME, null, 1);\n" +
                "       SQLiteDatabase db = this.getWritableDatabase();\n" +
                "   }\n" +
                "   @Override\n" +
                "   Public void onCreate(SQLiteDataBase db){\n" +
                "       Db.execSQL(“CREATE TABLE” + TABLE_NAME + ”(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, SURNAME TEXT, MARKS INTEGER)”);\n" +
                "   }\n" +
                "   @Override\n" +
                "   Public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){\n" +
                "       Db.execSQL(“DROP TABLE IF EXISTS”+TABLE_NAME);\n" +
                "   }\n" +
                "}\n" ;
                String row10= "11. Create an object of our DataBaseHelper class in MainActivity and pass Context to it." ;
                String code10="DataBaseHelper myDb = new DataBaseHelper(this);";
                String row11="Thus it will call our constructor in DataBaseHelper class which will create our DataBase and Table in the database. <br>" +
                "This is how we create DataBase and Table in SQLite.<br><br><br>";

        rowOne.setText(android.text.Html.fromHtml(row1));
        rowTwo.setText(android.text.Html.fromHtml(row2));
        rowThree.setText(android.text.Html.fromHtml(row3));
        rowFour.setText(android.text.Html.fromHtml(row4));
        rowFive.setText(android.text.Html.fromHtml(row5));
        rowSix.setText(android.text.Html.fromHtml(row6));
        rowSeven.setText(android.text.Html.fromHtml(row7));
        rowEight.setText(android.text.Html.fromHtml(row8));
        rowNine.setText(android.text.Html.fromHtml(row9));
        rowTen.setText(android.text.Html.fromHtml(row10));
        rowEleven.setText(android.text.Html.fromHtml(row11));

        codeOne.setText(code1);
        codeTwo.setText(code2);
        codeThree.setText(code3);
        codeFour.setText(code4);
        codeFive.setText(code5);
        codeSix.setText(code6);
        codeSeven.setText(code7);
        codeEight.setText(code8);
        codeNine.setText(code9);
        codeTen.setText(code10);
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
