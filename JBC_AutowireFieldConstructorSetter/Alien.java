package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    private int age;
    @Autowired
    @Qualifier("laptop")
    private Computer com;

    public Computer getcom() {
        return com;
    }

    public void setcom(Computer com) {
        this.com = com;
    }

    public Alien() {
        System.out.println("Alien object created");
    }

//    public Alien(int age) {
//        System.out.println("parameterized constructor called");
//        this.age = age;
//    }

@ConstructorProperties({"age","com"})           //this is used to solve sequencing in  the constructor injection for name
public Alien(int age, Computer com) {
        System.out.println("parameterized constructor called");
        this.age = age;
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
//        System.out.println("setter called");
    }

    public void code(){

        System.out.println("Coding..");
        com.compile();
    }
}
