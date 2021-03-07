package com.brian.JAVA_Fundmental.day14.com.java;

/**
 * code blocks:
 *     1. initiate the class and object
 *     2. can only use static to describe
 *     3. category: static/non-static code blocks
 *
 * static code blocks: every time static method or attribute is used,
 * non-static code blocks:
 *
 *
 * sequence: farther first son second, static first
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
    }
}

class Person {

    //attributes
    String name;
    int age;
    static String desc = "I am a person";

    //constructors
    public Person(){};

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //code blocks
    static {
        System.out.println("Hello static code blocks");
    }

    {
        System.out.println("Hello non-static code blocks");
    }

    public void eat(){
        System.out.println("I am eating");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
