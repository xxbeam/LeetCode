package com.xx;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 */
public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        int closest = 99999999;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int x=i+1,y=nums.length-1;
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            while (x<nums.length&&y>x){
                int test = nums[i]+nums[x]+nums[y];
                closest = Math.abs(test-target)<Math.abs(closest-target)?test:closest;
                if(test>target){
                    while (y>x&&nums[y]==nums[--y]){

                    }
                }else if(test<target){
                    while (x<y&&nums[x]==nums[++x]){

                    }
                }else{
                   return test;
                }
            }
        }

        return closest;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{0,2,1,-3};
        System.out.println(threeSumClosest(nums,1));

    }

}
