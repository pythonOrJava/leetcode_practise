package com.haorehuo.leetcode.practise.algorithm;

import com.haorehuo.leetcode.practise.utils.RandomArrayUtils;

import java.util.Arrays;

public abstract class AbstractSort {


    protected   void swap(Integer[] sourceArr, int j, int i) {
        int temp = sourceArr[i];
        sourceArr[i] = sourceArr[j];
        sourceArr[j] = temp;
    }

    public  void processMain(int testTime, int maxValue){
        Boolean success = true;

        for (int i = 0 ; i < testTime ; i ++ ) {
            Integer[] sourceArr = RandomArrayUtils.randomList(maxValue);
            Integer[] testArr = RandomArrayUtils.copyArray(sourceArr);
            RandomArrayUtils.rightsArr(testArr);
            sort(sourceArr);
            if(!isEquals(testArr,sourceArr)) {
                success = false;
                System.out.println("unSuccess sort = " + Arrays.toString(sourceArr));
                break;
            }
        }
        System.out.println("success status = " + (success ? "nice" : " fail"));
    }

     protected abstract void sort(Integer[] sourceArr);


    protected Boolean isEquals( Integer[] testArr,  Integer[] sourceArr) {
       return RandomArrayUtils.isEquals(testArr,sourceArr);
    }
}
