package com.spring.main;

import com.spring.beans.Person;
import com.spring.beans.Vehicle;
import com.spring.projectConfig.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String [] persons = context.getBeanNamesForType(Person.class);
        String [] vehicles = context.getBeanNamesForType(Vehicle.class);

        Person person = context.getBean(Person.class) ;
        Vehicle vehicle=context.getBean(Vehicle.class);

        System.out.println(person.getName());
        System.out.println(person.getVehicle().getName());


        person.getVehicle().getVehicleServices().moveVehicle();
        person.getVehicle().getVehicleServices().playMusic();



    }
}