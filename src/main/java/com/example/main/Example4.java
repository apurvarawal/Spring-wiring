package com.example.main;

import com.example.beans.Animal;
import com.example.beans.Food;
import com.example.config.ProjectConfig3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.event.FocusAdapter;

public class Example4 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3.class);
        Animal animal = context.getBean(Animal.class);
        Food food = context.getBean(Food.class);
        System.out.println(animal.getName());
        System.out.println(food.getName());
        System.out.println(animal.getFood());
    }
}
