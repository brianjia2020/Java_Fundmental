package com.brian.JAVA_Fundmental.day14.com.java;

public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1==order2);
    }
}

class Order {
    //1. private constructor
    private Order(){}
    //2. declare the instance
    private static Order instance = null;
    //3.
    public static Order getInstance(){
        if(instance==null){
            instance = new Order();
        }
        return instance;
    }
}