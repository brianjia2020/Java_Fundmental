package com.brian.Java_OOD.singleton.type6;


import com.brian.Java_OOD.singleton.type4.SingletonTest4;

/**
 * Using static inner class
 * thread safe, lazy loading
 * Recommended!!!!!
 */
public class SingletonTest6 {
    public static void main(String[] args) {
        com.brian.Java_OOD.singleton.type6.Singleton instance = com.brian.Java_OOD.singleton.type6.Singleton.getInstance();
        com.brian.Java_OOD.singleton.type6.Singleton instance1 = com.brian.Java_OOD.singleton.type6.Singleton.getInstance();
        //these two instances are the same. they point to the same address
        System.out.println(instance1==instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());
    }
}

class Singleton{
    private static volatile Singleton instance;

    //private constructor
    private Singleton(){};

    //inner static class is thread safe and lazy loading.
    //When JVM loads SingletonInstance, it's thread safe
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
