package com.spring.classes;

import com.spring.interfaces.Drawable;

public class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}
