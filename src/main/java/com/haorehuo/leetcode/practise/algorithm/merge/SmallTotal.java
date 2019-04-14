package com.haorehuo.leetcode.practise.algorithm.merge;

import com.haorehuo.leetcode.practise.algorithm.AbstractSort;

import java.util.Arrays;

/**
 * 数组小和
 */
public class SmallTotal extends AbstractSort {


    public static void main(String[] args) {
        SmallTotal total = new SmallTotal();
        total.processMain(1,10);
    }


    @Override
    protected void sort(Integer[] sourceArr) {
        if(sourceArr == null || sourceArr.length < 2) {
            return;
        }

        System.out.println("source arr = " + Arrays.toString(sourceArr));
      Integer sum =   getSmallTotal(sourceArr, 0 , sourceArr.length - 1);
        System.out.println("small total = " + sum);

    }

    private Integer getSmallTotal(Integer[] sourceArr, int start, int end) {
        if(start == end) {
            return 0;
        }

        int mid = start + (end - start) / 2;

       return getSmallTotal(sourceArr,start,mid) + getSmallTotal(sourceArr,mid + 1, end) +
               merge(sourceArr,start, mid, end);
    }

    private Integer merge(Integer[] sourceArr, int start, int mid, int end) {
        int index = 0;
        int p1  = start;
        int p2 = mid + 1;
        int res = 0;
        int[] arr = new int[end -start + 1];

        while (p1<=mid && p2<= end) {
            res = sourceArr[p1] < sourceArr[p2] ? (end - p2 + 1) * sourceArr[p1] + res : res;
            arr[index++] = sourceArr[p1] > sourceArr[p2] ? sourceArr[p2++] : sourceArr[p1++];
        }

        while (p1<=mid) {
            arr[index++]= sourceArr[p1++];
        }

        while (p2<=end) {
            arr[index++]= sourceArr[p2++];
        }

        for (int i = 0 ; i < arr.length ; i ++ ) {
            sourceArr[start + i] = arr[i];
        }
        return res;
    }
}
