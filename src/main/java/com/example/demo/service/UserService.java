package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.example.demo.api.model.User;

import org.springframework.stereotype.Service;

@Service
public class UserService {


    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, 32, "Kenji", 22222223, 19901212, "Astro Street", 336123982);
        User user2 = new User(2, 31, "Jin", 37894876, 19910109, "Comet Road", 837465892);
        User user3 = new User(3, 30, "Mai", 33333330, 19920707, "Gaia Boulevard", 948374690 );
        User user4 = new User(4, 29, "Trina", 33323457, 19930510, "Nebula Hwy", 253847658);

        userList.addAll(Arrays.asList(user1,user2,user3,user4));
    }


    public Optional <User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: userList){
            if (id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;

    }
}
