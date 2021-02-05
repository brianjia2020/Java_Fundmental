package com.brian.Java_OOD.factory.absFactory.pizzastore.order;

import com.brian.Java_OOD.factory.absFactory.pizzastore.pizza.Pizza;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class OrderPizza {
    AbsFactory factory;
    private void setAbsFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;
        do {
            String type = getType();
            pizza = factory.createPizza(type);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("order failed");
                break;
            }
        } while (true);
    }

    public OrderPizza(AbsFactory factory){
        setAbsFactory(factory);
    }


    public String getType(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
