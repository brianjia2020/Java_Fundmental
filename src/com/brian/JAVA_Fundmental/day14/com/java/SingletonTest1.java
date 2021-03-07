package com.brian.JAVA_Fundmental.day14.com.java;

public class SingletonTest1 {
    public static void main(String[] args) {
        Bank instance1 = Bank.getInstance();
        Bank instance2 = Bank.getInstance();
        System.out.println(instance1==instance2);
    }
}

//hungry man
class Bank {
    //1. private constructor
    private Bank(){}
    //2. create an internal instance - static
    private static Bank instance = new Bank();
    //3. public method to return the instance - static
    public static Bank getInstance(){
        return instance;
    }
}
