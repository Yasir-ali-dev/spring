package com.spring.implementations;

import com.spring.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers {
    public String makeSound(){
        return "playing music with Sony Speakers";
    }
}
