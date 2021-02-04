package com.brian.Java_OOD.factory.simpleFactory.pizzastore.order;

import com.brian.Java_OOD.factory.simpleFactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza2 {
    Pizza pizza = null;
    String orderType = "";

    public OrderPizza2(){
        do{
            orderType = getType();
            pizza = SimplePizzaFactory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            }
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
