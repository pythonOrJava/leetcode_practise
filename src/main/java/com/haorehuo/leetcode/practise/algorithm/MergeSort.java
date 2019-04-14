package com.haorehuo.leetcode.practise.algorithm;

import java.util.Arrays;

/***
 *
 */
public class MergeSort extends AbstractSort{

    private static MergeSort bubbleSort = new MergeSort();

    public static void main(String[] args) {
        bubbleSort.processMain(10000,10);
    }
    @Override
    protected void sort(Integer[] sourceArr) {
        if(sourceArr == null || sourceArr.length < 2) {
            return;
        }
        mergeSort(sourceArr, 0, sourceArr.length - 1);
    }

    private void mergeSort(Integer[] sourceArr, int start, int end) {
        if(end == start) {
            return ;
        }
        int mid = start + ((end - start) >> 1);
         mergeSort(sourceArr,start,mid);
         mergeSort(sourceArr,mid + 1,end) ;
         merge(sourceArr, start, mid, end);

    }
    private Integer merge(Integer[] sourceArr, int start, int mid, int end) {
        int p1 = start;
        int p2 = mid + 1;
        int res = 0;
        int index = 0;
        int[] arr = new int[end - start + 1];
        while (p1 <= mid && p2 <= end) {
          arr[index ++ ] = sourceArr[p1] < sourceArr[p2] ? sourceArr[p1++] : sourceArr[p2++];
        }
        while (p1 <= mid) {
            arr[index++] = sourceArr[p1++];
        }
        while (p2<= end) {
            arr[index++] = sourceArr[p2++];
        }
        for (int i = 0 ; i + start <= end ; i ++ ) {
            sourceArr[i + start] = arr[i];
        }

        return res;
    }


}
