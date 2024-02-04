package com.crio.jukebox.commands;

import java.util.List;
import com.crio.jukebox.services.IPlayService;

public class PlayPlayListCommand implements ICommand{

    private IPlayService playService;

    public PlayPlayListCommand(IPlayService playService) {
        this.playService = playService;
    }

    @Override
    public void execute(List<String> tokens) {
        // TODO Auto-generated method stub
        
    }
    
}
