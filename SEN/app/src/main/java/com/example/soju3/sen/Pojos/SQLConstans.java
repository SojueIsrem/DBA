package com.example.soju3.sen.Pojos;

/**
 * Created by soju3 on 7/01/18.
 */

public class SQLConstans {
    public static final String DB = "dbusuarios.db";

    public static final String tableUsuarios ="usuarios";

    public static final String COLUMNA_ID ="id";
    public static final String COLUMNA_NOMBRE = "nombre";
    public static final String COLUMNA_EDAD = "edad";
    public static final String COLUMNA_CORREO = "correo";


    public  static final String SEARCH_BY_ID = "id=?";
    public static final  String SQL_CREATE_TABLE_USUARIOS=
            "CREATE TABLE "+tableUsuarios+"("+
                    COLUMNA_ID+" TEXT PRIMARY KEY,"+
                    COLUMNA_NOMBRE+" TEXT,"+
                    COLUMNA_EDAD+" INT"+
                    COLUMNA_CORREO+" TEXT"+");";

    public static final String SQL_DELETE =
            "DROP TABLE "+tableUsuarios;

    public static final String[] ALL_COLUMN = {COLUMNA_ID,COLUMNA_NOMBRE,
            COLUMNA_EDAD,COLUMNA_CORREO};
}
