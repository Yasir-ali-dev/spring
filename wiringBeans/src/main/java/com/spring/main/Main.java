package com.spring.main;

import com.spring.person.Person;
import com.spring.projectConfig.Config;
import com.spring.vehicle.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            var context =new  AnnotationConfigApplicationContext(Config.class);
            Person person = context.getBean(Person.class);
            Vehicle vehicle = context.getBean(Vehicle.class);
            System.out.println("Person name from spring context - "+person.getName());
            System.out.println("Vehicle name from spring context - "+vehicle.getName());
            System.out.println("Vehicle that owns person - "+person.getVehicle());

    }
}