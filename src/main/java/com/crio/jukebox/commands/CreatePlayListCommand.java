package com.crio.jukebox.commands;
import java.util.Arrays;
import java.util.List;
import com.crio.jukebox.services.IPlayListService;


public class CreatePlayListCommand implements ICommand {

    private IPlayListService playListService;

    public CreatePlayListCommand(IPlayListService playListService) {
        this.playListService = playListService;
    }

    @Override
    public void execute(List<String> tokens) {
        // TODO Auto-generated method stub
        
    }


//    ./gradlew run --args="INPUT_FILE=jukebox-input.txt"

    
}
