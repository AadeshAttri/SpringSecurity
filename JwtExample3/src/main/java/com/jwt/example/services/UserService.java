package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Honey Attri", "honey@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Anjali Attri", "anji@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Nidhi Attri", "nidhi@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "avi Attri", "avi@gmail.com"));
    }

    public List<User> getUser() {
        return this.store;
    }


}
