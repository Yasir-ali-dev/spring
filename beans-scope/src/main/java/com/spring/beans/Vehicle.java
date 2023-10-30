package com.spring.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
@Lazy
public class Vehicle {
    // In singleton bean scope, Every unique bean maintain a single object instance
    private String name;

    public Vehicle(){
        System.out.println("Vehicle bean instantiated");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
