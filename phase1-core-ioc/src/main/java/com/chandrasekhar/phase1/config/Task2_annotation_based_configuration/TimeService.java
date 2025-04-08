package com.chandrasekhar.phase1.config.Task2_annotation_based_configuration;

import org.springframework.stereotype.Component;

@Component
public class TimeService {
    public void getTime(){
        System.out.println( "The current time is: "+ System.currentTimeMillis());
    }
}
