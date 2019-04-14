package com.haorehuo.leetcode.practise.algorithm;

import java.util.Arrays;

public class partitionExchange extends AbstractSort {

    public static void main(String[] args) {
        partitionExchange exchange = new partitionExchange();
        exchange.processMain(1,20);
    }

    @Override
    protected void sort(Integer[] sourceArr) {

        if(sourceArr == null || sourceArr.length < 2) {
            return;
        }


        int stand = 5;

        System.out.println(Arrays.toString(sourceArr) + ",stand = " + stand);
       Integer[] partition =  getPartitionSort(stand, sourceArr, 0 ,sourceArr.length - 1);
        System.out.println(Arrays.toString(partition) + ",  sourceArr = " + Arrays.toString(sourceArr));

    }

    private Integer[] getPartitionSort(int stand, Integer[] sourceArr, int left, int right) {

        int less = left -1 ;
        int more = right;

        int current = left;

        while (current <= more) {
            if(sourceArr[current] < stand) {
                swap(sourceArr,++less, current++);
            }else if(sourceArr[current] > stand) {
                swap(sourceArr,more--,current);
            }else {
                current++;
            }
        }

        return new Integer[]{less + 1, more - 1};
    }
}
