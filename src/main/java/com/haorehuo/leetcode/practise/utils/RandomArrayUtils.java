package com.haorehuo.leetcode.practise.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomArrayUtils {

    public static void rightsArr(Integer[] righsArr) {
        Arrays.sort(righsArr);
    }

    public static Integer[] copyArray(Integer[] array) {
        if(array == null )  {
            return null;
        }
        Integer[] copyArray = new Integer[array.length];
        for (int i = 0 ; i < array.length ; i ++ ) {
            copyArray[i] = array[i];
        }

        return copyArray;
    }

    public static Boolean isEquals(Integer[] rights, Integer[] test){

        if(rights == null && test == null) {
            return Boolean.TRUE;
        }

        if(test == null || rights == null) {
            return Boolean.FALSE;
        }


        if(test.length != rights.length) {
            return Boolean.FALSE;
        }
        for (int i = 0 ; i < test.length ; i ++ ) {
            if(!rights[i].equals(test[i])) {
                System.out.println("rights = " + Arrays.toString(rights));
                System.out.println("tests = " + Arrays.toString(test));
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public static Integer[] randomList(Integer maxNum){
        Integer random = null;
        while (true) {
            random = new Random().nextInt(maxNum);
            if(random > 0) {
                break;
            }
        }
        return createRandomArray(random);
    }

    private static Integer[] createRandomArray(Integer random) {


        List<Integer> contains = new ArrayList<>();

        while (true) {
            Integer value = getRandom(random);
            if(contains.contains(value) && contains.size() < random) {
                continue;
            }
            if(contains.size() == random) {
                return contains.toArray(new Integer[]{});
            }
            contains.add(value);
        }
    }

    private static Integer getRandom(Integer random) {
        return new Random().nextInt(random);
    }
}
