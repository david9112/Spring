package org.example;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private Laptop lap;

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public Alien() {
        System.out.println("Alien object created");
    }

//    public Alien(int age) {
//        System.out.println("parameterized constructor called");
//        this.age = age;
//    }

@ConstructorProperties({"age","lap"})           //this is used to solve sequencing in  the constructor injection for name
public Alien(int age, Laptop lap) {
        System.out.println("parameterized constructor called");
        this.age = age;
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("setter called");
    }

    public void code(){

        System.out.println("Coding..");
        lap.compile();
    }
}
