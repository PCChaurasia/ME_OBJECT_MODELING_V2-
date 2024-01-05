package com.crio.jukebox.services;

public class UserService implements IUserService {
    private final IUserRepository userRepository;
    

    List<User> users = new ArrayList<>();


    @Override
    public void createUser(String userName) {
        int userId = users.size() + 1;
        User user = new User(userId, userName);
        users.add(user);
        System.out.println(userId + " " + userName);
    }
    
}
