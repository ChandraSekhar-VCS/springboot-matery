package com.chandrasekhar.phase1.config.Task2_annotation_based_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    @Autowired
    private  TimeService timeService;

    public void greet(String name){
        System.out.println("Hello "+name);
        timeService.getTime();
    }
}
