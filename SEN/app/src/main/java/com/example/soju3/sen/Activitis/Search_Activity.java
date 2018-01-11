package com.example.soju3.sen.Activitis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.soju3.sen.Pojos.Data;
import com.example.soju3.sen.Pojos.Usuario;
import com.example.soju3.sen.R;

public class Search_Activity extends AppCompatActivity {
    EditText  IdBuscar;
    Button Search;
    Data data;
    Usuario usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_);

        Search = (Button) findViewById(R.id.BuscarId);
        IdBuscar = (EditText) findViewById(R.id.IdBuscar);

        usuario = new Usuario();

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idSearch = IdBuscar.getText().toString();
                data = new Data(getApplicationContext());
                data.open();
                usuario = data.getUsuario(idSearch);

                Log.e("RESULTADO",usuario.getNombre());
            }
        });

    }
}
