package com.spring.interfaces;

public interface Animal {
    void makeNoise();

    // interface can have method body if it is default method
    default void walk(){
        System.out.println("Animal is walking!!");
    }
}
