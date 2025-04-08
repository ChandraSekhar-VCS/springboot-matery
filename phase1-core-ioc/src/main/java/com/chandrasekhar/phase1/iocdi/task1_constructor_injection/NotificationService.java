package com.chandrasekhar.phase1.iocdi.task1_constructor_injection;

import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationService {
    public void send(String message){
        System.out.println("Notification: "+ message);
    }
}
