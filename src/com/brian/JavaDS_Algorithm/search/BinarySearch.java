package com.brian.JavaDS_Algorithm.search;

/**
 * Two implementations, recursive and iterative
 *
 * Also for insertion
 * int mid = left + (right-left) * (findVal-arr[left])/(arr[right]-arr[left])
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int left, int right, int findVal){
        if(left > right) return -1;

        int mid = left + (right-left)/2;
        if(arr[mid]>findVal) return binarySearch(arr,mid+1,right,findVal);
        if(arr[mid]<findVal) return binarySearch(arr,left,mid-1,findVal);
        return mid;
    }

    public static int binarySearch2(int[] arr, int findVal){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid]>findVal){
                left = mid-1;
            } else if(arr[mid]<findVal){
                right=mid+1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
