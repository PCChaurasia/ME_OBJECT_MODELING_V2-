package com.crio.jukebox.services;

import java.util.List;
import com.crio.codingame.repositories.IUserRepository;
import com.crio.jukebox.entities.Playlist;
import com.crio.jukebox.repositories.IPlayListRepository;
import com.crio.jukebox.repositories.ISongRepository;

public class PlayListService implements IPlayListService{

    private final IUserRepository userRepository;
    private final ISongRepository songRepository;
    private final IPlayListRepository playListRepository;

    public PlayListService( IUserRepository userRepository,ISongRepository songRepository, IPlayListRepository playListRepository){
        this.userRepository = userRepository;
        this.songRepository = songRepository;
        this.playListRepository = playListRepository;
    }




    public Playlist createPlaylist(int userId, String playlistName, List<Integer> songIds) {
        // Check if all requested songs are available
        for (int songId : songIds) {
            if (songId <= 0 || songId > songRepository.size()) {
                System.out.println("Some Requested Songs Not Available. Please try again.");
                return null;
            }
        }
    
        int playlistId = playlists.size() + 1;
        Playlist playlist = new Playlist(playlistId, userId, playlistName, songIds);
        playlists.add(playlist);
        System.out.println("Playlist ID - " + playlistId);
    
        return playlist;
    }
    

    public boolean deletePlaylist(int userId, int playlistId) {
        Playlist playlistToRemove = null;
    
        for (Playlist playlist : playlists) {
            if (playlist.userId == userId && playlist.playlistId == playlistId) {
                playlistToRemove = playlist;
                break;
            }
        }
    
        if (playlistToRemove != null) {
            playlists.remove(playlistToRemove);
            System.out.println("Delete Successful");
            return true;
        } else {
            System.out.println("Playlist Not Found");
            return false;
        }
    }
    


    public Playlist modifyPlaylist(int userId, int playlistId, String action, List<Integer> songIds) {
        Playlist playlistToModify = null;
    
        for (Playlist playlist : playlists) {
            if (playlist.userId == userId && playlist.playlistId == playlistId) {
                playlistToModify = playlist;
                break;
            }
        }
    
        if (playlistToModify != null) {
            if (action.equals("ADD-SONG")) {
                for (int songId : songIds) {
                    if (!playlistToModify.songIds.contains(songId)) {
                        playlistToModify.songIds.add(songId);
                    }
                }
            } else if (action.equals("DELETE-SONG")) {
                playlistToModify.songIds.removeAll(songIds);
            }
    
            System.out.println("Playlist ID - " + playlistToModify.playlistId);
            System.out.println("Playlist Name - " + playlistToModify.getplayListName());
            System.out.println("Song IDs - " + playlistToModify.songIds);
    
            return playlistToModify;
        } else {
            System.out.println("Playlist Not Found");
            return null;
        }
    }
    
    
}
