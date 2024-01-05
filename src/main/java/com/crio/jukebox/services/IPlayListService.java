package com.crio.jukebox.services;

import java.util.List;
import com.crio.jukebox.entities.Playlist;

public interface IPlayListService {
    public Playlist createPlaylist(int userId, String playlistName, List<Integer> songIds);
    public boolean deletePlaylist(int userId, int playlistId);
    public Playlist modifyPlaylist(int userId, int playlistId, String action, List<Integer> songIds);
}
