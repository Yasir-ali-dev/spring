package com.spring.main;

import com.spring.beans.Vehicle;
import com.spring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Mehran <3");
        System.out.println("without IOC container "+vehicle.getName());
        */

        // annotation config
        // NoUniqueBeanDefinitionException
        // No qualifying bean of type 'com.spring.beans.Vehicle' available: expected single matching bean but found 3: vehicle,vehicle2,vehicle3

        var context = new  AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh =  context.getBean( Vehicle.class);
        System.out.println("with IOC container "+veh.getName());
        veh.printHello();

        //context.close();



        /*
        Vehicle ferrari= context.getBean("ferrariVehicle", Vehicle.class);
        System.out.println(ferrari.getName());
        ferrari.printHello();

        Vehicle toyota = context.getBean("toyotaVehicle", Vehicle.class);
        System.out.println(toyota.getName());
        */

        /*
        String msg = context.getBean(String.class);
        System.out.println(msg);

        Integer number = context.getBean(Integer.class);
        System.out.println("Integer number "+number);
        */




    }
}