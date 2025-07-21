package org.example;

public class Alien {
    private int age;

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
    }
}
