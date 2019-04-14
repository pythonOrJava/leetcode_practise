package com.haorehuo.leetcode.practise.algorithm;

import com.haorehuo.leetcode.practise.utils.RandomArrayUtils;

import java.util.Arrays;

public class InsertSelection {

    public static void main(String[] args) {
        int testTime = 500000;
        int maxValue = 5;
        Boolean success = true;
        for (int i = 0; i < testTime; i++) {
            Integer[] sourceArr = RandomArrayUtils.randomList(maxValue);
            Integer[] testArr = RandomArrayUtils.copyArray(sourceArr);
            Integer[] tempSourceArr = RandomArrayUtils.copyArray(sourceArr);
            RandomArrayUtils.rightsArr(testArr);
            try {
                sort(sourceArr);
            }catch (Exception e) {
                success = false;
                e.printStackTrace();
                System.out.println("error sort = " + Arrays.toString(tempSourceArr));
                break;
            }
            if (!RandomArrayUtils.isEquals(testArr, sourceArr)) {
                success = false;
                System.out.println("unSuccess sort = " + Arrays.toString(sourceArr) + ", temp = " + Arrays.toString(tempSourceArr));
                break;
            }
        }
        System.out.println("success status = " + (success ? "nice" : " fail"));
    }

    private static void sort(Integer[] sourceArr) {
        if (sourceArr == null || sourceArr.length < 2) {
            return;
        }
        for (int i = 1 ; i < sourceArr.length ; i ++ ) {
            for (int j = i - 1 ;   j >= 0 && sourceArr[j] > sourceArr[j + 1]  ; j --   ) {
                swap(sourceArr, j, j+1);
            }
        }
    }

    private static void swap(Integer[] sourceArr, int j, int i) {
        int temp = sourceArr[i];
        sourceArr[i] = sourceArr[j];
        sourceArr[j] = temp;
    }


}
