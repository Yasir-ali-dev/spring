package com.spring.classes;

import com.spring.interfaces.Drawable;

public class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}
