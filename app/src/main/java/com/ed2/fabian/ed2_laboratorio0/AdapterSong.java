package com.ed2.fabian.ed2_laboratorio0;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterSong extends BaseAdapter {


    Context context;
    private List<Cancion> items;

    Cancion mostrar;

    public AdapterSong(Context context, List<Cancion> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;
        LayoutInflater inflater = LayoutInflater.from(context);
        v = inflater.inflate(R.layout.item_cancion, null);

        Cancion dir = items.get(i);

        TextView name_song = (TextView) v.findViewById(R.id.txt_name);
        name_song.setText(dir.getNombre());

        TextView name_artist = (TextView) v.findViewById(R.id.txt_artist);
        name_artist.setText(dir.getArtista());


        TextView album = (TextView) v.findViewById(R.id.txt_album);
        album.setText(dir.getAlbum());

        return v;
    }
}
