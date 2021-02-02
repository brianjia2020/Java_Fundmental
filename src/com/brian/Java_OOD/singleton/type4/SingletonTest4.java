package com.brian.Java_OOD.singleton.type4;

/**
 * Thread safe but not efficient
 */
public class SingletonTest4 {
    public static void main(String[] args) {
        com.brian.Java_OOD.singleton.type4.Singleton instance = com.brian.Java_OOD.singleton.type4.Singleton.getInstance();
        com.brian.Java_OOD.singleton.type4.Singleton instance1 = com.brian.Java_OOD.singleton.type4.Singleton.getInstance();
        //these two instances are the same. they point to the same address
        System.out.println(instance1==instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){};

    //a public static method, only when you use the method, the instance will be created
    //add synchronized key word to guarantee thread safe
    //but the efficiency is too slow as when multi-threads has to wait here and every thread
    //it's doable but not efficient enough
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

}
