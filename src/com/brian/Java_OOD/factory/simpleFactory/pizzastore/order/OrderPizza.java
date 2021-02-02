package com.brian.Java_OOD.factory.simpleFactory.pizzastore.order;

import com.brian.Java_OOD.factory.simpleFactory.pizzastore.pizza.CheesePizza;
import com.brian.Java_OOD.factory.simpleFactory.pizzastore.pizza.GreekPizza;
import com.brian.Java_OOD.factory.simpleFactory.pizzastore.pizza.PepperPizza;
import com.brian.Java_OOD.factory.simpleFactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OrderPizza {


    //Simple factory way
    private SimplePizzaFactory simplePizzaFactory;
    Pizza pizza=null;
    public void setSimplePizzaFactory(SimplePizzaFactory simplePizzaFactory){
        String orderType = ""; //user input
        this.simplePizzaFactory = simplePizzaFactory;
        do {
            orderType = getType();
            pizza = this.simplePizzaFactory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("order unsuccessfully.");
                break;
            }
        } while(true);
    }

    //constructor
    public OrderPizza(SimplePizzaFactory simplePizzaFactory){
        setSimplePizzaFactory(simplePizzaFactory);
    }

//    //constructor
//    public OrderPizza(){
//        Pizza pizza = null;
//        String orderType;//type of order customer wants to order
//        do{
//            orderType = getType();
//            if(orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("greek pizza");
//            } else if(orderType.equals("cheese")){
//                pizza = new CheesePizza();
//                pizza.setName("cheese pizza");
//            } else if (orderType.equals("pepper")){
//                pizza = new PepperPizza();
//                pizza.setName("pepper pizza");
//            } else {
//                break;
//            }
//            //output the pizza order
//
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

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
