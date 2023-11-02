package com.spring.classes;

import com.spring.interfaces.Animal;

public class Dog implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Woooh woooh");
    }
}
