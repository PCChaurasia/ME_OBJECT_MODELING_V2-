package com.crio.jukebox.repositories;


public class PlayListRepository implements IPlayListRepository{
    private final Map<String,User> PlayListMap;
    private Integer autoIncrement = 0;

    public PlayListRepository(){
        PlayListMap = new HashMap<String,PlayList>();
    }

    public PlayListRepository(Map<String, PlayList> PlayListMap) {
        this.PlayListMap = PlayListMap;
        this.autoIncrement = PlayListMap.size();
    }
}
