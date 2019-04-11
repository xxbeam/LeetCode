package com.xx;

/**
 * 55. 跳跃游戏
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        if(1==nums.length){
            return true;
        }
        int l = nums.length-1;
        for (int i = nums.length-1; i>=0 ; i--) {
            int num = nums[i];
            if(num>=l-i){
                l = i;
            }
        }
        if(l==0){
            return true;
        }
        return false;
    }

}
