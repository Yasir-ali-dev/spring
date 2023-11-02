package com.spring.classes;

import com.spring.interfaces.Bank;

public class SindhBank implements Bank {
    @Override
    public float rateOfInterest() {
        return 0.7f;
    }
}
