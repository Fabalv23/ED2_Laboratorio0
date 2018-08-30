package com.ed2.fabian.ed2_laboratorio0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listado_canciones;

        ArrayAdapter<String> adaptador;

        listado_canciones = (ListView)findViewById(R.id.canciones);

        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);

        listado_canciones.setAdapter(adaptador);

    }
}
