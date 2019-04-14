package com.haorehuo.leetcode.practise.algorithm;

public class QuickSort extends AbstractSort {

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        sort.processMain(1,5);
    }

    @Override
    protected void sort(Integer[] sourceArr) {

        if(sourceArr == null || sourceArr.length < 1) {
            return;
        }

        quickSort(sourceArr,0,sourceArr.length - 1);
    }

    private void quickSort(Integer[] arr, int left, int right) {

        if(right > left) {
           Integer[] brr =  getPartition(arr,left,right);
           quickSort(arr,left , brr[0] - 1);
           quickSort(arr, brr[1] + 1, right);
        }

    }

    private Integer[] getPartition(Integer[] arr, int left, int right) {
      int less = left - 1;
      int more = right - 1;
        while (less < more) {
            if(arr[left] < arr[right]) {
                swap(arr,++less,left++);
            }else if (arr[left] > arr[right]) {
                swap(arr,left,more--);
            }else {
                left++;
            }
        }
        swap(arr, more,right);

        return new Integer[]{less + 1, more};
    }
}
