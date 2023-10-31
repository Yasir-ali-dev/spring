package com.spring.implementations;

import com.spring.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "bridgeStoneTyres")
@Primary
public class BridgeStoneTyres implements Tyres {
    public String rotate(){
        return "Moving Vehicle with BridgeStoneTyres";
    }
}

