package com.chandrasekhar.phase1.config.Task1_xml_based_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        greetingService.greet("Chandra");
    }
}
