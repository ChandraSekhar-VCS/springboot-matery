package com.chandrasekhar.phase1.iocdi.task5_circular_dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class B {
    @Autowired
    @Lazy private A a;
}
