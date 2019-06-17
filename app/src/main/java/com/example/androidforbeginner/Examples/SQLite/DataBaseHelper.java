package com.example.androidforbeginner.Examples.SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Student.db";
    public static final String TABLE_NAME = "Student_table";

    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "SURNAME";
    public static final String COL_4 = "MARKS";

    public DataBaseHelper(Context context) {
        super(context,DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SURNAME TEXT,MARKS INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }

    public Cursor getAllData() {
        SQLiteDatabase database = getWritableDatabase();
        Cursor res = database.rawQuery("Select * from "+TABLE_NAME,null);
        return res;
    }
    public boolean insertData(String name, String surname, String marks) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,surname);
        contentValues.put(COL_4,marks);
        long result = database.insert(TABLE_NAME,null,contentValues);
        database.close();

        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }
    public boolean updateData(String id,String name, String surname, String marks) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,surname);
        contentValues.put(COL_4,marks);
        long result = database.update(TABLE_NAME,contentValues,"ID = ?",new String[]{id});
        database.close();

        if (result >0) {
            return true;
        } else {
            return false;
        }
    }

    public Integer deleteData(String id) {
        SQLiteDatabase database = this.getWritableDatabase();
        int i = database.delete(TABLE_NAME,"ID=?",new String[]{id});
        return i;
    }
}
