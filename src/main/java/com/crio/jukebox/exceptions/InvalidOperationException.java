package com.crio.jukebox.exceptions;

public class InvalidOperationException extends Exception{

    @Override
    public String toString() {
        return "No such Operation Found!";
    }
    
}
