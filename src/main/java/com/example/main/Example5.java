package com.example.main;

import com.example.beans.Company;
import com.example.config.ProjectConfig4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig4.class);
        Company company = context.getBean(Company.class);
        System.out.println(company.getName());
        System.out.println(company.getEmployee());
    }
}
