package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<String> artistsList = new ArrayList<String>();

        artistsList.add("Aerosmith");
        artistsList.add("Al Di Meola");
        artistsList.add("The Black Keys");
        artistsList.add("Dave Matthews Band");
        artistsList.add("Dream Theater");
        artistsList.add("Led Zepplin");
        artistsList.add("Metallica");
        artistsList.add("Paco de Lucia");

        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(this, R.layout.single_item_view, R.id.single_list_text, artistsList);

        ListView listView = findViewById(R.id.list_view);

        listView.setAdapter(adaptor);
    }
}
