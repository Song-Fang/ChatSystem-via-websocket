package com.songfang.chatsystem.controller;

import com.songfang.chatsystem.storage.UserStorage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@CrossOrigin
public class UserController {

    @GetMapping("/registration/{username}")
    public ResponseEntity<Void> register(@PathVariable String username){
        try {
            UserStorage.getInstance().setUsers(username);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/fetchAllUsers")
    public Set<String> getAllUsers(){
        return UserStorage.getInstance().getUsers();
    }
}
