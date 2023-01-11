package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal {
    private String name = "Bella";

    //for Example 4
    @Autowired
    public Animal(Food food){
        this.food = food;
    }

    //@Autowired {Uncomment this for Example 3
    private Food food;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Food getFood(){
        return food;
    }

    public void setFood(Food food){
        this.food = food;
    }
}
