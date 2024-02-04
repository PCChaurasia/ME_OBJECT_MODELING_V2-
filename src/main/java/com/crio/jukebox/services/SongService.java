package com.crio.jukebox.services;

import java.util.ArrayList;
import java.util.List;
import com.crio.jukebox.entities.Song;
import com.crio.jukebox.repositories.ISongRepository;

public class SongService implements ISongService{

    private final ISongRepository songRepository;

    public SongService( ISongRepository songRepository){
        this.songRepository = songRepository;

    }
    

    List<String> songRepositories = new ArrayList<>();
    

    @Override
    public boolean loadSongs(List<String> songs) {
        // TODO Auto-generated method stub
        if (songs != null && !songs.isEmpty()) {
            songRepository.addAll(songs);
            System.out.println("Songs Loaded successfully");
            return true;
        } else {
            System.out.println("Failed to load songs. Input list is empty or null.");
            return false;
        }
    }
    
}
