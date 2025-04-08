package com.chandrasekhar.phase1.beanlifecycle.Task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.chandrasekhar.phase1.beanlifecycle.Task3")
public class AppConfig {
    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public AnnotatedBeanlifecycle annotatedBeanlifecycle() {
        return new AnnotatedBeanlifecycle();
    }
}
