package com.brian.JavaDS_Algorithm.search;

/**
 * 1. golden point 0.618
 *    (1-0.618)/0.618 = 0.618/1
 */
public class FibSearch {
    public static int maxSize = 20;
    public static void main(String[] args) {
        int[] arr = new int[]{1,8,10,89,1000,1234};

    }

    /**
     *
     * @param arr the input array
     * @param key value to be searched
     * @return
     *        if found, the position index,
     *        if not found, -1
     */
    public static int fibSearch(int[] arr, int key){
        return 0;
    }

    public static int[] fib(){
        int[] f = new int[maxSize];
        f[0]= 1;
        f[1]=1;
        for(int i= 2;i<maxSize;i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f;
    }
}
