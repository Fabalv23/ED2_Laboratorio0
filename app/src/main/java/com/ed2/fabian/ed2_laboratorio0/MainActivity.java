package com.ed2.fabian.ed2_laboratorio0;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listado_canciones;

                List<Cancion> items = new List<Cancion>() {
                    @Override
                    public int size() {
                        return 0;
                    }

                    @Override
                    public boolean isEmpty() {
                        return false;
                    }

                    @Override
                    public boolean contains(Object o) {
                        return false;
                    }

                    @NonNull
                    @Override
                    public Iterator<Cancion> iterator() {
                        return null;
                    }

                    @NonNull
                    @Override
                    public Object[] toArray() {
                        return new Object[0];
                    }

                    @NonNull
                    @Override
                    public <T> T[] toArray(@NonNull T[] ts) {
                        return null;
                    }

                    @Override
                    public boolean add(Cancion cancion) {
                        return false;
                    }

                    @Override
                    public boolean remove(Object o) {
                        return false;
                    }

                    @Override
                    public boolean containsAll(@NonNull Collection<?> collection) {
                        return false;
                    }

                    @Override
                    public boolean addAll(@NonNull Collection<? extends Cancion> collection) {
                        return false;
                    }

                    @Override
                    public boolean addAll(int i, @NonNull Collection<? extends Cancion> collection) {
                        return false;
                    }

                    @Override
                    public boolean removeAll(@NonNull Collection<?> collection) {
                        return false;
                    }

                    @Override
                    public boolean retainAll(@NonNull Collection<?> collection) {
                        return false;
                    }

                    @Override
                    public void clear() {

                    }

                    @Override
                    public boolean equals(Object o) {
                        return false;
                    }

                    @Override
                    public int hashCode() {
                        return 0;
                    }

                    @Override
                    public Cancion get(int i) {
                        return null;
                    }

                    @Override
                    public Cancion set(int i, Cancion cancion) {
                        return null;
                    }

                    @Override
                    public void add(int i, Cancion cancion) {

                    }

                    @Override
                    public Cancion remove(int i) {
                        return null;
                    }

                    @Override
                    public int indexOf(Object o) {
                        return 0;
                    }

                    @Override
                    public int lastIndexOf(Object o) {
                        return 0;
                    }

                    @NonNull
                    @Override
                    public ListIterator<Cancion> listIterator() {
                        return null;
                    }

                    @NonNull
                    @Override
                    public ListIterator<Cancion> listIterator(int i) {
                        return null;
                    }

                    @NonNull
                    @Override
                    public List<Cancion> subList(int i, int i1) {
                        return null;
                    }
                };

        Cancion c1 = new Cancion("Billie Jean",3200,"THIS IS IT","Michael J");

        items.add(c1);


        AdapterSong pela = new AdapterSong(this,items);

        listado_canciones = (ListView)findViewById(R.id.canciones);

        listado_canciones.setAdapter(pela);

    }
}
