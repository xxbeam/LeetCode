package com.xx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 90. 子集 II
 */
public class Subsetsii {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> returnList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        returnList.add(list);
        subsets(nums,0,list,returnList);
        return returnList;
    }

    public void subsets(int[] nums, int next, List<Integer> list, List<List<Integer>> returnList){
        if(next>=nums.length){
            return;
        }
        for (int i = next; i < nums.length; i++) {
            if(i>next&&nums[i]==nums[i-1]){
                //表明该次循环与上一次循环添加的int数是一样的，属于同样的子集
                continue;
            }
            list.add(nums[i]);
            returnList.add(new ArrayList<>(list));
            subsets(nums,i+1,list,returnList);
            list.remove(list.size()-1);
        }
    }


    public static void main(String[] args) {
        int[] nums = {1,2,2};
        new Subsetsii().subsetsWithDup(nums);
    }

}
