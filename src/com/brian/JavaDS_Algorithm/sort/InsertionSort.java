package com.brian.JavaDS_Algorithm.sort;

import com.brian.JavaDS_Algorithm.sort.model.Shipment;
import org.junit.Test;

import java.util.Arrays;

public class InsertionSort {
    @Test
    public void test1(){
        Shipment[] shipments = new Shipment[5];
        shipments[0] = new Shipment();
        shipments[0].setDistance(11);
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
        insertionSort(shipments);
        for(Shipment shipment: shipments) System.out.println(shipment.getDistance());
    }

    // test on 80,000 data points to sort and compare

    /**
     * roughly 7 to 8s, still better than bubble sort
     */
    @Test
    public void test2(){
        //1. create 80,000 array of shipments
        Shipment[] shipments = new Shipment[80000];
        for(int i=0;i<80000;i++){
            //distance as [0,1)*8000000
            shipments[i] = new Shipment((int) (Math.random() * 8000000),0);
        }
        long start = System.currentTimeMillis();
        insertionSort(shipments);
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000F);
    }

    /**
     * Insertion Sort:
     * @param shipments
     */
    public static void insertionSort(Shipment[] shipments){
        Shipment temp;
        for(int i = 1;i<shipments.length;i++){
            temp = shipments[i];
            int insertIndex = i-1;
            //find the insertion position by loop
            //1. insertIndex>=0 makes sure it does not get out of bound
            //2. shipments[i].getDistance()<=shipments[insertIndex].getDistance()
            //   the position have not found proper position
            while(insertIndex>=0&&temp.getDistance()<shipments[insertIndex].getDistance()){
                shipments[insertIndex+1] = shipments[insertIndex];
                insertIndex--;
            }
            if(insertIndex+1 !=i ) {
                shipments[insertIndex + 1] = temp;
            }
        }
    }

}
