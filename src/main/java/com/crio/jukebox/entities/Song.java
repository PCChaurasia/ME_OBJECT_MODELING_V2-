package com.crio.jukebox.entities;

import java.util.List;

public class Song {
    private final String id;
    private final String name;
    private final String genre;
    private final Album album;
    private List<Artist> otherArtists;


    public Song(Song song){
        this(song.id, song.name, song.genre, song.album, song.otherArtists);
    }

   

    public Song(String id, String name, String genre, Album album, List<Artist> otherArtists) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.album = album;
        this.otherArtists = otherArtists;
    }

    public String getGenre(){
        return genre;
    }
    public String getAlbumName(){
        return album.getName();
    }
    public List<Artist> getOtherArtists(){
        return otherArtists;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }


    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name=" + name +
                ", genre=" + genre +
                ", album=" + album +
                ", otherArtists=" + otherArtists +
                '}';
    }


    
}
