package com.example.securityDurgesh.services;


import com.example.securityDurgesh.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"yashasvi","yash@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"harshit","har@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"bhavya","sul@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"nitin","hi@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"kunal","olaiaoh@dev.in"));
    }

    public  List<User> getUsers(){
        return this.store;
    }
}
