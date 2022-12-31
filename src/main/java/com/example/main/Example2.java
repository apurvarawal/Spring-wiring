package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(person.getName());
        System.out.println(vehicle.getName());
        System.out.println(person.getVehicle());
    }
}
