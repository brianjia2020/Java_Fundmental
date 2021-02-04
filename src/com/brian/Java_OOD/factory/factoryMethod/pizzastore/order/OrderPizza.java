package com.brian.Java_OOD.factory.factoryMethod.pizzastore.order;

import com.brian.Java_OOD.factory.factoryMethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    //define an abstract method, createPizza
    abstract Pizza createPizza(String orderType);

        //constructor
    public OrderPizza(){
        Pizza pizza = null;
        String orderType;//type of order customer wants to order
        do{
            orderType = getType();
            pizza  = createPizza(orderType);
            //output the pizza order
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }




    //a method to dynamically get the type of pizza customer wants to order
    public String getType(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
