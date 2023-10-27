package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name="Alex";
    private final Vehicle vehicle;


    //. constructor parameter name should be same bean name
    //. @Primary configuration is the by default bean-selector
    //. @Qualifier("bean-name") is the best way to inject bean

    @Autowired
    public Person(@Qualifier("vehicle2") Vehicle vehicle) {
        System.out.println("Person bean is created in Person construtor");
        this.vehicle=vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}
