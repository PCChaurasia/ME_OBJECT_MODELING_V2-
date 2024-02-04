package com.crio.jukebox.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import com.crio.jukebox.entities.Artist;
import com.crio.jukebox.entities.Song;

public class SongRepository implements ISongRepository{

    private final Map<String,Song> songMap;
    private Integer autoIncrement = 0;

    public SongRepository(){
        songMap = new HashMap<String,Song>();
    }

    public SongRepository(Map<String,Song> songMap) {
        this.songMap = songMap;
        this.autoIncrement = songMap.size();
    }

    @Override
    public Song save(Song entity) {
        // TODO Auto-generated method stub
        if( entity.getId() == null ){
            autoIncrement++;
            Song c = new Song(Integer.toString(autoIncrement),entity.getName(),entity.getGenre(),entity.getAlbumName(),entity.getOtherArtists());
            songMap.put(c.getId(),c);
            return c;
        }
        songMap.put(entity.getId(),entity);
        return entity;
        
    }

    @Override
    public List<Song> findAll() {
        // TODO Auto-generated method stub
        return songMap.values().stream()
        .collect(Collectors.toList());
    }

    @Override
    public Optional<Song> findById(String id) {
        // TODO Auto-generated method stub
        return Optional.ofNullable(songMap.get(id));
    }

    @Override
    public boolean existsById(String id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void delete(Song entity) {
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
    public List<Song> findAllSongArtistWise(Artist artist) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addAll(List<String> songs) {
        // TODO Auto-generated method stub
        
    }

    

   
    
}
