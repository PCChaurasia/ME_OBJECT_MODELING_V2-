package com.crio.jukebox.entities;

public class User {
    private final Integer userId;
    private final String userName;
    



    public User(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        
    }

    // public User(Integer userId, String userName) {
    //     this.userId = userId;
    //     this.userName = userName;
    // }


    public String getuserName()
    {
        return userName;
    }

    public Integer getuserId()
    {
        return userId;
    }

   

    @Override
    public String toString()
    {
        return  "User [userId=" + userId + ", userName=" + userName + "]";
    }


    
}
