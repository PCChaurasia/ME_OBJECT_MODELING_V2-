import java.util.Arrays;
import com.crio.jukebox.services.PlayListService;

public class CreatePlayListCommand {


    PlayListService newPlaylist = createPlaylist(1, "MY_PLAYLIST_1", Arrays.asList(1, 4, 5, 6));

if (newPlaylist != null) {
    // Playlist creation was successful, do something with the newPlaylist object
    System.out.println("New Playlist Created: " + newPlaylist.playlistName);
} else {
    // Handle the case where playlist creation failed
    System.out.println("Playlist creation failed.");
}


    
}
