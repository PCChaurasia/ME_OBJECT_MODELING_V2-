package com.crio.jukebox.exceptions;

public class InvalidOperationException  extends RuntimeException{
    public InvalidOperationException()
    {
     super();
    }
    public InvalidOperationException(String msg)
    {
     super(msg);
    }

    // @Override
    // public String toString() {
    //     return "No such Operation Found!";
    // }
    
}
