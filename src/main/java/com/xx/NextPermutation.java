package com.xx;

import java.util.Arrays;

/**
 * 31. 下一个排列
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {

        if(nums.length<=1){
            return;
        }
        for (int i=nums.length-1;i>0;i--){
            int a = nums[i];
            int b = nums[i-1];
            if(a>b){
                sort(nums,i);
                for (int j=i;j<nums.length;j++){
                    if(b<nums[j]){
                        int temp = nums[j];
                        nums[j] = b;
                        nums[i-1] = temp;
                        return;
                    }
                }
            }
        }
        //如果是最大，直接变成最小,直接收尾交换即可
        int i =0;
        int j = nums.length-1;
        while (i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void sort(int[] nums,int begin){
        for (int i=0;i<nums.length-begin-1;i++){
            for (int j=begin;j<nums.length-1-i;j++){
                int a = nums[j];
                int b = nums[j+1];
                if(a>b){
                    int temp = a;
                    nums[j] = b;
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,3,2};
        new NextPermutation().nextPermutation(arr);

        Arrays.stream(arr).forEach(i -> System.out.println(i));

    }

}
