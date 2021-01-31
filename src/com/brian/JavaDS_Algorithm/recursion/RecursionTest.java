package com.brian.JavaDS_Algorithm.recursion;

public class RecursionTest {
    public static void main(String[] args) {
//        test(4);
        System.out.println(multiply(3));
    }

    /**
     * show case of recursion.
     *      Stack => main()->test(4)->test(3)->test(2) then return
     *      Console => n=2 n=3 n=4
     * @param n input
     */
    public static void test(int n){
        if(n>2) {
            test(n-1);
        }
        System.out.println("n=" + n);
    }

    public static int multiply(int n){
        if(n==1) return 1;
        else {
            return multiply(n-1)*n;
        }
    }
}
