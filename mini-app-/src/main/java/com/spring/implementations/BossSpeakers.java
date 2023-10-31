package com.spring.implementations;

import com.spring.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BossSpeakers implements Speakers {
    public String makeSound(){
        return "Playing music with Boss Speakers";
    }
}
