package com.brian.JavaDS_Algorithm.sort;

import com.brian.JavaDS_Algorithm.sort.model.Shipment;
import org.junit.Test;

import java.util.Arrays;

public class SelectionSort {
    @Test
    public void test1(){
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

    @Test
    public void test2(){
        //1. create 80,000 array of shipments
        Shipment[] shipments = new Shipment[80000];
        for(int i=0;i<80000;i++){
            //distance as [0,1)*8000000
            shipments[i] = new Shipment((int) (Math.random() * 8000000),0);
        }
        long start = System.currentTimeMillis();
//        Arrays.sort(shipments,(o1, o2)-> (int) (o1.getDistance()-o2.getDistance()));
        selectionSort(shipments);
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000F);
    }

    /**
     * time complexity: O(n^2)
     * It's faster than bubbleSort since it's doing much much less exchange
     * roughly 6.7s compared to 22s
     * but still not as fast as Arrays.sort() 0.06s
     * @param shipments
     */
    public static void selectionSort(Shipment[] shipments){
        Shipment temp = null;
        for(int i=0;i<shipments.length-1;i++) {
            int minIndex = i;
            for (int j = i+1; j < shipments.length; j++) {
                if (shipments[j].getDistance() < shipments[minIndex].getDistance()) {
                    minIndex = j;
                }
            }
            //if i is not the smallest, then exchange else continue
            if(minIndex!=i) {
                temp = shipments[i];
                shipments[i] = shipments[minIndex];
                shipments[minIndex] = temp;
            }
        }
    }

}
