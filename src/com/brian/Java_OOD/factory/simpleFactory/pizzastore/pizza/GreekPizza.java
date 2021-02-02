package com.brian.Java_OOD.factory.simpleFactory.pizzastore.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(name + " is preparing raw material for greek pizza.");
    }
}
