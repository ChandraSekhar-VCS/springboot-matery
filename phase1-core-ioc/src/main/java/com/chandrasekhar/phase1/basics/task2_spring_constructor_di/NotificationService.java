package com.chandrasekhar.phase1.basics.task2_spring_constructor_di;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public void send(String message){
        System.out.println("Notification: "+ message);
    }
}
