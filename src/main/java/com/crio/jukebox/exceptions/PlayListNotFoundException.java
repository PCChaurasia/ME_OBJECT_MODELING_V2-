package com.crio.jukebox.exceptions;

public class PlayListNotFoundException extends Exception{
    @Override
    public String toString() {
        return "No such PlayList Found!";
    }
}
