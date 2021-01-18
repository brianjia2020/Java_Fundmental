package com.brian.brian.java;

/**
 * 1. OOP - inheritance
 * benefits of inheritance
 *      1. reduce code redundancy and increase code repeatability
 *      2. easy to extend functionality
 *      3. prepare for polymorphism
 * 2. Inheritance:  class A extends B {}
 *      A: subclass
 *      B: superclass
 * 3. once A extends B, A got all the attributes and methods from B
 *      3.1 private attributes and methods will be passed onto child class. only
 *      due to encapsulated, child class still have to use getter and setter
 *      to call.
 *      3.2 child class can also declare its own specific attributes and methods
 * 4. java inheritance rules:
 *      4.1 one class can only inherit one super class
 *      4.2 one class can be inherited by many classes
 *      4.3 sub/super class are relative. Inheritance can have multiple layers. (A extends B, B extends C)
 * 5. If we haven't declared super class, by default any class will inherit java.lang.Object.
 *    All java class directly or indirectly inherit Object class.
 *    All java class have the basic functionality of the Object class.
 *
 */
public class ExtendsTest {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
        Student s1 = new Student();
        s1.eat();
        s1.breathe();

        Creature c1 = new Creature();
        c1.breathe();
        System.out.println(c1.toString());
    }

}
