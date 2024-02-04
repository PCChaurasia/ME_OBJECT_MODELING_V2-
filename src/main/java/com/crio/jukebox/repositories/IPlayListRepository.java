package com.crio.jukebox.repositories;

import java.util.List;
import com.crio.jukebox.entities.PlayList;
import com.crio.jukebox.entities.Song;

public interface IPlayListRepository extends CRUDRepository<PlayList,String>{
    public List<Song> findAllSongPlayListWise(PlayList playList);
}
