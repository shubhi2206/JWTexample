package com.jwt.example.Service;

import com.jwt.example.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();
    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Shubhi","shubhi@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Chitresh","chitresh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ankita","ankita@gmail.com"));
    }

    public List<User> getUsers(){
        return store;
    }
}
