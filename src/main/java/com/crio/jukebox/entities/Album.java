package com.crio.jukebox.entities;

public class Album{

    private final String id;
    private final String name;
    private final Artist artist;
    
        public Album(String id, String name, Artist artist) {
            this.id = id;
            this.name = name;
            this.artist = artist;
        }

        public String getId(){
            return id;
        }
        public String getName(){
            return name;
        }
        public String  getArtistName(){
            return artist.getName();
        }

        @Override
        public String toString() {
        return "Album{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", artist=" + artist +
                '}';
    }

    
    
    
}
