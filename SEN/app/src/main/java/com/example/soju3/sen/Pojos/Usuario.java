package com.example.soju3.sen.Pojos;

import android.content.ContentValues;

/**
 * Created by soju3 on 7/01/18.
 */

public class Usuario {
    private String id;
    private String nombre;
    private int edad;
    private String correo;

    public  Usuario(){}

    public  Usuario(String id, String nombre, int edad, String correo ){
        this.id = id;
        this.nombre=nombre;
        this.edad=edad;
        this.correo= correo;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(4);
        contentValues.put(SQLConstans.COLUMNA_ID,id);
        contentValues.put(SQLConstans.COLUMNA_NOMBRE,nombre);
        contentValues.put(SQLConstans.COLUMNA_EDAD,edad);
        contentValues.put(SQLConstans.COLUMNA_CORREO,correo);
        return contentValues;
    }

}
