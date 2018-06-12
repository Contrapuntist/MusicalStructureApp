package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button artists = (Button) findViewById(R.id.artists_btn);

        artists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        Button albums = (Button) findViewById(R.id.albums_btn);

        albums.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });

        Button songs = (Button) findViewById(R.id.songs_btn);

        songs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent (MainActivity.this, SongsActivity.class);

                startActivity(songsIntent);
            }
        });


        Button playlists = (Button) findViewById(R.id.playlists_btn);

        playlists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistsIntent = new Intent (MainActivity.this, PlaylistsActivity.class);

                startActivity(playlistsIntent);
            }
        });

    }
}
