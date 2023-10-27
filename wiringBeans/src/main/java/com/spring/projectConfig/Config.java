package com.spring.projectConfig;

import com.spring.person.Person;
import com.spring.vehicle.Vehicle;
import org.springframework.context.annotation.Bean;

public class Config {

    @Bean
    public Vehicle vehicle(){
        Vehicle veh = new Vehicle();
        veh.setName("Ferrari");
        return  veh;
    }

    // wiring beans using method call
    /*
    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("Muhammad Ali");
        // wiring beans using method call
        person.setVehicle(vehicle());
        return person;
    }
    */


    // wiring beans using method parameters
    @Bean
    public Person person (Vehicle vehicle){
        Person  person = new Person();
        person.setName("Aqeel Ali");

        // wiring beans using method parameters
        person.setVehicle(vehicle);
        return person;

    }


}
