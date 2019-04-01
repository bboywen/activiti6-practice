package com.imporven.activiti6practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = org.activiti.spring.boot.SecurityAutoConfiguration.class)
public class Activiti6PracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Activiti6PracticeApplication.class, args);
    }

}
