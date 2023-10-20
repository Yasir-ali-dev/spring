package com.spring;

import com.spring.Bean.Cat;
import com.spring.ProjectConfig.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Cat meow = new Cat();
        meow.setName("Meow");
        Supplier <Cat> meowCatSupplier = () -> meow;

        Supplier <Cat> tomCatSupplier = () -> {
            Cat tom = new Cat();
            tom.setName("Tom");
            return tom;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println(randomNumber);

        if (randomNumber%2 == 0 ){
            context.registerBean("Meow", Cat.class, meowCatSupplier);
        }
        else{
            context.registerBean("Tom", Cat.class, tomCatSupplier);
        }

        Cat meowCat=null;
        Cat tomCat=null;

        try {
            meowCat = context.getBean("Meow", Cat.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating meow cat");
        }
        try{
            tomCat=context.getBean("Tom",Cat.class);
        }
        catch(NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating tom cat");
        }

        if (null != meowCat){
            System.out.println("Programmitacally created cat name "+meowCat.getName());
        }else{
            System.out.println("Programmitacally created cat name "+ tomCat.getName());
        }

    }
}