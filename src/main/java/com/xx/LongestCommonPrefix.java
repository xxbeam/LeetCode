package com.xx;

import java.util.Arrays;

/**
 * 14. 最长公共前缀.
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
//        if(strs.length==0){
//            return "";
//        }
//        if(strs.length==1){
//            return strs[0];
//        }
//        String a = strs[0];
//        for (int i = 1; i <=a.length() ; i++) {
//            String test = a.substring(0,i);
//            for (int j = 1; j < strs.length; j++) {
//                if(strs[j].length()<i||(!(strs[j].substring(0,i).equals(test)))){
//                    if(i==1){
//                        return "";
//                    }else{
//                        return test.substring(0,test.length()-1);
//                    }
//                }
//            }
//        }
//        return a;
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String a = strs[0];
        byte[] barray = a.getBytes();
        int l = barray.length;
        int maxl = 0;
        boolean flag = true;
        for (int i = 0; i < barray.length; i++) {
            for (int j = 1; j < strs.length; j++) {
                if(strs[j].length()-1<i||barray[i]!=strs[j].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                maxl = i+1;
            }else{
                maxl = i;
                break;
            }
        }
        if(maxl==0){
            return "";
        }
        barray = Arrays.copyOfRange(barray, 0, maxl);
        return new String(barray);
    }

    public static void main(String[] args) {
        String[] a = new String[]{"a","ac"};
        System.out.println(longestCommonPrefix(a));

    }


}
