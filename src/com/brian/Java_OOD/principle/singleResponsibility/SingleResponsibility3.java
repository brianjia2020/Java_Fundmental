package com.brian.Java_OOD.principle.singleResponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("car");
        vehicle2.runAir("plane");
        vehicle2.runWater("boat");
    }
}


//1. no major modification on the class, but write two more methods
//2. though we haven't kept the single responsibility on the class level, we kept the principle on the method level
class Vehicle2{

    public void run(String vehicle){
        System.out.println(vehicle + " is running on the road.");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle + " is running on the air.");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle + " is running on the water.");
    }

}