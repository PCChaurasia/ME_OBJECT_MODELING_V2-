package com.crio.jukebox.repositories;

import java.util.HashMap;
import java.util.Map;
import com.crio.jukebox.entities.Song;

public class SongRepository implements ISongRepository{

    private final Map<String,Song> songMap;
    private Integer autoIncrement = 0;

    public SongRepository(){
        songMap = new HashMap<String,Song>();
    }

    public SongRepository(Map<String, Song> songMap) {
        this.songMap = songMap;
        this.autoIncrement = songMap.size();
    }

    @Override
    public Song save(Song entity) {
        if( entity.getId() == null ){
            autoIncrement++;
            Song c = new Song(Integer.toString(autoIncrement),entity.getName(),entity.getGenre(),entity.getAlbumName(),entity.getOtherArtists());
            songMap.put(c.getId(),c);
            return c;
        }
        songMap.put(entity.getId(),entity);
        return entity;
    }
    
}
