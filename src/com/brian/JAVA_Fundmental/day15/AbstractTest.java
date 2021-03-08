package com.brian.JAVA_Fundmental.day15;

/**
 * abstract can be used to describe
 *     1. class
 *     2. method
 */
public class AbstractTest {
    public static void main(String[] args) {
        
    }
}


abstract class Person {
    String name;
    int age;

    public abstract void eat();
}

class Student extends Person {

    @Override
    public void eat() {
        System.out.println("");
    }
}