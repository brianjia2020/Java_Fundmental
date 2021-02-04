package com.brian.Java_OOD.factory.simpleFactory.pizzastore.order;

import com.brian.Java_OOD.factory.simpleFactory.pizzastore.pizza.CheesePizza;
import com.brian.Java_OOD.factory.simpleFactory.pizzastore.pizza.GreekPizza;
import com.brian.Java_OOD.factory.simpleFactory.pizzastore.pizza.PepperPizza;
import com.brian.Java_OOD.factory.simpleFactory.pizzastore.pizza.Pizza;

public class SimplePizzaFactory {

    //based on order type, return the Pizza object
    public static Pizza createPizza(String orderType){
        System.out.println("using the simpleFactory mode");
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("greek pizza");
        } else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("cheese pizza");
        } else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("pepper pizza");
        }
        return pizza;
    }
}
