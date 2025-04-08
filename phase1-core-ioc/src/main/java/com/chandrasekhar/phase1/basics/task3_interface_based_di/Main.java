package com.chandrasekhar.phase1.basics.task3_interface_based_di;

import com.chandrasekhar.phase1.basics.task3_interface_based_di.service.EmailNotificationService;
import com.chandrasekhar.phase1.basics.task3_interface_based_di.service.INotificationService;

public class Main {
    public static void main(String[] args) {
        INotificationService notificationService = new EmailNotificationService();
        UserService userService = new UserService(notificationService);
        userService.registerUser("Chandra Sekhar");
    }
}
