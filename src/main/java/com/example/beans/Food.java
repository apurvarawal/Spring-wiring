package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Food {
    private String name = "cheese";

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
