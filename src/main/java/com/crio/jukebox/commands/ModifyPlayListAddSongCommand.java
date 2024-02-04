package com.crio.jukebox.commands;

import java.util.List;
import com.crio.jukebox.services.IPlayListService;

public class ModifyPlayListAddSongCommand implements ICommand{

    private IPlayListService playListService;

    public ModifyPlayListAddSongCommand(IPlayListService playListService) {
        this.playListService = playListService;
    }

    @Override
    public void execute(List<String> tokens) {
        // TODO Auto-generated method stub
        
    }
    
}
