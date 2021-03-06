package com.songfang.chatsystem.storage;

import java.util.HashSet;
import java.util.Set;

public class UserStorage {
private static UserStorage instance;
private  Set<String> users;

private UserStorage(){
    users = new HashSet<>();
}

public void setUsers(String username){
    if(users.contains(username)){
        throw new RuntimeException("Username is already existed!");
    }

    users.add(username);
}

    public  Set<String> getUsers() {
        return users;
    }

    public static synchronized UserStorage getInstance(){
    if(instance==null){
        instance = new UserStorage();
    }
    return instance;
}
}
