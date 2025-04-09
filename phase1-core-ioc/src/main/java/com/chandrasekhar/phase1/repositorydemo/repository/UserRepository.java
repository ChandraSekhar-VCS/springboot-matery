package com.chandrasekhar.phase1.repositorydemo.repository;

import com.chandrasekhar.phase1.repositorydemo.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {
    public List<User> getAllusers(){
        return Arrays.asList(
                new User(1,"Chandra"),
                new User(2, "Sekhar")
        );
    }
}
