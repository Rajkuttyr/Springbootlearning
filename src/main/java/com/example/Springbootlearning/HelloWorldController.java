package com.example.Springbootlearning;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }


}


// This is a simple Spring Boot application that serves a REST endpoint
// at "/hello" which returns a greeting message. The application is set up to run
// with the main method in SpringbootlearningApplication.java.
//