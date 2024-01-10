package com.crio.jukebox.services;

import java.util.List;
import com.crio.jukebox.exceptions.SongNotFoundException;

public interface ISongService {
    public boolean loadSongs(List<String> songs)throws SongNotFoundException; 
}
