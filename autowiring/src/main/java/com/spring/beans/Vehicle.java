package com.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name="Ford Mustang";

    public Vehicle(){
        System.out.println("Vehicle Bean is created");
    }

    public String getName() {
        return name;
    }

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
