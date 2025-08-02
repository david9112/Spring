package com.example.spring_security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String greet(HttpServletRequest request){
        return "hello world Session id: " + request.getSession().getId();
    }

    @GetMapping("/david")
    public String david(HttpServletRequest request){
        return "hello david Session id: " + request.getSession().getId();
    }

    @GetMapping("/")
    public String home(HttpServletRequest request){
        return "Welcome to home page :) ";
    }
}
