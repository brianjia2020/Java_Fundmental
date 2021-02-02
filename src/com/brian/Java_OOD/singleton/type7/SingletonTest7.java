package com.brian.Java_OOD.singleton.type7;

/**
 * enum type
 */
public class SingletonTest7 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

/**
 * by using enum, we can have single instance
 */
enum Singleton{
    INSTANCE; //attribute
    public void sayOK(){
        System.out.println("Okay");
    }
}
