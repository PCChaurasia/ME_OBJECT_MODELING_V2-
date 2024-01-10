package com.crio.jukebox.exceptions;

public class UserNotFoundException extends Exception {
    @Override
    public String toString() {
        return "No such User Found!";
    }
}
