package com.crio.jukebox.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import com.crio.jukebox.entities.PlayList;
import com.crio.jukebox.entities.Song;
import com.crio.jukebox.entities.User;


public class PlayListRepository implements IPlayListRepository{
    private final Map<String,PlayList> playListMap;
    private Integer autoIncrement = 0;

    public PlayListRepository(){
        playListMap = new HashMap<String,PlayList>();
    }

    public PlayListRepository(Map<String,PlayList> playListMap) {
        this.playListMap = playListMap;
        this.autoIncrement = playListMap.size();
    }


   
    @Override
    public List<PlayList> findAll() {
        // TODO Auto-generated method stub
        return playListMap.values().stream()
        .collect(Collectors.toList());
        
        
    }

    @Override
    public Optional<PlayList> findById(String id) {
        // TODO Auto-generated method stub
        return Optional.ofNullable(playListMap.get(id));
 
    }

    @Override
    public boolean existsById(String id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void delete(PlayList entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteById(String id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public PlayList save(PlayList entity) {
        // TODO Auto-generated method stub
        if( entity.getId() == null ){
            autoIncrement++;
             PlayList c = new PlayList(Integer.toString(autoIncrement),entity.getName(),entity.getUserId(),entity.getSongs());
            playListMap.put(c.getId(),c);
            return c;
        }
        playListMap.put(entity.getId(),entity);
        return entity;
        
    }

    @Override
    public List<Song> findAllSongPlayListWise(PlayList playList) {
        // TODO Auto-generated method stub
        // 
        return null;
        
    }
}
