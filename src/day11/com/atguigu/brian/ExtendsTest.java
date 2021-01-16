package day11.com.atguigu.brian;

import org.junit.Test;

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
 */
public class ExtendsTest {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
        Student s1 = new Student();
        s1.eat();
    }

}
