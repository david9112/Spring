package org.example;

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
