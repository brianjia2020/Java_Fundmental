package com.brian.JAVA_Fundmental.day08.JavaAlgorithm;

/**
 * array common Exception
 * 1. arrayIndexOutOfBoundsException
 * 2. nullPointerException
 */
public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        System.out.println(arr1[5]);
    }
}
