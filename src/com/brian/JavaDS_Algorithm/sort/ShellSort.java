package com.brian.JavaDS_Algorithm.sort;

import com.brian.JavaDS_Algorithm.sort.model.Shipment;
import org.junit.Test;

public class ShellSort {
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
        shellSort2(shipments);
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
        shellSort2(shipments);
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000F);
    }

    /**
     * shell sort is an improved version of insertion sort
     * 1. we will implement two ways
     *      1.1 swap values(slower) -- 18s to 20s roughly
     *      1.2 move values(faster) -- 0.06s......holy shit
     * 2. m is the step, when m becomes 1, it is a insertion sort
     * @param shipments
     */
    public static void shellSort(Shipment[] shipments){
        int m = shipments.length/2;
        Shipment temp = null;
        while(m>0) {
            for (int i = m; i < shipments.length; i++) {
                for (int j = i - m; j >= 0; j -= m) {
                    if (shipments[j].getDistance() > shipments[j+m].getDistance()) {
                        temp = shipments[j];
                        shipments[j] = shipments[j+m];
                        shipments[j+m] = temp;
                    }
                }
            }
            m /= 2;
        }
    }

    /**
     * 2. move elements instead of swapping
     * @param shipments
     */
    public static void shellSort2(Shipment[] shipments){
        int m = shipments.length/2;
        Shipment temp = null;
        while(m>0) {
            for(int i = m;i<shipments.length;i++){
                int j = i;
                temp = shipments[j];
                if(shipments[j].getDistance()<shipments[j-m].getDistance()){
                    while(j-m>=0 && temp.getDistance()<shipments[j-m].getDistance()){
                        shipments[j] = shipments[j-m];
                        j -= m;
                    }
                    shipments[j] = temp;
                }
            }
            m /= 2;
        }
    }

    
}
