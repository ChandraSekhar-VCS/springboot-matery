package com.chandrasekhar.phase1.beanlifecycle.Task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(LifeCycleBean.class);
        context.registerShutdownHook();
    }
}
