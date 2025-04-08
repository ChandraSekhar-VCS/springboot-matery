package com.chandrasekhar.phase1.iocdi.task1_constructor_injection;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        UserService userService = new UserService(notificationService);
        userService.notifyUser("Account created");
    }
}
