package com.ed2.fabian.ed2_laboratorio0;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    ArrayList<Cancion> lista_general;
    ArrayList<Cancion> playlist;
    ArrayList<Cancion> encontradas;
    ListView listado_canciones,busquedas,mis_canciones;
    Button buscador;
    MenuItem asc_name,asc_dur,dsc_name,dsc_dur;
    EditText nombre_buscar;
    AdapterSong adapter;
    TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Recursos r1 = new Recursos();

        //Convierte a Listado la biblioteca del diccionario
        lista_general= new ArrayList<Cancion>(r1.biblioteca.values());
        playlist = new ArrayList<Cancion>();
        encontradas = new ArrayList<Cancion>();

        listado_canciones = (ListView)findViewById(R.id.canciones);
        busquedas = (ListView)findViewById(R.id.busquedas);
        mis_canciones = (ListView)findViewById(R.id.lv_play);
        title = (TextView) findViewById(R.id.titulo);

        title.setVisibility(View.INVISIBLE);

        buscador   = (Button) findViewById(R.id.btn_buscar);
        nombre_buscar = (EditText) findViewById(R.id.search_song);



        buscador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = nombre_buscar.getText().toString();
                Cancion buscada = r1.search(x);

                if (buscada!=null) {
                    listado_canciones.setVisibility(View.INVISIBLE);
                    mis_canciones.setVisibility(View.INVISIBLE);
                    busquedas.setVisibility(View.VISIBLE);

                    encontradas.add(buscada);
                    adapter = new AdapterSong(getApplicationContext(), encontradas);

                    busquedas.setAdapter(adapter);


                }else  {
                    Toast toast = Toast.makeText(getApplicationContext(),"Cancion no encontrada",Toast.LENGTH_SHORT);

                    toast.show();
                }


            }
        });

        AdapterSong adapter = new AdapterSong(getApplicationContext(), lista_general);

        listado_canciones.setAdapter(adapter);

        listado_canciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final int pos = position;

                Cancion buscada = lista_general.get(pos);

                playlist.add(buscada);

                Toast toast = Toast.makeText(getApplicationContext(),"Cancion Agregada",Toast.LENGTH_SHORT);

                toast.show();
            }
        });

        // busqueda de la cancion
        busquedas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final int pos = position;

                Cancion buscada = encontradas.get(pos);

                playlist.add(buscada);

                Toast toast = Toast.makeText(getApplicationContext(),"Cancion Agregada",Toast.LENGTH_SHORT);

                toast.show();

                encontradas.clear();
            }
        });


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    //Opciones del menu de los tres puntitos, para armar playlist, lista general y ordenar la playlist
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.play: //mostrar playlist
                title.setVisibility(View.VISIBLE);
                nombre_buscar.setVisibility(View.INVISIBLE);
                buscador.setVisibility(View.INVISIBLE);
                listado_canciones.setVisibility(View.INVISIBLE);
                busquedas.setVisibility(View.INVISIBLE);
                mis_canciones.setVisibility(View.VISIBLE);
                AdapterSong adapter = new AdapterSong(getApplicationContext(), playlist);
                mis_canciones.setAdapter(adapter);
                break;
            case R.id.todas:    //mostrar lista general
                title.setVisibility(View.INVISIBLE);
                buscador.setVisibility(View.VISIBLE);
                nombre_buscar.setVisibility(View.VISIBLE);
                mis_canciones.setVisibility(View.INVISIBLE);
                busquedas.setVisibility(View.INVISIBLE);
                listado_canciones.setVisibility(View.VISIBLE);
                AdapterSong adapter1 = new AdapterSong(getApplicationContext(), lista_general);

                listado_canciones.setAdapter(adapter1);
                break;

            case R.id.btn_ascname:  //ordenar ascendente por nombre la playlist
                Collections.sort(playlist, new Comparator<Cancion>() {
                    public int compare(Cancion c1, Cancion c2) {
                        return c2.getNombre().compareTo(c1.getNombre());
                    }
                });
                AdapterSong adapterasc = new AdapterSong(getApplicationContext(), playlist);
                mis_canciones.setAdapter(adapterasc);

                break;

            case  R.id.btn_dscname: //ordenar descendente por nombre la playlist
                Collections.sort(playlist, new Comparator<Cancion>() {
                    public int compare(Cancion c1, Cancion c2) {
                        return c1.getNombre().compareTo(c2.getNombre());
                    }
                });

                AdapterSong adapterdsc = new AdapterSong(getApplicationContext(), playlist);
                mis_canciones.setAdapter(adapterdsc);

                break;

            case  R.id.btn_dscdur: //ordenar descendente por duracion la playlist
                Collections.sort(playlist, new Comparator<Cancion>() {
                    public int compare(Cancion c1, Cancion c2) {
                        return (int) (c1.getDuracion() - c2.getDuracion());
                    }
                });

                AdapterSong adapterdsc2 = new AdapterSong(getApplicationContext(), playlist);
                mis_canciones.setAdapter(adapterdsc2);
                break;

            case  R.id.btn_ascdur: //ordenar ascendente por duracion la playlist
                Collections.sort(playlist, new Comparator<Cancion>() {
                    public int compare(Cancion c1, Cancion c2) {
                        return (int) (c2.getDuracion() - c1.getDuracion());
                    }
                });

                AdapterSong adapterasc2 = new AdapterSong(getApplicationContext(), playlist);
                mis_canciones.setAdapter(adapterasc2);

                break;

            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }
}
