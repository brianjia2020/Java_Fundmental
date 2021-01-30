package com.brian.JavaDS_Algorithm.algorithm.DivideAndConquer;

public class HanoiTower {
    public static void main(String[] args) {
        hanoiTower(17,'a','b','c');
        System.out.println(count);
    }
    static int count;
    //hanoi tower
    //divide and conquer
    public static void hanoiTower(int n, char a, char b, char c){
        //if there is only one plate, then a to c
        if(n==1) {
            System.out.println("the 1st plate from " + a + "->" + c);
            count++;
        } else {
            //1. move the top(n-1) from a to b
            //the movement will use c as b but the aim is to a to b
            hanoiTower(n-1,a,c,b);
            //2. move the last one n from a to c
            System.out.println("the " + n + "th plate from " + a + "->" + c);
            count++;
            //3. move the n-1 from b to c
            hanoiTower(n-1,b,a,c);
        }

    }
}
