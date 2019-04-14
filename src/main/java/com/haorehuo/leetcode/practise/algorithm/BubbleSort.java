package com.haorehuo.leetcode.practise.algorithm;

import com.haorehuo.leetcode.practise.utils.RandomArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BubbleSort extends AbstractSort{

    private static BubbleSort bubbleSort = new BubbleSort();

    public static void main(String[] args) {
        bubbleSort.processMain(50000,10);
    }
    @Override
    protected void sort(Integer[] sourceArr) {
        if(sourceArr == null || sourceArr.length < 2) {
            return;
        }

        for (int i = sourceArr.length - 1 ; i > 0 ; i -- ) {
            for (int j = 0 ; j < i ; j ++  ) {
                if(sourceArr[j] > sourceArr[j + 1] ) {
                    swap(sourceArr, j , j + 1);
                }
            }
         }
    }


}
