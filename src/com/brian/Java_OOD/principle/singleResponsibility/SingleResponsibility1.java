package com.brian.Java_OOD.principle.singleResponsibility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("car");
        vehicle.run("motorcycle");
        vehicle.run("plane");
    }
}

//transportation
//1. inside the run method, it violates the single responsibility principle (as plane and car doesn't always run on the road)
//   we can split it to different method
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " is running on the road.");
    }
}