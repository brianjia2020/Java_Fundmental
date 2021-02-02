package com.brian.Java_OOD.singleton.type5;

/**
 * Thread safe and efficient compared to type4
 * Recommended!!!!!
 */
public class SingletonTest5 {
    public static void main(String[] args) {
        com.brian.Java_OOD.singleton.type5.Singleton instance = com.brian.Java_OOD.singleton.type5.Singleton.getInstance();
        com.brian.Java_OOD.singleton.type5.Singleton instance1 = com.brian.Java_OOD.singleton.type5.Singleton.getInstance();
        //these two instances are the same. they point to the same address
        System.out.println(instance1==instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());
    }
}

class Singleton{
    private static volatile Singleton instance;

    private Singleton(){};

    //a public static method, only when you use the method, the instance will be created
    //add synchronized key word to guarantee thread safe
    //double check this way can guarantee thread safe and efficiency.
    public static Singleton getInstance(){
        if(instance ==null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
