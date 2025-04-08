package com.chandrasekhar.phase1.beanlifecycle.Task3;

import org.springframework.stereotype.Component;

@Component
public class AnnotatedBeanlifecycle {
    public AnnotatedBeanlifecycle() {
        System.out.println("Constructor: AnnotatedBeanlifecycle instantiated");
    }
    public void customInit() {
        System.out.println("Custom init in action");
    }
    public void customDestroy() {
        System.out.println("Custome destroy in action");
    }
}
