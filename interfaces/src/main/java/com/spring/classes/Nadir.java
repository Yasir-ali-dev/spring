package com.spring.classes;

import com.spring.interfaces.Bank;
import com.spring.interfaces.Drawable;
import com.spring.interfaces.Printable;

    // class Nadir is achieving multiple inheritance by having more than parent
public class Nadir implements Printable, Drawable {
    @Override
    public void draw() {
        System.out.println("Nadir can draw");
    }
    @Override
    public void print() {
        System.out.println("Nadir also has printer");
    }
}
