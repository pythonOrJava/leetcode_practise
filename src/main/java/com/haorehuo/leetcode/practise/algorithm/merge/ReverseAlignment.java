package com.haorehuo.leetcode.practise.algorithm.merge;

import com.haorehuo.leetcode.practise.algorithm.AbstractSort;

import java.util.Arrays;

/**
 * 逆袭对
 */
public class ReverseAlignment extends AbstractSort {


    public static void main(String[] args) {
        ReverseAlignment ment = new ReverseAlignment();
        ment.processMain(1,5);
    }

    @Override
    protected void sort(Integer[] sourceArr) {
        if(sourceArr == null || sourceArr.length < 2) {
            return;
        }
        System.out.println(Arrays.toString(sourceArr));
        merge(sourceArr, 0 ,sourceArr.length - 1);

    }

    private void merge(Integer[] sourceArr, int start, int end) {
        if(start == end) {
            return;
        }
        int mid = start + ((end - start) >> 1);
        merge(sourceArr,start,mid);
        merge(sourceArr,mid + 1, end);
        mergeSort(sourceArr,start,mid,end);
    }

    private void mergeSort(Integer[] sourceArr, int start, int mid, int end) {

        int p1 = start;
        int p2 = mid + 1;
        int index = 0;
        int[] arr = new int[end - start + 1];

        while (p1<=mid && p2<=end) {

            if(sourceArr[p1] >  sourceArr[p2]) {
                for (int i = p1 ; i <= mid ; i ++ ) {
                    System.out.print("<" + sourceArr[i] + "," + sourceArr[p2] + ">,");
                }
            }


            arr[index ++ ] = sourceArr[p1] < sourceArr[p2] ? sourceArr[p1++] : sourceArr[p2++];
        }

        while (p1<=mid) {
            arr[index++] = sourceArr[p1++];
        }
        while (p2<=end){
            arr[index++] = sourceArr[p2++];
        }

        for (int i = 0 ; i < arr.length ; i ++ ) {
            sourceArr[start + i] = arr[i];
        }
    }
}
