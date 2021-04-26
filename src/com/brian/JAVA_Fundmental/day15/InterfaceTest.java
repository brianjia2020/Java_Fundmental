package com.brian.JAVA_Fundmental.day15;

import java.awt.*;

/**
 * interface
 * 1. JDK 7 and before: define global attribute and abstract method
 * 2. JDK 8: static method and default method
 *
 *
 *
 *
 * 4. a class can implement multiple interfaces
 * 5.
 * 6.
 * 7. interface can inherits(extends) another many interface
 * 8. interface is a standard reflecting like "if you wanna be able to do something, you have to follow some standards."
 *
 */
public class InterfaceTest {
    public static void main(String[] args) {
//        System.out.println(flyable.MAX_SPEED);
        Plane plane = new Plane();
        plane.fly();
    }
}

interface attackable {
    void attack();
}
interface flyable{
    //global variable
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;

    public abstract void fly();
    public abstract void stop();
}

class Plane implements flyable{

    @Override
    public void fly() {
        System.out.println("Plane is flying...");
    }

    @Override
    public void stop() {
        System.out.println("Plane is stopping...");
    }
}

class Bullet implements flyable,attackable{

    @Override
    public void attack() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}

interface AA{
    void method1();
}
interface BB{
    void method2();
}

//once inherited, CC will have method1, method2
interface CC extends AA,BB{}

