package com.chandrasekhar.phase1.beanscopes.task1_singletone_prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SingletonExample singletonExample1 = context.getBean(SingletonExample.class);
        SingletonExample singletonExample2 = context.getBean(SingletonExample.class);

        PrototypeExample prototypeExample1 = context.getBean(PrototypeExample.class);
        PrototypeExample prototypeExample2 = context.getBean(PrototypeExample.class);

        System.out.println("SingletonExample 1: " + singletonExample1);
        System.out.println("SingletonExample 2: " + singletonExample2);

        System.out.println("PrototypeExample1: " + prototypeExample1);
        System.out.println("PrototypeExample2: " + prototypeExample2);
    }
}
