package com.crio.jukebox.entities;

import java.util.List;
import java.util.stream.Collectors;

public class User {
    private final String id;
    private final String name;
    private final List<PlayList>playLists;

    


    public User(User user){
        this(user.id, user.name, user.playLists);
    }

    public User(String id, String name, List<PlayList>playLists) {
        this.id = id;
        this.name = name;
        this.playLists = playLists;
        
    }


    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

   

    @Override
    public String toString()
    {
        return  "User {id=" + id +
         ", name=" + name +
         ",playList=" + playLists+
          "}";
    }

    public List<PlayList> getPlayLists() {
       return playLists.stream().collect(Collectors.toList());
    }


    
}
