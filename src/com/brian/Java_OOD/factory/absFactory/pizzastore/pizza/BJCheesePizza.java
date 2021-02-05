package com.brian.Java_OOD.factory.absFactory.pizzastore.pizza;

public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("Beijing Cheese Pizza is preparing.");
    }
}
