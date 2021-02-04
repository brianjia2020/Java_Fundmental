package com.brian.Java_OOD.factory.factoryMethod.pizzastore.pizza;

public class LDCheesePepper extends Pizza{

    @Override
    public void prepare() {
        setName("LDCheesePizza");
        System.out.println("London Cheese Pizza is preparing.");
    }
}
