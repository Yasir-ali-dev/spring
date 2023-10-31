package com.spring.implementations;

import com.spring.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MichelinTyres implements Tyres {
    public String rotate(){
        return "Moving vehicle with michelin tyres";
    }
}
