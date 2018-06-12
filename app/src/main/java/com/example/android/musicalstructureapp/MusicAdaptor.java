package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MusicAdaptor extends ArrayAdapter<Music> {

    public MusicAdaptor(Activity context, ArrayList<Music> music) {
        super(context, 0, music);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }

        Music currentAlbum = getItem(position);

        TextView albumName = (TextView) listItemView.findViewById(R.id.top_text);
        albumName.setText(currentAlbum.getAlbumName());

        TextView artistName = (TextView) listItemView.findViewById(R.id.bottom_text);

        artistName.setText(currentAlbum.getArtistName());

        return listItemView;
    }
}
