package com.chandrasekhar.phase1.beanlifecycle.Task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(LifecycleInterfaceBean.class);
        context.registerShutdownHook();
    }
}
