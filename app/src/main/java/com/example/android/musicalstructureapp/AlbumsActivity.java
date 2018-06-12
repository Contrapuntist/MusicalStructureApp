package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Music> albumList = new ArrayList<Music>();

        albumList.add(new Music("...And Justice for All", "Metallica"));
        albumList.add(new Music("Crash", "Dave Matthews Bands"));
        albumList.add(new Music("El Camino", "The Black Keys"));
        albumList.add(new Music("Images and Words","Dream Theater"));
        albumList.add(new Music("Get a Grip", "Aerosmith"));
        albumList.add(new Music("Kiss My Axe", "Al di Meola"));
        albumList.add(new Music("Cositas Buenas", "Paco de Lucia"));

        MusicAdaptor albumAdaptor = new MusicAdaptor( this, albumList);

        ListView albumsListView = (ListView) findViewById(R.id.list_view);

        albumsListView.setAdapter(albumAdaptor);

    }
}
