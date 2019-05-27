package com.xx;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. 子集
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> returnList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        returnList.add(list);
        getList(nums,0,list,returnList);
        return returnList;
    }

    public void getList(int[] nums,int x,List<Integer> list,List<List<Integer>> returnList){
        for (int i = x; i < nums.length; i++) {
            List<Integer> newList = new ArrayList<>(list);
            newList.add(nums[i]);
            returnList.add(newList);
            if(x<nums.length-1){
                getList(nums,i+1,newList,returnList);
            }
        }
    }

}
