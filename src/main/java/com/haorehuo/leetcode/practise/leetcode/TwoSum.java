package com.haorehuo.leetcode.practise.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/***
 * 描述：
 *
 */
public class TwoSum {

   public static Integer[] arr = {1,2,7,9,0};

    public static void main(String[] args) {
        int[] arr = getTwoSumShort(TwoSum.arr,7);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getTwoSumShort(Integer[] arr, int sum){
        int[] brr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < arr.length ; i ++ ) {
            if(map.get(arr[i]) !=  null) {
                brr[0] = arr[i];
                brr[1] = map.get(arr[i]);
                return brr;
            }
            map.put(sum - arr[i],arr[i]);
        }
        return brr;
    }

    /**
     * 俩层遍历
     * */
    private static int[] getTwoSum(Integer[] arr, int sum) {
        int[] brr = new int[2];
        for (int i = 0 ; i < arr.length - 1 ; i ++ ) {
            for (int j = i + 1 ; j < arr.length ; j ++ ) {
                if(sum == arr[i] + arr[j]) {
                    brr[0] = i;
                    brr[1] = j;
                    return brr;
                }
            }
        }

        return null;
    }

}
