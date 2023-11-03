package com.spring.abstraction;

// abstract class can be used to implement interface not force to the implementaion of all methods
abstract class Building implements School{
    @Override
    public int floors() {
        return 3;
    }
}
