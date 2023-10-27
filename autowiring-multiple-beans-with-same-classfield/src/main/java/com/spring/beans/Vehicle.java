package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
public class Vehicle {
    private String name;

    // avoiding circular dependency
    /*
    private Person person;
    public Person getPerson() {
        return person;
    }
    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }
    */

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("printing hello from component vehicle Bean ");
    }

    @Override
    public String toString(){
        return "Vehicle name is "+this.name;
    }

}
