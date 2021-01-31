package com.brian.JavaDS_Algorithm.recursion;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class EightQueen {

    //1. define a integer max to represent how many queens
    int max = 8;
    //2. define an array to store the position of the queens
    //   1 dimensional so that the first queen is at row 0 and col whatever and so on so forth
    int[] arr = new int[max];
    int count = 0;
    public static void main(String[] args) {
        EightQueen eightQueen = new EightQueen();
        eightQueen.check(0);
        System.out.println(eightQueen.count);
    }

    //method to print the queens' positions
    private void print(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Deque<Integer> deque = new LinkedList<>();
    }

    /**
     * method to check when we place the N queen if we have collision with all the previous queens
     * heck against 0 to N-1 queens, all previous queens
     * @param n the Nth queen we are check
     * @return if true, collision else no collision
     */
    private boolean judge(int n){
        for(int i=0;i<n;i++){
            // check if they are on the same column or they are on the same diagonal
            if(arr[i]==arr[n] || Math.abs(n-i)==Math.abs(arr[n]-arr[i])) {
                return false;
            }
        }
        return true;
    }

    //place the nth queen
    public void check(int n){
        if(n == max) { // reached the end
            count++;
            print();
            return;
        }
        //place the queens and check if there is a collision
        for(int i=0;i<max;i++){
            //place the current queen at the current low, first column
            arr[n] = i;
            //then check if this works or not
            if(judge(n)) { //no collision
                //continue to place the n+1 queen, start of the recursion
                check(n+1);
            } //if there is collision, just continue. arr[n] = i and i has increased by 1
        }
    }

}
