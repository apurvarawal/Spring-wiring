package com.example.main;

import com.example.beans.Animal;
import com.example.beans.Food;
import com.example.config.ProjectConfig3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3.class);
        Food food = context.getBean(Food.class);
        Animal animal = context.getBean(Animal.class);
        System.out.println(food.getName());
        System.out.println(animal.getName());
        System.out.println(animal.getFood());
    }
}
