package com.brian.Java_OOD.factory.simpleFactory.pizzastore.pizza;

import com.sun.security.jgss.GSSUtil;

/**
 * newly added pizza
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(name + " is preparing for pepper pizza.");
    }
}
