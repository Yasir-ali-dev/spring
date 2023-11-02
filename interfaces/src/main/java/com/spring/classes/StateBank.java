package com.spring.classes;

import com.spring.interfaces.Bank;

public class StateBank implements Bank {
    @Override
    public float rateOfInterest(){
        return 0.9f;
    }
}
