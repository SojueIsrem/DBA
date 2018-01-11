package com.example.soju3.sen.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.soju3.sen.Pojos.SQLConstans;
import com.example.soju3.sen.Pojos.Usuario;

/**
 * Created by soju3 on 7/01/18.
 */

public class DBHelper extends SQLiteOpenHelper {
    public static final int DB_VERSION = 1;
    public  DBHelper(Context context){
    super(context, SQLConstans.DB,null,DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLConstans.SQL_CREATE_TABLE_USUARIOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQLConstans.SQL_DELETE);
        onCreate(sqLiteDatabase);
    }
}
