package com.crio.jukebox.entities;

import java.util.List;


public class PlayList extends BaseEntity{
  
    private final String user;
    private final String name;
    public List<Song> songs;


    public PlayList(PlayList playList){
        this(playList.id, playList.name,playList.user,playList.songs);
    }

   
    public PlayList( String id,String name, String user, List<Song> songs) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.songs = songs;
    }

    public String getName(){
        return name;
    }

   
   
    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "id=" + id +
                ", name=" + name +
                ", user=" + user +
                ", songs=" + songs +
                '}';
    }


    public String getUserId() {
        return id;
    }


}
