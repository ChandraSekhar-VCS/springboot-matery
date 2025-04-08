package com.chandrasekhar.phase1.basics.task1_manual_tightcoupling;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        UserService userService = new UserService();
        userService.regiseterUser("Chandra Sekhar");
    }
}
