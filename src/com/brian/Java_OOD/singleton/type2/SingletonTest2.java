package com.brian.Java_OOD.singleton.type2;

import com.brian.Java_OOD.singleton.type2.Singleton;

public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        //these two instances are the same. they point to the same address
        System.out.println(instance1==instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());

        //classical example of singleton
        Runtime runtime = Runtime.getRuntime();
    }
}

class Singleton{
    //private constructor, no external access
    private Singleton(){
    }

    //create an instance internally
    private static Singleton instance;

    static { //in the static code block to create the singleton instance
        instance = new Singleton();
    }

    //static method for external access
    public static Singleton getInstance(){
        return instance;
    }

}