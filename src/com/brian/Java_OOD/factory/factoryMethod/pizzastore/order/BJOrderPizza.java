package com.brian.Java_OOD.factory.factoryMethod.pizzastore.order;

import com.brian.Java_OOD.factory.factoryMethod.pizzastore.pizza.BJCheesePizza;
import com.brian.Java_OOD.factory.factoryMethod.pizzastore.pizza.BJPepperPizza;
import com.brian.Java_OOD.factory.factoryMethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
