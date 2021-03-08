package com.brian.JAVA_Fundmental.day15;

/**
 * interface
 * 1. JDK 7 and before: define global attribute and abstract method
 * 2. JDK 8: static method and default method
 */
public class InterfaceTest {
    public static void main(String[] args) {

    }
}


interface flyable{
    //global variable
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;

    public abstract void fly();
    void stop();

}
