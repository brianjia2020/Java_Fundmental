package com.brian.JavaDS_Algorithm.sort;

import com.brian.JavaDS_Algorithm.sort.model.Shipment;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
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
        bubbleSort2(shipments);
        for(Shipment shipment: shipments) System.out.println(shipment.getDistance());
    }

    public static void bubbleSort(Shipment[] shipments){
        //temp used to swap object
        Shipment temp = null;
        for(int i =0;i<shipments.length-1;i++) {
            for (int j = 0; j <shipments.length-1-i; j++) {
                if (shipments[j].getDistance() > shipments[j + 1].getDistance()) {
                    temp = shipments[j];
                    shipments[j] = shipments[j + 1];
                    shipments[j + 1] = temp;
                }
            }
        }
    }

    //1.if at one loop, there is no swap happened. The loop can end early.
    public static void bubbleSort2(Shipment[] shipments){
        //temp used to swap object
        Shipment temp = null;
        boolean flag = false;
        for(int i =0;i<shipments.length-1;i++) {
            for (int j = 0; j < shipments.length-1-i; j++) {
                if (shipments[j].getDistance() > shipments[j + 1].getDistance()) {
                    flag = true;
                    temp = shipments[j];
                    shipments[j] = shipments[j + 1];
                    shipments[j + 1] = temp;
                }
            }
            if(!flag){
                //no swap happened during the last loop
                break;
            } else {
                flag = false;
            }
        }
    }
}
