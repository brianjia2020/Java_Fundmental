package com.brian.Java_OOD.factory.absFactory.pizzastore.order;

import com.brian.Java_OOD.factory.absFactory.pizzastore.pizza.Pizza;

//abstract factory level
public interface AbsFactory {
    public Pizza createPizza(String orderType);

}
