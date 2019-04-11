package com.haorehuo.leetcode.practise.leetcode;

/***
 * 查询一个字符数组的前缀
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"aa", "a"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);

    }

    private static String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0) {
            return "";
        }

        if(strs.length == 1) {
            return strs[0];
        }

        int endIndex = getEndIndex(strs);
        return strs[0].substring(0,endIndex);
    }

    private static int getEndIndex(String[] strs) {
        for (int i = 0 ; i < strs[0].length() ; i ++  ) {
            char temp = strs[0].charAt(i);
            for (int j = 1 ; j < strs.length ; j ++ ) {

                if(strs[j].length() > i &&  temp !=strs[j].charAt(i)) {
                    return i  ;
                }
                if(temp != strs[j].charAt(i)) {
                    return i ;
                }
            }
        }
        return strs[0].length();
    }


}
