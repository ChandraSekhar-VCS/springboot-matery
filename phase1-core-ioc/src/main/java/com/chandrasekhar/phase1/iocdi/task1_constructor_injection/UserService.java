package com.chandrasekhar.phase1.iocdi.task1_constructor_injection;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    private final NotificationService notificationService;

    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void notifyUser(String message){
        notificationService.send(message);
    }
}
