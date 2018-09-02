package com.ed2.fabian.ed2_laboratorio0;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    ArrayList<Cancion> Lista;
    ListView listado_canciones;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Recursos r1 = new Recursos();

        //Convierte a Listado la biblioteca del diccionario
        Lista= new ArrayList<Cancion>(r1.biblioteca.values());

        listado_canciones = (ListView)findViewById(R.id.canciones);

        AdapterSong adapter = new AdapterSong(getApplicationContext(), Lista);

        listado_canciones.setAdapter(adapter);





    }
}
