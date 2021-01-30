package com.brian.JavaDS_Algorithm.algorithm.KMP;

import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {
        String str1 = "BBC ABCDAB ABCDABCDABDE";
        String str2 = "ABCDABD";
        int[] next = kmpNext(str2);
        System.out.println(Arrays.toString(next));
        System.out.println(kmpSearch(str1,str2,next));
    }

    /**
     *
     * @param s1 original string
     * @param s2 string to be found in s1
     * @param matchPattern the optional match pattern of s2
     * @return the pos s2 in s1, if not found return -1
     */
    public static int kmpSearch(String s1, String s2, int[] matchPattern){
        for(int i=0,j=0;i<s1.length();i++){
            //need to handle when it's not equal, adjust the value of j
            while(j>0&&s1.charAt(i)!=s2.charAt(j)){
                j= matchPattern[j-1];
            }
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
            if(j==s2.length()) return i-j+1;
        }
        return -1;
    }

    //1. get a string's partial matching number
    public static int[] kmpNext(String str){
        //an array to store the answer
        int[] res = new int[str.length()];
        res[0] = 0;
        for(int i=1,j=0;i<str.length();i++){
            //the foundation of kmp
            while(j>0&&str.charAt(i)!=str.charAt(j)){
                j = res[j-1];
            }
            //partial match value increase by 1
            if(str.charAt(i)==str.charAt(j)){
                j++;
            }
            res[i]=j;
        }
        return res;
    }
}
