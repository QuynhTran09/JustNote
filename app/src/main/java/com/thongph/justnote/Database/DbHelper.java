package com.thongph.justnote.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by thong on 9/25/2015.
 */
public class DbHelper extends SQLiteOpenHelper implements NameDefault {

    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // create table
        db.execSQL(SQL_CREATE_TB_NOTE);
        db.execSQL(SQL_CREATE_TB_TAG);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // delete table
        db.execSQL(SQL_DELETE_TB_NOTE);
        db.execSQL(SQL_DELETE_TB_TAG);

        onCreate(db);
    }
}
