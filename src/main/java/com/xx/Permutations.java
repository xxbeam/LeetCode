package com.xx;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. 全排列
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> returnList = new ArrayList<>();
        get(nums,null,returnList);
        return returnList;
    }

    public void get(int[] nums,List<Integer> list,List<List<Integer>> returnList){
        for (int i=0;i<nums.length;i++){
            int x = nums[i];
            if(list==null){
                list = new ArrayList<>();
            }
            List<Integer> preList = new ArrayList<>(list);
            if(!preList.contains(x)){
                preList.add(x);
                if(preList.size()==nums.length){
                    returnList.add(preList);
                }else{
                    get(nums,preList,returnList);
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3};

        System.out.println(new Permutations().permute(nums));


    }

}
