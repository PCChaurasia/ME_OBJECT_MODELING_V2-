package com.crio.jukebox.exceptions;

public class SongNotFoundException extends Exception{
    @Override
    public String toString() {
        return "No such Song Found!";
    }
    
}
