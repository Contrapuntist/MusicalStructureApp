package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Music> songList = new ArrayList<Music>();

        songList.add(new Music("One", "Metallica"));
        songList.add(new Music("Crazy", "Aerosmith"));
        songList.add(new Music("Crash", "Dave Matthews Band"));
        songList.add(new Music("Crazy Train", "Ozzy Osbourne"));
        songList.add(new Music("Kiss My Axe", "Al di Meola"));
        songList.add(new Music("Pull Me Under", "Dream Theater"));
        songList.add(new Music("Volar", "{Paco de Lucia"));


        MusicAdaptor albumAdaptor = new MusicAdaptor( this, songList);

        ListView albumsListView = (ListView) findViewById(R.id.list_view);

        albumsListView.setAdapter(albumAdaptor);

    }

}
