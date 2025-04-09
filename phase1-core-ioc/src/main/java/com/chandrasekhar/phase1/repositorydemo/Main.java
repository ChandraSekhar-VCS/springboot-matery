package com.chandrasekhar.phase1.repositorydemo;

import com.chandrasekhar.phase1.repositorydemo.config.AppConfig;
import com.chandrasekhar.phase1.repositorydemo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.printAllUsers();
        context.close();
    }
}
