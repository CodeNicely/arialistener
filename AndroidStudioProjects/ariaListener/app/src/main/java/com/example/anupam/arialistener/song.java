package com.example.anupam.arialistener;

/**
 * Created by Anupam on 10/15/2016.
 */
public class song {

    private long id;
    private String title;
    private String artist;

    public song(long songid, String songTitle, String artistName) {
        id = songid;
        title = songTitle;
        artist = artistName;



    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
}
