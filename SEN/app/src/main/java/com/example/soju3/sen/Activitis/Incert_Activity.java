package com.example.soju3.sen.Activitis;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.soju3.sen.Pojos.Data;
import com.example.soju3.sen.Pojos.Usuario;
import com.example.soju3.sen.R;

public class Incert_Activity extends AppCompatActivity implements View.OnClickListener{
    Button incertar;
    EditText id, nombre, edad,correo;
    Data data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incert_);

        incertar = (Button) findViewById(R.id.IncertInfor);
        id = (EditText) findViewById(R.id.IncertId);
        nombre =  (EditText) findViewById(R.id.IncertNombre);
        edad = (EditText) findViewById(R.id.IncertId);
        correo = (EditText) findViewById(R.id.IncertCorreo);

        incertar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.IncertInfor:
                Usuario usuario = new Usuario(
                        id.getText().toString(),
                        nombre.getText().toString(),
                        Integer.valueOf(edad.getText().toString()),
                        correo.getText().toString());

                data = new Data(getApplicationContext());
                data.open();
                data.incertUsuario(usuario);
                Toast.makeText(getApplicationContext(),"Se han agregado los datos",
                        Toast.LENGTH_SHORT).show();
                data.close();
                break;
                   }
    }
}
