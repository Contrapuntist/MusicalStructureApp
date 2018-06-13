package com.example.android.musicalstructureapp;

public class Music {

    /**
     * Create local variables for album and artists names
     */
    private String mMainText;
    private String mSubText;

    /**
     * Method for creating the music object
     * @param mainText name of album
     * @param subText artist name
     */
    public Music (String mainText, String subText) {
        mMainText = mainText;
        mSubText= subText;
    }

    /**
     * Methods for retrieving value of each variable: album and artist names
     */
    public String getMainText() { return mMainText; }
    public String getmSubText () { return mSubText; }
}
