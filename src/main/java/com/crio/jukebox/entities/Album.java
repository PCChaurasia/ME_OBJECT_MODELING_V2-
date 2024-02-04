package com.crio.jukebox.entities;

public class Album extends BaseEntity{

    
    private final String name;
    private final Artist artist;

       public Album(Album album){
           this(album.id, album.name, album.artist);
       }
    
        public Album(String id, String name, Artist artist) {
            this.id = id;
            this.name = name;
            this.artist = artist;
        }

        
        public String getAlbumName(){
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
