package com.crio.jukebox.repositories;

import java.util.HashMap;
import java.util.Map;
import com.crio.jukebox.entities.PlayList;


public class PlayListRepository implements IPlayListRepository{
    private final Map<String,PlayList> playListMap;
    private Integer autoIncrement = 0;

    public PlayListRepository(){
        playListMap = new HashMap<String,PlayList>();
    }

    public PlayListRepository(Map<String, PlayList> playListMap) {
        this.playListMap = playListMap;
        this.autoIncrement = playListMap.size();
    }


    @Override
    public PlayList save(PlayList entity) {
        if( entity.getId() == null ){
            autoIncrement++;
            PlayList c = new PlayList(Integer.toString(autoIncrement),entity.getName(),entity.getUserId(),entity.getSongs());
            playListMap.put(c.getId(),c);
            return c;
        }
        playListMap.put(entity.getId(),entity);
        return entity;
    }
}
