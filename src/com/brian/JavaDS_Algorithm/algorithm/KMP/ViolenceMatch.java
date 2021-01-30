package com.brian.JavaDS_Algorithm.algorithm.KMP;

public class ViolenceMatch {

    public static void main(String[] args) {
        //test 1
        System.out.println(violentMatch("Iloveyou","ove"));
    }

    public static int violentMatch(String s1, String s2){
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        int l1 = s1.length();
        int l2 = s2.length();
        int i=0; // index pointing to s1
        int j=0; // index pointing to s2
        while(i<l1&&j<l2){ //does not go out of boundary
            if(charArray1[i]==charArray2[j]){
                i++;
                j++;
            } else {
                i = i-(j-1);
                j=0;
            }
        }
        //check if it matches successfully
        if(j==l2) return i-j;
        else return -1;
    }
}
