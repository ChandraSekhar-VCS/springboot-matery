package com.chandrasekhar.phase1.config.Task3_Java_based_configuration;

public class GreetingService {
    private TimeService timeService;

    public GreetingService(TimeService timeService) {
        this.timeService = timeService;
    }

    public void greet(String name) {
        System.out.println("Hello " + name);
        timeService.getTime();
    }
}
