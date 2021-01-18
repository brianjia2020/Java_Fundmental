package com.brian.JavaDS_Algorithm.sort.model;

public class Shipment {
    private double distance = 0.0;
    private double price = 0.0;

    public Shipment() {
    }

    public Shipment(double distance, double price){
        this.distance = distance;
        this.price = price;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
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
        return "Shipment{" +
                "distance=" + distance +
                ", price=" + price +
                '}';
    }
}
