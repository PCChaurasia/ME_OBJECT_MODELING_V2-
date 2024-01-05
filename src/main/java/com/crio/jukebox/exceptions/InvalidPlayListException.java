package com.crio.jukebox.exceptions;

public class InvalidPlayListException extends RuntimeException {
    public InvalidPlayListException()
    {
     super();
    }
    public InvalidPlayListException(String msg)
    {
     super(msg);
    }
    
}
