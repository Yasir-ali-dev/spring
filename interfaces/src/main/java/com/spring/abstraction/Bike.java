package com.spring.abstraction;

abstract class Bike {
    public Bike(){
        System.out.println("Bike abstract class");
    }
    abstract void run ();

    public void changeGear(){
        System.out.println("changing gear");
    }

}
