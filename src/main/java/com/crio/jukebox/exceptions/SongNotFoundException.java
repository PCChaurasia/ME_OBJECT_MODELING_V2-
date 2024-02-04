package com.crio.jukebox.exceptions;

public class SongNotFoundException  extends RuntimeException{
    public SongNotFoundException()
    {
     super();
    }
    public SongNotFoundException(String msg)
    {
     super(msg);
    }
    // @Override
    // public String toString() {
    //     return "No such Song Found!";
    // }
    
}
