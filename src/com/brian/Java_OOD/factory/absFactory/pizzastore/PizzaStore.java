package com.brian.Java_OOD.factory.absFactory.pizzastore;

import com.brian.Java_OOD.factory.absFactory.pizzastore.order.BJFactory;
import com.brian.Java_OOD.factory.absFactory.pizzastore.order.LDFactory;
import com.brian.Java_OOD.factory.absFactory.pizzastore.order.OrderPizza;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }
}
