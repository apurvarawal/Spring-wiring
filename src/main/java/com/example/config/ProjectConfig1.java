package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig1 {
    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("ferrari");
        return vehicle;
    }


    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("Linda");
        person.setVehicle(vehicle());
        return person;
    }

}
