package com.example.beans;

public class Vehicle {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //this changes the name again to the name set by setName function.
    @Override
    public String toString(){
        return name;
    }
}
