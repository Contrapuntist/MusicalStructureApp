package com.example.android.musicalstructureapp;

public class Music {

    /**
     * Create local variables for album and artists names
     */
    private String mAlbumName;
    private String mArtistName;

    /**
     * Method for creating the music object
     * @param albumName name of album
     * @param artistName artist name
     */
    public Music (String albumName, String artistName) {
        mAlbumName = albumName;
        mArtistName = artistName;
    }

    /**
     * Methods for retrieving value of each variable: album and artist names
     */
    public String getAlbumName() { return mAlbumName; }
    public String getArtistName() { return mArtistName; }
}
