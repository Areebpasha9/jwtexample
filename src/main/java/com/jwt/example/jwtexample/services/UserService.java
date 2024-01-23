package com.jwt.example.jwtexample.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.jwtexample.models.User;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Areeb", "areeb@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Arman Ali", "arman@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Ibraheem Hussain", "ibraheem@gmail.com"));
   
    }
   public List<User> getUsers(){
    return this.store;
   }

}
