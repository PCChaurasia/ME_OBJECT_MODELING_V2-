package com.crio.jukebox.exceptions;

public class UserNotFoundException  extends RuntimeException {
    public UserNotFoundException()
    {
     super();
    }
    public UserNotFoundException(String msg)
    {
     super(msg);
    }
    // @Override
    // public String toString() {
    //     return "No such User Found!";
    // }
}
