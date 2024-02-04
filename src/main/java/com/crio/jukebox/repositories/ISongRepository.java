package com.crio.jukebox.repositories;

import java.util.List;
import com.crio.jukebox.entities.Artist;
import com.crio.jukebox.entities.Song;

public interface ISongRepository extends CRUDRepository<Song,String>{
    public List<Song> findAllSongArtistWise(Artist artist);

    public void addAll(List<String> songs);
}
