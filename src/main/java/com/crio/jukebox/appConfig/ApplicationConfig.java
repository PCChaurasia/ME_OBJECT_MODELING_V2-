package com.crio.jukebox.appConfig;


import com.crio.jukebox.commands.CommandInvoker;
import com.crio.jukebox.commands.CreatePlayListCommand;
import com.crio.jukebox.commands.CreateUserCommand;
import com.crio.jukebox.commands.DeletePlayListCommand;
import com.crio.jukebox.commands.LoadSongsCommand;
import com.crio.jukebox.commands.ModifyPlayListAddSongCommand;
import com.crio.jukebox.commands.ModifyPlayListDeleteSongCommand;
import com.crio.jukebox.commands.PlayPlayListCommand;
import com.crio.jukebox.commands.PlaySongCommand;
import com.crio.jukebox.repositories.IPlayListRepository;
import com.crio.jukebox.repositories.ISongRepository;
import com.crio.jukebox.repositories.IUserRepository;
import com.crio.jukebox.repositories.PlayListRepository;
import com.crio.jukebox.repositories.SongRepository;
import com.crio.jukebox.repositories.UserRepository;
import com.crio.jukebox.services.IPlayListService;
import com.crio.jukebox.services.IPlayService;
import com.crio.jukebox.services.ISongService;
import com.crio.jukebox.services.IUserService;
import com.crio.jukebox.services.PlayListService;
import com.crio.jukebox.services.PlayService;
import com.crio.jukebox.services.SongService;
import com.crio.jukebox.services.UserService;

public class ApplicationConfig {


    private final IPlayListRepository playListRepository = new PlayListRepository();
    private final ISongRepository songRepository = new SongRepository();
    private final IUserRepository userRepository = new UserRepository();

    private final IPlayListService playListService = new PlayListService(userRepository, songRepository, playListRepository);
    private final IPlayService playService = new PlayService(userRepository, songRepository, playListRepository);
    private final IUserService userService = new UserService(userRepository);
    private final ISongService songService = new SongService(songRepository);
    
    private final CreateUserCommand createUserCommand = new CreateUserCommand(userService);
    private final CreatePlayListCommand createPlayListCommand = new CreatePlayListCommand(playListService);
    private final DeletePlayListCommand deletePlayListCommand = new DeletePlayListCommand(playListService);
    private final LoadSongsCommand loadSongsCommand = new LoadSongsCommand(songService);
    private final ModifyPlayListAddSongCommand modifyPlayListAddSongCommand = new ModifyPlayListAddSongCommand(playListService);
    private final ModifyPlayListDeleteSongCommand modifyPlayListDeleteSongCommand = new ModifyPlayListDeleteSongCommand(playListService);
    private final PlayPlayListCommand playPlayListCommand = new PlayPlayListCommand(playService);
    private final PlaySongCommand playSongCommand = new PlaySongCommand(playService);


    private final CommandInvoker commandInvoker = new CommandInvoker();

    public CommandInvoker getCommandInvoker(){
        commandInvoker.register("CREATE_USER",createUserCommand);
        commandInvoker.register("CREATE_PLAYLIST",createPlayListCommand);
        commandInvoker.register("DELETE_PLAYLIST",deletePlayListCommand);
        commandInvoker.register("LOAD_SONGS",loadSongsCommand);
        commandInvoker.register("MODIFY_PLAYLIST_ADD_SONG",modifyPlayListAddSongCommand);
        commandInvoker.register("MODIFY_PLAYLIST_DELETE_SONG",modifyPlayListDeleteSongCommand);
        commandInvoker.register("PLAY_PLAYLIST",playPlayListCommand);
        commandInvoker.register("PLAY_SONG",playSongCommand);
        return commandInvoker;
    
}
}
