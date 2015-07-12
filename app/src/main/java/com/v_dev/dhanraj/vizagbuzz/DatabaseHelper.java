package com.v_dev.dhanraj.vizagbuzz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Dhanraj on 7/11/2015.
 */
public class DatabaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME="BusData.db";
    public static final String TABLE_NAME="BusDetails";
    public static final String COL_1="BusNo";
    public static final String COL_2="Source";
    public static final String COL_3="Destination";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db= this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(BusNo INTEGER PRIMARY KEY,Source TEXT,Destination TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
           db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
