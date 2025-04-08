package com.chandrasekhar.phase1.config.Task2_annotation_based_configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GreetingService greetingService = context.getBean(GreetingService.class);
        greetingService.greet("Chandra");
        context.close();
    }
}
