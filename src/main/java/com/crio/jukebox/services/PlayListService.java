package com.crio.jukebox.services;

import java.util.List;
import com.crio.jukebox.entities.PlayList;
import com.crio.jukebox.exceptions.PlayListNotFoundException;
import com.crio.jukebox.repositories.IPlayListRepository;
import com.crio.jukebox.repositories.ISongRepository;
import com.crio.jukebox.repositories.IUserRepository;

public class PlayListService implements IPlayListService{

    private final IUserRepository userRepository;
    private final ISongRepository songRepository;
    private final IPlayListRepository playListRepository;

    public PlayListService( com.crio.jukebox.repositories.IUserRepository userRepository2,ISongRepository songRepository, IPlayListRepository playListRepository){
        this.userRepository = userRepository2;
        this.songRepository = songRepository;
        this.playListRepository = playListRepository;
    }
    @Override
    public PlayList createPlaylist(int userId, String playlistName, List<Integer> songIds) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deletePlaylist(int userId, int playlistId) throws PlayListNotFoundException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public PlayList modifyPlaylist(int userId, int playlistId, String action, List<Integer> songIds)
            throws PlayListNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }




    // public PlayList createPlaylist(int userId, String playlistName, List<Integer> songIds) {
    //     // Check if all requested songs are available
    //     for (int songId : songIds) {
    //         if (songId <= 0 || songId > songRepository.length()) {
    //             System.out.println("Some Requested Songs Not Available. Please try again.");
    //             return null;
    //         }
    //     }
    
    //     // int playlistId = playlist.size() + 1;
    //     // PlayList playList = new PlayList(playlistId, playlistName, songIds);
    //     // playlists.add(playlist);
    //     // System.out.println("Playlist ID - " + playlistId);
    
    //     return playlist;
    // }
    

    
    // public void deletePlaylist(int userId, int playlistId) {
    //     Playlist playlistToRemove = null;
    
    //     for (Playlist playlist : playlist) {
    //         if (playlist.userId == userId && playlist.playlistId == playlistId) {
    //             playlistToRemove = playlist;
    //             break;
    //         }
    //     }
    
    //     if (playlistToRemove != null) {
    //         playlists.remove(playlistToRemove);
    //         System.out.println("Delete Successful");
    //     } else {
    //         System.out.println("Playlist Not Found");
    //     }
    // }
    


    // public Playlist modifyPlaylist(int userId, int playlistId, String action, List<Integer> songIds) {
    //     Playlist playlistToModify = null;
    
    //     for (Playlist playlist : playlists) {
    //         if (playlist.userId == userId && playlist.playlistId == playlistId) {
    //             playlistToModify = playlist;
    //             break;
    //         }
    //     }
    
    //     if (playlistToModify != null) {
    //         if (action.equals("ADD-SONG")) {
    //             for (int songId : songIds) {
    //                 if (!playlistToModify.songIds.contains(songId)) {
    //                     playlistToModify.songIds.add(songId);
    //                 }
    //             }
    //         } else if (action.equals("DELETE-SONG")) {
    //             playlistToModify.songIds.removeAll(songIds);
    //         }
    
    //         System.out.println("Playlist ID - " + playlistToModify.playlistId);
    //         System.out.println("Playlist Name - " + playlistToModify.getplayListName());
    //         System.out.println("Song IDs - " + playlistToModify.songIds);
    
    //         return playlistToModify;
    //     } else {
    //         System.out.println("Playlist Not Found");
    //         return null;
    //     }
    // }
    
    
}
