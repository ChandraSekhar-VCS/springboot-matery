package com.chandrasekhar.phase1.config.Task1_xml_based_configuration;

public class GreetingService {
    private TimeService timeService;
    public void setTimeService(TimeService timeService) {
        this.timeService = timeService;
    }
    public void greet(String name) {
        System.out.println("Hello , " + name + "!");
        timeService.getTime();
    }
}
