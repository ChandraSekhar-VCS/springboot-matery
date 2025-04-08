package com.chandrasekhar.phase1.iocdi.task3_field_injection;

import org.springframework.stereotype.Component;

@Component
public class AnalyticsService {

    public void trackEvent(String event){
        System.out.println("Tracking the event: " + event);
    }
}
