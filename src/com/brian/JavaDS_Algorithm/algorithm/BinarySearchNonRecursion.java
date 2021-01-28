package com.brian.JavaDS_Algorithm.algorithm;

public class BinarySearchNonRecursion {

    public static void main(String[] args) {
        int[] arr = {1,3,8,11,67,100};
        System.out.println(binarySearchIterative(arr,11));
        System.out.println(binarySearchRecursive(arr,11,0,arr.length-1));
    }

    //binary search, iterative
    /**
     * Iterative
     * @param arr the array that is about to search
     * @param target the num to be searched
     * @return the index, if -1 then not found
     */
    public static int binarySearchIterative(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        //loop starts
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target) {
                return mid;
            } else if(arr[mid]>target){
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * Recursive way
     * @param arr the array that is about to search
     * @param target the num to be searched
     * @param low the low end of index
     * @param high the high end of index
     * @return the index, if -1 then not found
     */
    public static int binarySearchRecursive(int[] arr, int target, int low, int high){
        if(low>high||arr==null||arr.length==0) return -1;
        int mid = (low+high)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return binarySearchRecursive(arr,target,low,mid-1);
        else return binarySearchRecursive(arr,target,mid+1,high);

    }
}
