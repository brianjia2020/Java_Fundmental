package com.brian.brian.java2;

public class Person {
    String name;
    int age;
    public Person(){}
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Eat...");
    }
    public void walk(int n){
        System.out.println("Walked "+ n +" miles");
    }
}
