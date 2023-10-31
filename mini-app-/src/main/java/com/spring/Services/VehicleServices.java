package com.spring.Services;

import com.spring.interfaces.Speakers;
import com.spring.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
    @Autowired
    private Speakers speakers;

    private Tyres tyres;

    public void playMusic (){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String move = tyres.rotate();
        System.out.println(move);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
