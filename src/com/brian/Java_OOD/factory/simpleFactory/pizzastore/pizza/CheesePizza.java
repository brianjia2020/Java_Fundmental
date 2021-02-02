package com.brian.Java_OOD.factory.simpleFactory.pizzastore.pizza;

public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println(name + " is preparing the raw material for cheese pizza");
    }
}
