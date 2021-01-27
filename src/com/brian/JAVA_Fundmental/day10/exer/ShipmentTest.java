package com.brian.JAVA_Fundmental.day10.exer;

import org.junit.Test;

import java.util.*;

public class ShipmentTest{

    public static void main(String[] args) {
        List<Shipment> shipments = new ArrayList<>();
        for(int i = 0;i<2;i++){
            Shipment shipment = new Shipment();
            shipment.setDistanceToDestination(i);
            shipments.add(shipment);
        }

        for (Shipment s : shipments) {
            System.out.println(s);
        }

        shipments.sort((o1, o2) -> o2.getDistanceToDestination()-o1.getDistanceToDestination());

        shipments.forEach(System.out::println);

    }

    @Test
    public void test(){
        List<Leg> legs = new ArrayList<>();
        legs.add(new Leg(40));
        legs.add(new Leg(30));
        legs.add(new Leg(30));
        legs = calculateCost(10,legs);
        legs.forEach(System.out::println);
    }

    public List<Leg> calculateCost(int totalCost, List<Leg> legs){
        double perMileCost = 0;
        double check = 0;
        int allDistance = 0;
        for(Leg leg: legs) {
            allDistance += leg.getDistance();
        }
        perMileCost = (double) totalCost/allDistance;
        for (Leg leg: legs){
            double price = perMileCost * leg.getDistance();
            price = Math.round(price*100.0)/100.0;
            check += price;
            leg.setPrice(price);
        }

        //check the difference,
        if(totalCost - check!=0){
            double diff = Math.round((totalCost - check)*100.0)/100.0;
            double newPrice = legs.get(legs.size()-1).getPrice() + diff;
            legs.get(legs.size()-1).setPrice(newPrice);
        }
        return legs;
    }

}

class Leg {
    private int distance;
    private double price;

    public Leg() {
    }

    public Leg(int distance) {
        this.distance = distance;
    }

    public Leg(int distance, int price){
        this.distance = distance;
        this.price = price;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "distance=" + distance +
                ", price=" + price +
                '}';
    }
}

class Shipment {
    private int distanceToDestination;
    private String name;
    private boolean isTruck;

    public Shipment() {
    }

    public Shipment(int distanceToDestination, String name, boolean isTruck) {
        this.distanceToDestination = distanceToDestination;
        this.name = name;
        this.isTruck = isTruck;
    }

    public int getDistanceToDestination() {
        return distanceToDestination;
    }

    public void setDistanceToDestination(int distanceToDestination) {
        this.distanceToDestination = distanceToDestination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTruck() {
        return isTruck;
    }

    public void setTruck(boolean truck) {
        isTruck = truck;
    }

    @Override
    public String toString() {
        return "ShipmentTest{" +
                "distanceToDestination=" + distanceToDestination +
                ", name='" + name + '\'' +
                ", isTruck=" + isTruck +
                '}';
    }
}
