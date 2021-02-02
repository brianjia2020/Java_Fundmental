package com.brian.Java_OOD.singleton.type3;

/**
 * lazy loading -- not thread safe
 * do not use this in production
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        com.brian.Java_OOD.singleton.type3.Singleton instance = com.brian.Java_OOD.singleton.type3.Singleton.getInstance();
        com.brian.Java_OOD.singleton.type3.Singleton instance1 = com.brian.Java_OOD.singleton.type3.Singleton.getInstance();
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
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

}
