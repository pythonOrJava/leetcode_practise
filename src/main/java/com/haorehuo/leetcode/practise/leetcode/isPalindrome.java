package com.haorehuo.leetcode.practise.leetcode;

import java.util.Arrays;

public class isPalindrome {


    public static Integer[] arr = {1,2,7,9,0};

    public static void main(String[] args) {
       boolean flag = getPalindrome(121);
        System.out.println(flag);
    }

    private static boolean getPalindrome(int i) {
        if(i < 0) {
            return false;
        }
        int tempi = i;
        int temp = 0;
        while (i != 0) {
            temp = temp * 10 +  i%10;
            i = i/10;
        }

        return temp == tempi;

    }
}
