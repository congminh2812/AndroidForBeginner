package com.example.androidforbeginner.Tutorials.Item.SQLite_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class DeleteActivity extends AppCompatActivity {

    TextView rowOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        setTitle(getString(R.string.sqlite));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);

        String row1 = "Steps to Update Values in SQLite Database:- \n" +
                "1. In DataBaseHelper class create a method with return type as Integer to delete data in the Database. \n" +
                "public Integer deleteDataM \n" +
                "} \n" +
                "2. Pass the primary key according to which according the data needs to be deleted from the database as parameters to the function. \n" +
                "public Integer deleteData(String id){ \n" +
                "}\n" +
                "3. Open Database for updating data in the tables using getWritableDatabase(). \n" +
                "SQLiteDatabase db = this.getWritableDatabase();\n" +
                "4. Delete Data from table using delete method on the SQLiteDatabase instance. \n" +
                "int delete (String table, String whereClause, String[] whereArgs) \n" +
                "It takes three parameters, table: the table to delete from whereClause : the optional WHERE clause to apply when deleting. Passing null will delete all rows. whereArgs: You may include ?s in the where clause, which will be replaced by the values from whereArgs. The values will be bound as Strings. \n" +
                "5. Thus the complete method for deleting the data would be, \n" +
                "public Integer deleteData(String id){ \n" +
                "SQLiteDatabase db = this.getWritableDatabase();\n" +
                " int i =db.delete(TABLE_NAME,\"ID=?\",new String[]{id}); \n" +
                "return i; }\n" +
                "6. Now in MainActivity, \n" +
                "Get the values of the primarykey according to which data needs to be deleted. \n" +
                "Create an object of class DataBaseHelper and call the method of inserting Data in it. \n" +
                "DataBaseHelper myDb; \n" +
                "myDb.deleteData(valuel); \n" +
                "This is how we delete entries from SQLite DataBase\n";

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
