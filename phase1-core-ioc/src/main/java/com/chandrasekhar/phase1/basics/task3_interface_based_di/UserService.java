package com.chandrasekhar.phase1.basics.task3_interface_based_di;

import com.chandrasekhar.phase1.basics.task3_interface_based_di.service.INotificationService;

public class UserService {
    private INotificationService notificationService;
    public UserService(INotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void registerUser(String username){
        System.out.println("Registered user: "+username);
        notificationService.send("Welcome " + username);
    }
}
