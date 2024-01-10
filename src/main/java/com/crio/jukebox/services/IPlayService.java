package com.crio.jukebox.services;

import com.crio.jukebox.entities.Song;
import com.crio.jukebox.exceptions.InvalidPlayListException;
import com.crio.jukebox.exceptions.SongNotFoundException;

public interface IPlayService {
    public Song playPlaylist(int userId, int playlistId)throws InvalidPlayListException;
    public Song playSong(int userId, String action, int songId)throws InvalidPlayListException, SongNotFoundException;
}
