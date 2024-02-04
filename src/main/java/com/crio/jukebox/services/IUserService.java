package com.crio.jukebox.services;

import com.crio.jukebox.entities.User;
import com.crio.jukebox.exceptions.UserNotFoundException;

public interface IUserService {
    public User create(String name)throws UserNotFoundException;
}
