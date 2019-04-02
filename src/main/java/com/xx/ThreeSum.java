package com.xx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            int x=i+1,y=nums.length-1;
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            while (x<nums.length&&y>x){
                int test = nums[i]+nums[x]+nums[y];
                if(test>0){
                   while (y>x&&nums[y]==nums[--y]){

                   }
                }else if(test<0){
                    while (x<y&&nums[x]==nums[++x]){

                    }
                }else{
                    List<Integer> yes = new ArrayList<Integer>();
                    yes.add(nums[i]);
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

        return list;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1,1,1};
        System.out.println(threeSum(nums));
        int[] nums1 = new int[]{0,0,0};
        System.out.println(threeSum(nums1));

    }

}
