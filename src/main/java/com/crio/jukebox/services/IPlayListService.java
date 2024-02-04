package com.crio.jukebox.services;

import java.util.List;
import com.crio.jukebox.entities.PlayList;
import com.crio.jukebox.exceptions.PlayListNotFoundException;

public interface IPlayListService {
    public PlayList createPlaylist(int userId, String playlistName, List<Integer> songIds);
    public void deletePlaylist(int userId, int playlistId)throws PlayListNotFoundException;
    public PlayList modifyPlaylist(int userId, int playlistId, String action, List<Integer> songIds)throws PlayListNotFoundException;
}
