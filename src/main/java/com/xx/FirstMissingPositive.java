package com.xx;

/**
 * 41. 缺失的第一个正数
 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {

        int temp = 0;
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            if(x>0&&x<=nums.length){
                if(x-1==i){
                    continue;
                }
                temp = nums[x-1];
                if(temp==x){
                    nums[i] = 0;
                    continue;
                }
               nums[x-1] = x;
               if(temp>0){
                   nums[i] = temp;
                   i--;
               }else{
                   nums[i] = 0;
               }
            }else{
                nums[i] = 0;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return i+1;
            }
        }
        return nums.length+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(new FirstMissingPositive().firstMissingPositive(arr));
    }
}
