package com.brian.JavaDS_Algorithm.sort;

import com.brian.JavaDS_Algorithm.sort.model.Shipment;
import org.junit.Test;

/**
 * quicksort is an improved version of bubble sort
 */
public class QuickSort {
    @Test
    public void test1(){
        Shipment[] shipments = new Shipment[7];
        shipments[5] = new Shipment();
        shipments[5].setDistance(-4);
        shipments[6] = new Shipment();
        shipments[6].setDistance(-3);
        shipments[0] = new Shipment();
        shipments[0].setDistance(3);
        shipments[1] = new Shipment();
        shipments[1].setDistance(9);
        shipments[2] = new Shipment();
        shipments[2].setDistance(-1);
        shipments[3] = new Shipment();
        shipments[3].setDistance(0);
        shipments[4] = new Shipment();
        shipments[4].setDistance(-2);

        for(Shipment shipment: shipments) System.out.println(shipment.getDistance());
        System.out.println();
        quickSort(shipments,0,shipments.length-1);
        for(Shipment shipment: shipments) System.out.println(shipment.getDistance());
    }

    /**
     * I tested 800,000 as 80,000 is like 0.02s which is not enough to show the speed
     * for 800,000 is like 0.3 to 0.4s
     */
    @Test
    public void test2(){
        //1. create 80,000 array of shipments
        Shipment[] shipments = new Shipment[8000000];
        for(int i=0;i<8000000;i++){
            //distance as [0,1)*8000000
            shipments[i] = new Shipment((int) (Math.random() * 800000000),0);
        }
        long start = System.currentTimeMillis();
//        Arrays.sort(shipments,(o1, o2)-> (int) (o1.getDistance()-o2.getDistance()));
        quickSort(shipments,0,shipments.length-1);
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000F);
    }




    public static void quickSort(Shipment[] shipments, int left, int right){
        int l = left;
        int r = right;
        Shipment pivot = shipments[l + (r - l)/2];
        Shipment temp;
        //while loop, whatever value smaller than pivot be put to the left,
        //            whatever value greater than pivot be put to the right.
        while (l<r){
            //find from the pivot left until we find a shipment distance greater or equal to pivot
            while(shipments[l].getDistance()<pivot.getDistance()){
                l++;
            }
            //find from the pivot right until we find a shipment distance smaller or equal to pivot
            while(shipments[r].getDistance()>pivot.getDistance()){
                r--;
            }
            //then swap, pivot left now has been smaller or equal to pivot
            //           pivot right now has been greater or equal to pivot
            if(l>=r){
                break;
            }
            //swap
            temp = shipments[l];
            shipments[l] = shipments[r];
            shipments[r] = temp;

            //after the swap, if we find that shipments[l] == pivot,--,move forward one step
            if(shipments[l].getDistance()==pivot.getDistance()) r--;
            if(shipments[r].getDistance()==pivot.getDistance()) l++;
        }

        //if l == r, has to be l++, r-- otherwise would be stack overflow
        if(l==r) {
            l+=1;
            r-=1;
        }
        if(left < r){
            quickSort(shipments,left,r);
        }
        if(right > l){
            quickSort(shipments,l,right);
        }

    }

}
