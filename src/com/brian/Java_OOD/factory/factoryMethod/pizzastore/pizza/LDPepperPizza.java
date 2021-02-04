package com.brian.Java_OOD.factory.factoryMethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("LDPepperPizza");
        System.out.println("London Pepper Pizza is preparing.");
    }
}
