package com.spring.main;

import com.spring.beans.Person;
import com.spring.beans.Vehicle;
import com.spring.projectConfig.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        var context =new AnnotationConfigApplicationContext(ProjectConfig.class);

        // --- Singleton Scope Bean Example
        /*
        Vehicle vehcle1= context.getBean(Vehicle.class);
        Vehicle vehcle2= context.getBean(Vehicle.class);
        // Any modification to the object refers to the all objects that refers an object
        vehcle1.setName("King khan");
        System.out.println("Vehicle1  "+vehcle1.getName());
        System.out.println("Vehicle2 is also  "+vehcle2.getName());
        System.out.println("Vehicle1  "+vehcle1.hashCode());
        System.out.println("Vehicle1  "+vehcle2.hashCode());
        if(vehcle2 == vehcle1){
            System.out.println("Vehicle1 and vehicle2 is singleton scoped bean");
        }

        */

        // --- Eager and lazy instantiation { by default Eager }
        /*
        System.out.println("Before retrieving and referencing the bean");
        Vehicle vehicle1=context.getBean(Vehicle.class);
        System.out.println("After retrieving and referencing the bean");
        */
        /*
            with Eager --> bean instantiated at startup of application
                Vehicle bean instantiated
                Before retrieving and referencing the bean
                After retrieving and referencing the bean

            with Lazy --> bean instantiated when refers to the bean of application
                Before retrieving and referencing the bean
                Vehicle bean instantiated
                After retrieving and referencing the bean
        * */


        // prototyped scope
        Person person = context.getBean(Person.class);
        Person abrar = context.getBean(Person.class);
        person.setName("person");
        abrar.setName("abrar");
        System.out.println("person  "+person.hashCode());
        System.out.println("abrar  "+abrar.hashCode());
        System.out.println(abrar.getName());
        System.out.println(person.getName());

        if (!(person == abrar)){
            System.out.println("Bean is prototyped scope");
        }

    }
}