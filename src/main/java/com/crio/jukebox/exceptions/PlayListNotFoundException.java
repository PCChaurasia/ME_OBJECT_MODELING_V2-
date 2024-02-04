package com.crio.jukebox.exceptions;

public class PlayListNotFoundException extends RuntimeException{
    public PlayListNotFoundException()
    {
     super();
    }
    public PlayListNotFoundException(String msg)
    {
     super(msg);
    }
    // @Override
    // public String toString() {
    //     return "No such PlayList Found!";
    // }
}
