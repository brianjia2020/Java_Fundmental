package com.brian.Java_OOD.factory.absFactory.pizzastore.order;

import com.brian.Java_OOD.factory.absFactory.pizzastore.pizza.BJCheesePizza;
import com.brian.Java_OOD.factory.absFactory.pizzastore.pizza.BJPepperPizza;
import com.brian.Java_OOD.factory.absFactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
