package com.crio.jukebox.entities;

import java.util.List;
import java.util.stream.Collectors;

public class Playlist {
    public final String playlistId;
    private final String userId;
    private final String playListName;
    public List<Integer> songIds;

    public Playlist (Playlist Playlist){
        this(Playlist.playlistId, Playlist.userId, Playlist.playListName, Playlist.songIds);
    }

    public Playlist (int playlistId2, int userId2, String playListName, List<Integer>songIds){
        this.playlistId = playlistId2;
        this.userId = userId2;
        this.playListName = playListName;
        this.songIds = songIds;
    }

    public String getplayListName(){
        return playListName;
    }

    public String getplayListId(){
        return playlistId;
    }
    public String getuserId(){
        return userId;
    }
    public List<Integer> getsongIds() {
        return songIds.stream().collect(Collectors.toList());
    }

    @Override
    public String toString(){
        return "PlayList [playlistId=" + playlistId + ", playListName=" + playListName + ", userId=" + userId + ",  songIds=" + songIds + "]";
    }

}
