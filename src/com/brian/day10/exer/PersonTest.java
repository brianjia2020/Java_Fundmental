package com.brian.day10.exer;

/**
 * Constructor and its usage:
 *     1. constructor Object && initialize object attributes
 *     2. if no obvious constructor, system defaults to non-input constructor
 *     3. define default constructor:
 *         access-controller, class Name, (input params){}
 *
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(1);
        System.out.println(person.getAge());
    }
}
