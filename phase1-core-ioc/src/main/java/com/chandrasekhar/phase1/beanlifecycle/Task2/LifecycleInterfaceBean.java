package com.chandrasekhar.phase1.beanlifecycle.Task2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class LifecycleInterfaceBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean initialization using InitializingBean");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroying using DisposableBean");
    }
}
