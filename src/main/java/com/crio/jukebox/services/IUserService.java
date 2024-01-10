package com.crio.jukebox.services;

import com.crio.codingame.entities.User;
import com.crio.codingame.exceptions.UserNotFoundException;

public interface IUserService {
    public User create(String name)throws UserNotFoundException;
}
