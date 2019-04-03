package com.xx;

import java.util.*;

/**
 * 49. 字母异位词分组
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer,List<String>> map = new HashMap<>();
        for (int i = 0; i<strs.length; i++) {
            int hash = hash(strs[i]);
            List<String> list = map.get(hash);
            if(list==null){
                list = new ArrayList<>();
            }
            list.add(strs[i]);
            map.put(hash,list);
        }

        List<List<String>> rList = new ArrayList<>();
        //遍历map中的值
        for (List<String> list : map.values()) {
            rList.add(list);
        }
        return rList;
    }

    //仿造String的hashCode方法计算hash值
    public int hash(String s){
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i)%26;
            arr[x] = arr[x]+1;
        }
        int h = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i] ; j++) {
                h = 31 * h + i;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] arr1 = {4,3,2,1};
        System.out.println(arr.hashCode());
        System.out.println(arr1.hashCode());


        System.out.println((int)'a');
        System.out.println((int)'z');
        for (int i = 97; i < 123; i++) {
            System.out.println(i%26);
        }

        System.out.println(new GroupAnagrams().hash("hdd"));
    }

}
