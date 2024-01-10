package com.crio.jukebox.services;

import java.util.List;
import com.crio.jukebox.entities.Playlist;
import com.crio.jukebox.exceptions.PlayListNotFoundException;

public interface IPlayListService {
    public Playlist createPlaylist(int userId, String playlistName, List<Integer> songIds);
    public void deletePlaylist(int userId, int playlistId)throws PlayListNotFoundException;
    public Playlist modifyPlaylist(int userId, int playlistId, String action, List<Integer> songIds)throws PlayListNotFoundException;
}
