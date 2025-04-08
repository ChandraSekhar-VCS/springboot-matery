package com.chandrasekhar.phase1.beanlifecycle.Task1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBean {
    public LifeCycleBean() {
        System.out.println("Constructor: LifeCycleBean initiated");
    }
    @PostConstruct
    public void init(){
        System.out.println("PostConstruct: Initialization logic after DI");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("PreDestroy: Cleanup logic before bean is destroyed");
    }
}
