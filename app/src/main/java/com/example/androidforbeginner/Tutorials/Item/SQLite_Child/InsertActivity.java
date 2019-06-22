package com.example.androidforbeginner.Tutorials.Item.SQLite_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class InsertActivity extends AppCompatActivity {

    TextView rowOne, rowTwo, rowThree, rowFour, rowFive, rowSix,rowSeven,rowEight,rowNine,rowTen,rowEleven,
            codeOne, codeTwo, codeThree, codeFour, codeFive,codeSix,codeSeven,codeEight,codeNine,codeTen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
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

        String row1 = "<b>Steps to Insert Values in SQLite Database:- </b><br>" +
                "1. Follow to Steps of Creating a Database and Table. <br>" +
                "2. Create a method in DatabaseHelper Class to insert values in Table. <br>";
                String code1="public boolean insertData{" +
                "} \n";
                String row2="3. Pass all the values which needs to be inserted in the Table as parameters to the function.";
                String code2="public boolean insertData(String name, String surname ,String Marks){ " +
                "}\n";
                String row3="4. Create an instance of a class ContentValues and use put method to store values in the object. ";
                String code3="ContentValues contentValues = new ContentValues(); \n" +
                "contentValues.put(C01„2,name); \n" +
                "contentValues.put(C01„3,surname); \n" +
                "contentValues.put(COL_41marks); \n";
                String row4="5. Insert Data in the table using insert method on the SQLiteDatabase instance.";
                String code4="long insert (String table,String nullColumnHack,ContentValues values)\n" +
                "\n";
                String row5="<b>It takes three parameters," +
                "table</b> : the table to insert the row into.<br>" +
                "nullColumnHack:" +
                "optional; may be null.<br>" +
                " SQL doesn't allow inserting a completely empty row without naming at least one column name. If your provided values is empty, no column names are known and an empty row can't be inserted. If not set to null, the nullColumnHack parameter provides the name of nullable column name to explicitly insert a NULL into in the case where your values is empty. <br>" +
                "<b>Values:</b> <br>" +
                "This map contains the initial column values for the row. The keys should be the column names and the values the column values<br><br>" +
                "So the complete code of DatabaseHelper class is: ";
                String code5="public class DataBaseHelper extends SQLiteOpenHelper { \n" +
                "   public static final String DATABASE_NAME = \"Student.db\"; \n" +
                "   public static final String TABLE_NAME = \"Student_table\"; \n" +
                "   public static final String COL_1 = \"ID\"; \n" +
                "   public static final String COL_2 = \"NAME\"; \n" +
                "   public static final String COL_3 = \"SURNAME\"; \n" +
                "   public static final String COL_4 = \"MARKS\"; \n" +
                "   public DataBaseHelper(Context context) { \n" +
                "       super(context, DATABASE_NAME, null, 1);\n" +
                "   }\n" +
                "   @Override \n" +
                "   public void onCreate(SQLiteDatabase db) { \n" +
                "       db.execSQL(\"CREATE TABLE \" + TABLE_NAME + ”(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, SURNAME TEXT, MARKS INTEGER)”);\n" +
                "   }\n" +
                "   @Override public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {\n" +
                "       db.execSQL(\"DROP TABLE IF EXISTS \"+TABLE_NAME); \n" +
                "   } \n" +
                "   public boolean insertData(String name,String surname,String marks){ \n" +
                "       SQLiteDatabase db = this.getWritableDatabase(); \n" +
                "       ContentValues contentValues = new ContentValues(); \n" +
                "       contentValues.put(COL_2,name); \n" +
                "       contentValues.put(COL_3,surname); \n" +
                "       contentValues.put(COL_4,marks); \n" +
                "       long result = db.insert(TABLE_NAME,null,contentValues); \n" +
                "       db.close(); \n" +
                "       //To Check Whether Data is Inserted in DataBase \n" +
                "       if(result==-1){ \n" +
                "           return false; \n" +
                "       }\n" +
                "       else{ \n" +
                "           return true; \n" +
                "       }\n" +
                " }\n" +
                "\n";
                String row6="6. Now in MainActivity <br>"+
                "Get the values of the textFields which needs to be inserted in the DataBase. <br>" +
                "Create an object of class DataBaseHelper and call the method of inserting Data in it. <br>";
                String code6="DataBaseHelper myDb; \n" +
                "myDb.insertData(valuel,value2,value3); \n" +
                "/* This is how we insert entries from SQLite DataBase */\n";
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
