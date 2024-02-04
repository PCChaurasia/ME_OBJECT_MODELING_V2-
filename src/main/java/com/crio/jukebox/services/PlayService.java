package com.crio.jukebox.services;

import java.util.List;
import com.crio.jukebox.entities.PlayList;
import com.crio.jukebox.entities.Song;
import com.crio.jukebox.exceptions.InvalidPlayListException;
import com.crio.jukebox.exceptions.PlayListNotFoundException;
import com.crio.jukebox.exceptions.SongNotFoundException;
import com.crio.jukebox.repositories.IPlayListRepository;
import com.crio.jukebox.repositories.ISongRepository;
import com.crio.jukebox.repositories.IUserRepository;

public class PlayService implements IPlayService{

    private final IUserRepository userRepository;
    private final ISongRepository songRepository;
    private final IPlayListRepository playListRepository;

    public PlayService( IUserRepository userRepository,ISongRepository songRepository, IPlayListRepository playListRepository){
        this.userRepository = userRepository;
        this.songRepository = songRepository;
        this.playListRepository = playListRepository;
    }

    @Override
    public Song playPlaylist(int userId, int playlistId) throws InvalidPlayListException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Song playSong(int userId, String action, int songId)
            throws InvalidPlayListException, SongNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }

    


    
    // public Song playPlaylist(int userId, int playlistId) {
    //     Playlist activePlaylist = null;
    
    //     for (Playlist playlist : playlists) {
    //         if (playlist.userId == userId && playlist.playlistId == playlistId) {
    //             activePlaylist = playlist;
    //             break;
    //         }
    //     }
    
    //     if (activePlaylist != null && !activePlaylist.songIds.isEmpty()) {
    //         currentSongIndex = 0;
    //         return playCurrentSong(activePlaylist);
    //     } else {
    //         System.out.println("Playlist is empty.");
    //         return null;
    //     }
    // }
    
    // private Song playCurrentSong(Playlist activePlaylist) {
    //     int currentSongId = activePlaylist.songIds.get(currentSongIndex);
    //     Song currentSong = songRepository.get(currentSongId - 1);
    
    //     System.out.println("Current Song Playing");
    //     System.out.println("Song - " + currentSong.name);
    //     System.out.println("Album - " + currentSong.albumName);
    //     System.out.println("Artists - " + String.join(",", currentSong.featuredArtists));
    
    //     return currentSong;
    // }
    


    // public Song playSong(int userId, String action, int songId) {
    //     Playlist activePlaylist = getActivePlaylist(userId);
    
    //     if (activePlaylist != null) {
    //         if (action.equals("BACK")) {
    //             currentSongIndex = (currentSongIndex - 1 + activePlaylist.songIds.size()) % activePlaylist.songIds.size();
    //         } else if (action.equals("NEXT")) {
    //             currentSongIndex = (currentSongIndex + 1) % activePlaylist.songIds.size();
    //         } else {
    //             if (activePlaylist.songIds.contains(songId)) {
    //                 currentSongIndex = activePlaylist.songIds.indexOf(songId);
    //             } else {
    //                 System.out.println("Song Not Found in the current active playlist.");
    //                 return null;
    //             }
    //         }
    
    //         return playCurrentSong(activePlaylist);
    //     } else {
    //         System.out.println("Playlist is empty.");
    //         return null;
    //     }
    // }
    
    // private Song playCurrentSong(Playlist activePlaylist) {
    //     int currentSongId = activePlaylist.songIds.get(currentSongIndex);
    //     Song currentSong = songRepository.get(currentSongId - 1);
    
    //     System.out.println("Current Song Playing");
    //     System.out.println("Song - " + currentSong.name);
    //     System.out.println("Album - " + currentSong.albumName);
    //     System.out.println("Artists - " + String.join(",", currentSong.featuredArtists));
    
    //     return currentSong;
    // }
    
   

    // private Playlist getActivePlaylist(int userId) {
    //     for (Playlist playlist : playlists) {
    //         if (playlist.userId == userId && currentSongIndex != -1) {
    //             return playlist;
    //         }
    //     }
    //     return null;
    // }



    

    

    
}
