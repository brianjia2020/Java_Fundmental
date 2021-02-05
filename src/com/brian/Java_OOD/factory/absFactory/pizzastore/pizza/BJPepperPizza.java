package com.brian.Java_OOD.factory.absFactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJPepperPizza");
        System.out.println("Beijing Pepper Pizza is preparing.");
    }
}
