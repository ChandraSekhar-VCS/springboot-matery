package com.chandrasekhar.phase1.beanlifecycle.Task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(AnnotatedBeanlifecycle.class);
        context.registerShutdownHook();
    }
}
