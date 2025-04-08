package com.chandrasekhar.phase1.basics.task3_interface_based_di.service;

public class EmailNotificationService implements INotificationService{
    @Override
    public void send(String  message) {
        System.out.println("Email Notification: "+message);
    }
}
