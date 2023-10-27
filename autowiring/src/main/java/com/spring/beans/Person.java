package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name="Alex";

    //@Autowired annotation on class field {not recommended in the production } b/c we can't make field final
    //@Autowired


    //private Vehicle vehicle;


    // final can be used @Autowired constructer
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
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

    //@autowired with setter method {not recommended in the production } b/c we can't make field final
    //@Autowired
    /*
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

     */

}
