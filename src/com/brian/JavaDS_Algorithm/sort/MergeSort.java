package com.brian.JavaDS_Algorithm.sort;

import com.brian.JavaDS_Algorithm.sort.model.Shipment;
import org.junit.Test;

public class MergeSort {
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
        //mergeSort needs additional n space
        mergeSort(shipments,0,shipments.length-1,new Shipment[shipments.length]);
        for(Shipment shipment: shipments) System.out.println(shipment.getDistance());
    }

    /**
     * roughly 0.03s for 80,000, holy shit
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
        mergeSort(shipments,0,shipments.length-1,new Shipment[shipments.length]);
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000F);
    }

    public static void mergeSort(Shipment[] shipments,int left,int right,Shipment[] temp){
        if(left<right){
            int mid = (left+right)/2;
            //recursion to the left
            mergeSort(shipments,left,mid,temp);
            //recursion to the right
            mergeSort(shipments,mid+1,right,temp);
            //everytime,
            merge(shipments,left,mid,right,temp);
        }
    }

    /**
     *  this is conquer method for mergeSort
     * @param shipments original array
     * @param left left index
     * @param mid mid index
     * @param right right index
     * @param temp temp array
     */
    public static void merge(Shipment[] shipments,int left, int mid, int right,Shipment[] temp){
        int i = left; //initial left starting index
        int j = mid+1; //initial right starting index
        int t = 0; //current index of temp array
        //1.copy left,right two ordered array to temp array until one of the left/right array has all been copied
        while(i<=mid&&j<=right){
            if(shipments[i].getDistance()<=shipments[j].getDistance()){
                temp[t] = shipments[i];
                i++;
            } else {
                temp[t] = shipments[j];
                j++;
            }
            t++;
        }
        //2.copy the leftover of left/right to temp array
        while(i<=mid){
            temp[t] = shipments[i];
            i++;
            t++;
        }

        while(j<=right){
            temp[t] = shipments[j];
            j++;
            t++;
        }
        //3.copy temp array back to shipments
        // not all the elements, as this is a recursion process
        t = 0;
        int tempL = left;
        while(tempL<=right){
            shipments[tempL] = temp[t];
            tempL++;
            t++;
        }

    }
}
