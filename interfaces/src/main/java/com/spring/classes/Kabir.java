package com.spring.classes;

import com.spring.interfaces.Artist;

    // kabir must implement sketch abstract method, and its parent interface abstract methods{print() & draw()}
public class Kabir implements Artist {
    @Override
    public void sketch() {
        System.out.println("Kabir is sketching");
    }

    @Override
    public void draw() {
        System.out.println("kabir is drawing ");
    }

    @Override
    public void print() {
        System.out.println("kabir is printing");
    }
}
