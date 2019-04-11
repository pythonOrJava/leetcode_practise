package com.haorehuo.leetcode.practise.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
       int value =  getRomanToInt("MCMXCIV");
        System.out.println(value);
    }

    public static Map<String,Integer> romanToIntMap = new HashMap<>();

    static {
        romanToIntMap.put("I",1);
        romanToIntMap.put("V",5);
        romanToIntMap.put("X",10);
        romanToIntMap.put("L",50);
        romanToIntMap.put("C",100);
        romanToIntMap.put("D",500);
        romanToIntMap.put("M",1000);
    }

    private static int getRomanToInt(String mcmxciv) {
        char[] chars = mcmxciv.toCharArray();
        int temp  = romanToIntMap.get(Character.toString(chars[0]));
        int returnValue = temp;
        for (int i = 1 ; i < chars.length ; i ++ ) {
            Integer value = romanToIntMap.get(Character.toString(chars[i]));
            returnValue = returnValue + value;
            if(temp < value) {
                returnValue =  returnValue - 2 * temp;
            }
            temp = value;
        }
        return returnValue;
    }



}
