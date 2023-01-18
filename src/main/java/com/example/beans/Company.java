package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Company {
    private String name = "Google";

    private final Employee employee;
//--------------------------------------------------------------------
//    Case 1: when employee is mentioned clearly, i.e., employee1
//    @Autowired
//    public Company(Employee employee1){
//        this.employee = employee1;
//    }

//---------------------------------------------------------------------
//     Case 2: when employee is not mentioned clearly, then the @Primary annotation employee will be considered.
//    @Autowired
//    public Company(Employee employee){
//        this.employee = employee;
//    }

//---------------------------------------------------------------------
//    Case 3: when neither the employee is mentioned clearly, nor the @Primary annotation is present.
//        In this case, the IOC container will look for the @Qualifier value.
        @Autowired
        public Company(@Qualifier("employee2") Employee employee){
            this.employee = employee;
        }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public Employee getEmployee() {
        return employee;
    }



}
