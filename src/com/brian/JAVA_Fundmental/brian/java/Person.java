package com.brian.JAVA_Fundmental.brian.java;

public class Person extends Creature{

    String name;
    int age;

    public Person(){};
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Eat...");
    }

    public void sleep(){
        System.out.println("Sleep...");
    }
}
