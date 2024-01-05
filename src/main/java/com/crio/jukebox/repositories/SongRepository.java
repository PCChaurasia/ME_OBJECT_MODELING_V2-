package com.crio.jukebox.repositories;

public class SongRepository implements ISongRepository{

    private final Map<String,User> songMap;
    private Integer autoIncrement = 0;

    public SongRepository(){
        songMap = new HashMap<String,Song>();
    }

    public SongRepository(Map<String, Song> songMap) {
        this.songMap = songMap;
        this.autoIncrement = songMap.size();
    }
    
}
