package com.chandrasekhar.phase1.config.Task3_Java_based_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public TimeService timeService() {
        return new TimeService();
    }
    @Bean
    public GreetingService greetingService() {
        return new GreetingService(timeService());
    }
}
