package com.brian.Java_OOD.factory.simpleFactory.pizzastore.order;

/**
 * equivalent to a client side,
 * send order request
 *
 *
 * Summary: traditional way can do the job, but it violates the OCP rule
 *          if we need to add one more pizza, we need to modify the OrderPizza constructor
 */
public class PizzaStore {

    public static void main(String[] args) {
        //1. traditional way
//        new OrderPizza();

        //2. simple factory
        new OrderPizza(new SimplePizzaFactory());
    }
}
