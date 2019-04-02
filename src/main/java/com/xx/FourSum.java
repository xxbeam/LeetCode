package com.xx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *18. 四数之和
 */
public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3; i++) {
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for (int j = i+1; j < nums.length-2; j++) {
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int x=j+1,y=nums.length-1;
                while (x<nums.length&&y>x){
                    int test = nums[i]+nums[j]+nums[x]+nums[y];
                    if(test>target){
                        while (y>x&&nums[y]==nums[--y]){

                        }
                    }else if(test<target){
                        while (x<y&&nums[x]==nums[++x]){

                        }
                    }else{
                        List<Integer> yes = new ArrayList<Integer>();
                        yes.add(nums[i]);
                        yes.add(nums[j]);
                        yes.add(nums[x]);
                        yes.add(nums[y]);
                        list.add(yes);
                        while (y>x&&nums[y]==nums[--y]){

                        }
                        while (x<y&&nums[x]==nums[++x]){

                        }
                    }
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(fourSum(nums,-1));

    }

}
