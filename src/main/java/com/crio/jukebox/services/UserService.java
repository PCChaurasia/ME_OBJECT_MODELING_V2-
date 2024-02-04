package com.crio.jukebox.services;

import java.util.List;
import com.crio.jukebox.entities.PlayList;
import com.crio.jukebox.entities.User;
import com.crio.jukebox.exceptions.UserNotFoundException;
import com.crio.jukebox.repositories.IUserRepository;

public class UserService implements IUserService {
    private final IUserRepository userRepository;

    private String f_id = "1";
    
    public UserService(IUserRepository userRepository)
    {
        this.userRepository = userRepository;
    }
    

    //List<User> users = new ArrayList<>();


    // @Override
    // public void createUser(String userName) {
    //     int userId = users.size() + 1;
    //     User user = new User(userId, userName);
    //     users.add(user);
    //     System.out.println(userId + " " + userName);
    // }


    @Override
    public User create(String name) throws UserNotFoundException {
        // List<PlayList> playLists;
        // // TODO Auto-generated method stub
        // User newUser = new User(f_id, name, playLists);
        // userRepository.save(newUser);
        // return newUser;
        return null;
    
    }
    
}
