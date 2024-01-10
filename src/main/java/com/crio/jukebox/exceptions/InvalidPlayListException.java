package com.crio.jukebox.exceptions;

public class InvalidPlayListException extends  Exception {
    @Override
    public String toString() {
        return "No such PlayList Found!";
    }
    
}
