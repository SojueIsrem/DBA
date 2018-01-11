package com.example.soju3.sen.Activitis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.soju3.sen.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button incertar, buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incertar = (Button) findViewById(R.id.Incertar);
        buscar = (Button) findViewById(R.id.Buscar);

        incertar.setOnClickListener(this);
        buscar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Incertar:
                Intent intentIncertar = new Intent(MainActivity.this, Incert_Activity.class);
                startActivity(intentIncertar);
                break;
            case R.id.Buscar:
                Intent intentBuscar = new Intent(MainActivity.this, Search_Activity.class);
                startActivity(intentBuscar);
                break;
        }
    }
}
