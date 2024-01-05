package com.crio.jukebox.services;

public class PlayService implements IPlayListService{

    private final IUserRepository userRepository;
    private final ISongRepository songRepository;
    private final IPlayListRepository playListRepository;


    
    public Song playPlaylist(int userId, int playlistId) {
        Playlist activePlaylist = null;
    
        for (Playlist playlist : playlists) {
            if (playlist.userId == userId && playlist.playlistId == playlistId) {
                activePlaylist = playlist;
                break;
            }
        }
    
        if (activePlaylist != null && !activePlaylist.songIds.isEmpty()) {
            currentSongIndex = 0;
            return playCurrentSong(activePlaylist);
        } else {
            System.out.println("Playlist is empty.");
            return null;
        }
    }
    
    // private Song playCurrentSong(Playlist activePlaylist) {
    //     int currentSongId = activePlaylist.songIds.get(currentSongIndex);
    //     Song currentSong = songRepository.get(currentSongId - 1);
    
    //     System.out.println("Current Song Playing");
    //     System.out.println("Song - " + currentSong.name);
    //     System.out.println("Album - " + currentSong.albumName);
    //     System.out.println("Artists - " + String.join(",", currentSong.featuredArtists));
    
    //     return currentSong;
    // }
    


    public Song playSong(int userId, String action, int songId) {
        Playlist activePlaylist = getActivePlaylist(userId);
    
        if (activePlaylist != null) {
            if (action.equals("BACK")) {
                currentSongIndex = (currentSongIndex - 1 + activePlaylist.songIds.size()) % activePlaylist.songIds.size();
            } else if (action.equals("NEXT")) {
                currentSongIndex = (currentSongIndex + 1) % activePlaylist.songIds.size();
            } else {
                if (activePlaylist.songIds.contains(songId)) {
                    currentSongIndex = activePlaylist.songIds.indexOf(songId);
                } else {
                    System.out.println("Song Not Found in the current active playlist.");
                    return null;
                }
            }
    
            return playCurrentSong(activePlaylist);
        } else {
            System.out.println("Playlist is empty.");
            return null;
        }
    }
    
    private Song playCurrentSong(Playlist activePlaylist) {
        int currentSongId = activePlaylist.songIds.get(currentSongIndex);
        Song currentSong = songRepository.get(currentSongId - 1);
    
        System.out.println("Current Song Playing");
        System.out.println("Song - " + currentSong.name);
        System.out.println("Album - " + currentSong.albumName);
        System.out.println("Artists - " + String.join(",", currentSong.featuredArtists));
    
        return currentSong;
    }
    
   

    private Playlist getActivePlaylist(int userId) {
        for (Playlist playlist : playlists) {
            if (playlist.userId == userId && currentSongIndex != -1) {
                return playlist;
            }
        }
        return null;
    }


    

    
}
