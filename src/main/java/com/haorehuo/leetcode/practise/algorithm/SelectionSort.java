package com.haorehuo.leetcode.practise.algorithm;

import com.haorehuo.leetcode.practise.utils.RandomArrayUtils;

import java.util.Arrays;

public class SelectionSort {

    /**
     * 选择排序
     * */
    public static void main(String[] args) {
        int testTime = 500000;
        int maxValue = 100;
        Boolean success = true;
        for (int i = 0 ; i < testTime ; i ++ ) {
            Integer[] sourceArr = RandomArrayUtils.randomList(maxValue);
            Integer[] testArr = RandomArrayUtils.copyArray(sourceArr);
            RandomArrayUtils.rightsArr(testArr);
            sort(sourceArr);
            if(!RandomArrayUtils.isEquals(testArr,sourceArr)) {
                success = false;
                System.out.println("unSuccess sort = " + Arrays.toString(sourceArr));
                break;
            }
        }
        System.out.println("success status = " + (success ? "nice" : " fail"));
    }

    private static void sort(Integer[] sourceArr) {
        if(sourceArr == null || sourceArr.length < 2) {
            return ;
        }

        for (int i = 0 ; i < sourceArr.length ; i ++ ) {
            int minIndex = i;

            for (int j = i ; j < sourceArr.length ; j ++ ) {
                if(sourceArr[j] < sourceArr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(sourceArr, minIndex , i);

        }
    }

    private static void swap(Integer[] sourceArr, int j, int i) {
        int temp = sourceArr[i];
        sourceArr[i] = sourceArr[j];
        sourceArr[j] = temp;
    }


}
