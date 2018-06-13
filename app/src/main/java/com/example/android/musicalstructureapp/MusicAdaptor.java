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
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.album_artists_items, parent,false);
        }

        Music currentAlbum = getItem(position);

        TextView topText = (TextView) listItemView.findViewById(R.id.top_text);
        topText.setText(currentAlbum.getMainText());

        TextView bottomText = (TextView) listItemView.findViewById(R.id.bottom_text);
        bottomText.setText(currentAlbum.getmSubText());

        return listItemView;
    }
}
