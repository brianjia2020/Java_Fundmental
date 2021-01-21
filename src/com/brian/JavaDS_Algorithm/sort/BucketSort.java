package com.brian.JavaDS_Algorithm.sort;

import com.brian.JavaDS_Algorithm.sort.model.Shipment;
import org.junit.Test;

import java.awt.image.SinglePixelPackedSampleModel;

public class BucketSort {
    @Test
    public void test1(){
        Shipment[] shipments = new Shipment[5];
        shipments[0] = new Shipment();
        shipments[0].setDistance(3);
        shipments[1] = new Shipment();
        shipments[1].setDistance(9);
        shipments[2] = new Shipment();
        shipments[2].setDistance(345);
        shipments[3] = new Shipment();
        shipments[3].setDistance(10);
        shipments[4] = new Shipment();
        shipments[4].setDistance(254);
        for(Shipment shipment: shipments) System.out.println(shipment.getDistance());
        System.out.println();
        bucketSort(shipments);
        for(Shipment shipment: shipments) System.out.println(shipment.getDistance());
    }

    /**
     * 80000 is like 0.01s
     * 800000 is like 0.8s
     * however we consumed n^2 space, if it's 800000*80000*each object memory
     * it's very easy to have the out of memory issue
     * also, bucket sort does not support negative numbers or do math.abs then reverse
     */
    @Test
    public void test(){
        //1. create 80,000 array of shipments
        Shipment[] shipments = new Shipment[800000];
        for(int i=0;i<800000;i++){
            //distance as [0,1)*8000000
            shipments[i] = new Shipment((int) (Math.random() * 8000000),0);
        }
        long start = System.currentTimeMillis();
        bucketSort(shipments);
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000F);
    }

    public static void bucketSort(Shipment[] shipments){
        //first round of sorting (based on every element's first digit)
        //need to get the largest num of digits
        Shipment max = shipments[0];
        for(Shipment shipment: shipments){
            if(shipment.getDistance()>max.getDistance()){
                max = shipment;
            }
        }
        int maxLength = (max.getDistance()+"").length();

        //1. define a two dimension array
        // 10 one dimension array representing last digit ending with 0 to 9
        // and each bucket length is defined as array.length
        // sacrificing space for time
        Shipment[][] bucket = new Shipment[10][shipments.length];
        //to record how many elements in each bucket, we define a one-dimensional array
        //bucketCount[0] is to record the number of shipments ends with 0
        int[] bucketCount = new int[10];
        for(int i = 0;i<maxLength;i++) {
            for (int j = 0; j < shipments.length; j++) {
                int digitOfElement = (int) (shipments[j].getDistance() / Math.pow(10,i))% 10;
                bucket[digitOfElement][bucketCount[digitOfElement]] = shipments[j];
                bucketCount[digitOfElement]++;
            }

            int index = 0;
            for (int k = 0; k < bucket.length; k++) {
                //if there is data in the bucket
                if (bucketCount[k] != 0) {
                    //loop over the current bucket
                    for (int l = 0; l < bucketCount[k]; l++) {
                        shipments[index] = bucket[k][l];
                        index++;
                    }
                }
                //back to 0 count for the next round
                bucketCount[k] = 0;
            }
        }
    }

}
