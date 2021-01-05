package day08.JavaAlgorithm;

import org.junit.Test;

import java.util.Arrays;

public class ArraysTest {
    @Test
    public void test1(){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};
        //1. Arrays.equals
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println(isEqual);
        //2. Arrays.toString
        System.out.println(Arrays.toString(arr1));
        //3. Arrays.fill
        int[] arr3 = new int[10];
        Arrays.fill(arr3,100);
        System.out.println(Arrays.toString(arr3));
        //4.Arrays.sort
        Arrays.sort(arr1);
        //5. Arrays.binarySearch
        int i = Arrays.binarySearch(arr2, 1);
        System.out.println(i);
    }
}
