package com.chandrasekhar.phase1.repositorydemo.service;

import com.chandrasekhar.phase1.repositorydemo.model.User;
import com.chandrasekhar.phase1.repositorydemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void printAllUsers(){
        List<User> users = userRepository.getAllusers();
        for(User user:users){
            System.out.println("User: "+user.getId() + " - " + user.getName());
        }
    }
}
