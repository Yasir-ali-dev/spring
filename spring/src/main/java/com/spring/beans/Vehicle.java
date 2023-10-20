package com.spring.beans;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    void initialize (){
        this.name="Ford Mustang";
    }

    @PreDestroy
    public void destroy (){
        System.out.println("vehicle Bean destroyed");
    }


    public void printHello (){
        System.out.println("Hello form component Bean Vehicle");
    }
}

















