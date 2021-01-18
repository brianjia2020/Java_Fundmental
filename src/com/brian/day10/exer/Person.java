package com.brian.day10.exer;

/**
 * Person class:
 */
public class Person {
    private int age;

    public Person(){

    };

    public Person(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0||age>130){
            throw new RuntimeException("input age is illegal");
        }
        this.age = age;
    }
}
