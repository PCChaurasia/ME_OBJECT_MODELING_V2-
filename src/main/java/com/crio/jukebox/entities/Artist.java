package com.crio.jukebox.entities;

public class Artist extends BaseEntity{
     
      private final  String name;

      public Artist(Artist artist){
        this( artist.id, artist.name);
      }
    
        public Artist(String id, String name) {
            this.id = id;
            this.name = name;
        }

        

        public String getName(){
            return name;
        }

        @Override
        public String toString() {
            return "Artist{" +
                    "id='" + id + '\'' +
                    ", name='" + name + 
                    '}';
        }
    
    
    
    
}
