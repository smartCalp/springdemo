package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringdemoApplication {
    @RequestMapping(value = "/hello" , method= RequestMethod.GET)
    public String hello(){
        return "Hello World";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringdemoApplication.class, args);
    }

}
