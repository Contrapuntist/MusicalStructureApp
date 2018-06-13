package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<String> playlistList = new ArrayList<String>();

        playlistList.add("Workout Jams");
        playlistList.add("Managing the Daily Grind");
        playlistList.add("Is it Friday Yet?");
        playlistList.add("Let's Rock Out");
        playlistList.add("Date Night");

        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(this, R.layout.single_item_view, R.id.single_list_text, playlistList);

        ListView listView = findViewById(R.id.list_view);

        listView.setAdapter(adaptor);

    }

}
