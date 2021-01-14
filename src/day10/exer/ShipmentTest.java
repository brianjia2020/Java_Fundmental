package day10.exer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
