package com.brian.JavaDS_Algorithm.sort;

import com.brian.JavaDS_Algorithm.sort.model.Shipment;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

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


    // test on 80,000 data points to sort and compare
    @Test
    public void test(){
        //1. create 80,000 array of shipments
        Shipment[] shipments = new Shipment[80000];
        for(int i=0;i<80000;i++){
            //distance as [0,1)*8000000
            shipments[i] = new Shipment((int) (Math.random() * 8000000),0);
        }
        long start = System.currentTimeMillis();
        bubbleSort2(shipments);
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000F);
    }

    /**
     * test Arrays.sort() compared to bubble sort
     * roughly 0.043s to 22s.
     * That's a huge difference......lol
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
        Arrays.sort(shipments,(o1,o2)-> (int) (o1.getDistance()-o2.getDistance()));
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000F);
    }

    //1.original version
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


    //2. optimized version
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
