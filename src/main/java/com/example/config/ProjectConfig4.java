package com.example.config;

import com.example.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig4 {
    @Bean
    Employee employee1(){
        var emp = new Employee();
        emp.setName("Ramesh");
        return emp;
    }

    @Bean
    Employee employee2(){
        var emp = new Employee();
        emp.setName("Suresh");
        return emp;
    }

    @Bean
//    @Primary
    Employee employee3(){
        var emp = new Employee();
        emp.setName("Hitesh");
        return emp;
    }
}
