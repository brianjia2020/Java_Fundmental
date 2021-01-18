package com.brian.JavaDS_Algorithm.sort;

import com.brian.JavaDS_Algorithm.sort.model.Shipment;
import org.junit.Test;

public class SelectionSort {
    @Test
    public void test(){
        Shipment[] shipments = new Shipment[5];
        shipments[0] = new Shipment();
        shipments[0].setDistance(3);
        shipments[1] = new Shipment();
        shipments[1].setDistance(9);
        shipments[2] = new Shipment();
        shipments[2].setDistance(-1);
        shipments[3] = new Shipment();
        shipments[3].setDistance(10);
        shipments[4] = new Shipment();
        shipments[4].setDistance(-2);
        for(Shipment shipment: shipments) System.out.println(shipment.getDistance());
        System.out.println();
        selectionSort(shipments);
        for(Shipment shipment: shipments) System.out.println(shipment.getDistance());
    }

    public static void selectionSort(Shipment[] shipments){
        Shipment temp = null;
        for(int i=0;i<shipments.length-1;i++) {
            int minIndex = i;
            for (int j = i+1; j < shipments.length; j++) {
                if (shipments[j].getDistance() < shipments[minIndex].getDistance()) {
                    minIndex = j;
                }
            }
            temp = shipments[i];
            shipments[i] = shipments[minIndex];
            shipments[minIndex] = temp;
        }
    }

}
