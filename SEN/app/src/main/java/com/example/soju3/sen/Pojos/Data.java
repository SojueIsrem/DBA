package com.example.soju3.sen.Pojos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.soju3.sen.Helper.DBHelper;

/**
 * Created by soju3 on 7/01/18.
 */

public class Data {
    private Context context;
    private SQLiteDatabase sqLiteDatabase;
    private SQLiteOpenHelper sqLiteOpenHelper;

    public Data(Context context){
        this.context = context;
        sqLiteOpenHelper = new DBHelper(context);
        sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
    }

    public void open(){sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();}

    public void close(){sqLiteOpenHelper.close();}

    public void incertUsuario(Usuario usuario){
        ContentValues values = usuario.toValues();
        sqLiteDatabase.insert(SQLConstans.tableUsuarios,null,values);
    }

    public Usuario getUsuario(String id){
        Usuario usuario = new Usuario();
        String [] whereArgs = new String[]{id};

        Cursor cursor =sqLiteDatabase.query(SQLConstans.tableUsuarios,
                SQLConstans.ALL_COLUMN,
                SQLConstans.SEARCH_BY_ID,
                whereArgs,
                null,null,null);
        if(cursor != null && cursor .getCount()>0) {
            cursor.moveToFirst();
            usuario.setId(cursor.getString(cursor.getColumnIndex(SQLConstans.COLUMNA_ID)));
            usuario.setNombre(cursor.getString(cursor.getColumnIndex(SQLConstans.COLUMNA_NOMBRE)));
            usuario.setEdad(cursor.getInt(cursor.getColumnIndex(SQLConstans.COLUMNA_EDAD)));
            usuario.setCorreo(cursor.getString(cursor.getColumnIndex(SQLConstans.COLUMNA_CORREO)));
        }
        return usuario;
    }
}
