package com.chandrasekhar.phase1.basics.task2_spring_constructor_di;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    private final NotificationService notificationService;

    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void registerUser(String username){
        System.out.println("User registered: "+username);
        notificationService.send("Welcome " + username);
    }
}
