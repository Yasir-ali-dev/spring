
package com.spring;

import com.spring.classes.*;
import com.spring.interfaces.Animal;
import com.spring.interfaces.Artist;
import com.spring.interfaces.Bank;
import com.spring.interfaces.Drawable;

/*
    An interface in Java is a blueprint of a class. It has static constants and abstract methods.
    The interface in Java is a mechanism to achieve abstraction.
    There can be only abstract methods in the Java interface, not method body.
    It is used to achieve abstraction and multiple inheritance in Java.
*/
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Drawable draw= new Rectangle();
        Bank bank=new SindhBank();
        Artist kabir = new Kabir();
        Nadir nadir =new Nadir();
        Animal dog = new Dog();
        dog.walk();
        dog.makeNoise();
    }
}