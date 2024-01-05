package com.crio.jukebox.services;

import com.crio.jukebox.entities.Song;

public interface IPlayService {
    public Song playPlaylist(int userId, int playlistId);
    public Song playSong(int userId, String action, int songId);
}
