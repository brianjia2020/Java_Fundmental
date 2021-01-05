package day08.JavaAlgorithm;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2,3,1,6,9,6,7,-1234};
        System.out.println(Arrays.toString(arr));
        System.out.println("After sorting: ");
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

}
