package com.example.spring_security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
public class Student {
    private int rollNo;
    private String name;
    private String tech;
}
