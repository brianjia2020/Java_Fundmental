package com.brian.Java_OOD.factory.absFactory.pizzastore.pizza;

/**
 * abstract class Pizza to be extended
 */
public abstract class Pizza {
    protected String name;

    //each pizza has different raw materials, so it's abstract
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " is baking.");
    }
    public void cut(){
        System.out.println(name + " is cutting.");
    }
    public void box(){
        System.out.println(name + " is boxing.");
    }
    public void setName(String name) {
        this.name = name;
    }
}
