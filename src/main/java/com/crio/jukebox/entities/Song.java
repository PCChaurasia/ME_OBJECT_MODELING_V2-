package com.crio.jukebox.entities;

import java.util.List;

public class Song {
    private final String songId;
    private final String songName;
    private final String genre;
    private final String mainArtist;
    private List<String> otherArtists;

    // public Song (Song song){
    //     this(Song.songId, Song.songName, Song.genre, Song.mainArtist, Song.otherArtists);

    // }

    public Song(String songId, String songName, String genre, String mainArtist, List<String> otherArtists){
        this.songId = songId;
        this.songName = songName;
        this.genre = genre;
        this.mainArtist = mainArtist;
        this.otherArtists = otherArtists;
    }

    public String getGenre(){
        return genre;
    }
    public String getMainArtist(){
        return mainArtist;
    }
    public List<String> getOtherArtist(){
        return otherArtists;
    }
    public String getSongId(){
        return songId;
    }
    public String getSongName(){
        return songName;
    }


    @Override
    public String toString(){
       return "PlayList [songId=" + songId + ", songName=" + songName + ", genre=" + genre + ",  mainArtist=" + mainArtist + ", otherArtists=" + otherArtists + "]";
    }

    
}
