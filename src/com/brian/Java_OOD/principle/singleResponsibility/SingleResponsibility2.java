package com.brian.Java_OOD.principle.singleResponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("car");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("plane");
    }
}
//2. follow the single principle responsibility
//   However it costs a lot.
//   Improvement is to modify the vehicle => SingleResponsibility3
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " is running on the road.");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " is running on the air.");
    }
}
