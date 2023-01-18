package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {


    public String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
}
