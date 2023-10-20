package com.spring.config;

import com.spring.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.spring.beans")
public class ProjectConfig {
    //By default, spring provides method as bean name; but we can provide custom name to the beans

    // Primary annotation Bean is the default Bean in case of multiple Bean of same Obj or method
    @Primary
    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Honda Civic");
        return  veh;
    }

    @Bean("ferrariVehicle")
    Vehicle vehicle2 (){
        Vehicle ferrari= new Vehicle();
        ferrari.setName("ferrari");
        return ferrari;
    }
    @Bean(name = "fordVehicle")
    Vehicle vehicle3 (){
        Vehicle ford = new Vehicle();
        ford.setName("ford");
        return ford;
    }
    @Bean(value = "toyotaVehicle")
    Vehicle vehicle4(){
        Vehicle veh = new Vehicle();
        veh.setName("Toyota");
        return veh;
    }

    @Bean
    String hello(){
        return "Say Hello!";
    }
    @Bean
    Integer number(){
        return 12;
    }

}
