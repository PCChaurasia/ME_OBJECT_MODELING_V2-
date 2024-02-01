package com.crio.jukebox.appConfig;

import com.crio.codingame.services.IUserService;
import com.crio.jukebox.repositories.IPlayListRepository;
import com.crio.jukebox.repositories.ISongRepository;
import com.crio.jukebox.repositories.IUserRepository;
import com.crio.jukebox.repositories.PlayListRepository;
import com.crio.jukebox.services.IPlayListService;
import com.crio.jukebox.services.IPlayService;
import com.crio.jukebox.services.ISongService;

public class ApplicationConfig {


    private final IPlayListRepository playListRepository = new PlayListRepository();
    private final ISongRepository songRepository = new SongRepository();
    private final IUserRepository userRepository = new UserRepository();

    private final IPlayListService playListService = new PlayListService(playListRepository, userRepository, songRepository);
    private final IPlayService playService = new PlayService(playListRepository,userRepository, songRepository);
    private final IUserService userService = new UserService(userRepository);
    private final ISongService songService = new SongService(songRepository);
    
    private final CreatePlayListCommand createUserCommand = new CreatePlayListCommand(playListService);
    private final CreateUserCommand createQuestionCommand = new CreateUserCommand(userService);
    private final DeleatPlayListCommand listQuestionCommand = new DeleatPlayListCommand(playListService);
    private final LoadSongsCommand createContestCommand = new LoadSongsCommand(songService);
    private final ModifyPlayListCommand listContestCommand = new ModifyPlayListCommand(playListService);
    private final PlayListCommand attendContestCommand = new PlayListCommand(playListServiceService);
    private final PlaySongCommand runContestCommand = new PlaySongCommand(playService);


    private final CommandInvoker commandInvoker = new CommandInvoker();

    public CommandInvoker getCommandInvoker(){
        commandInvoker.register("CREATE_USER",createUserCommand);
        commandInvoker.register("CREATE_QUESTION",createQuestionCommand);
        commandInvoker.register("LIST_QUESTION",listQuestionCommand);
        commandInvoker.register("CREATE_CONTEST",createContestCommand);
        commandInvoker.register("LIST_CONTEST",listContestCommand);
        commandInvoker.register("ATTEND_CONTEST",attendContestCommand);
        commandInvoker.register("RUN_CONTEST",runContestCommand);
        commandInvoker.register("LEADERBOARD",leaderBoardCommand);
        commandInvoker.register("WITHDRAW_CONTEST",withdrawContestCommand);
        return commandInvoker;
    
}
