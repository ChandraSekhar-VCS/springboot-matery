package com.chandrasekhar.phase1.basics.task2_spring_constructor_di;

public class Main{
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        UserService userService = new UserService(notificationService);
        userService.registerUser("Chandra Sekhar");
    }
}
