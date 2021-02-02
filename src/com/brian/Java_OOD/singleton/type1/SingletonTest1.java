package com.brian.Java_OOD.singleton.type1;

/**
 *
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        //these two instances are the same. they point to the same address
        System.out.println(instance1==instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());
    }
}

/**
 * this way is doable and is multi-thread safe
 * However, it kind wastes memory resources if it's not been used
 *
 * We are looking for something, lazy loading
 */
class Singleton1{
    //private constructor, no external access
    private Singleton1(){}

    //create an instance internally
    private final static Singleton1 instance = new Singleton1();

    //static method for external access
    public static Singleton1 getInstance(){
        return instance;
    }

}