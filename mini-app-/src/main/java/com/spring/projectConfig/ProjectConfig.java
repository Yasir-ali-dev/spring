package com.spring.projectConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.spring.Services","com.spring.implementations"})
@ComponentScan(basePackageClasses = {com.spring.beans.Vehicle.class,com.spring.beans.Person.class})
public class ProjectConfig {

}
