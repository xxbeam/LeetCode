package com.xx;

/**
 * 45. 跳跃游戏 II
 */
public class JumpGameii {

    public int jump(int[] nums) {
        int count = 0;
        int l = nums.length-1;
        int i = 0;

        while (i<nums.length-1){
            int num = nums[i];
            if(num>=l){
                return count+1;
            }
            int max = num;
            int jump = 0;
            //计算两次跳跃最大长度
            for (int j=1;j<=num;j++){
                int x = nums[j+i];
                if(x+j>=l){
                    return count+2;
                }
                if(max<x+j){
                    max = x+j;
                    jump = j;
                }
            }
            l = l - jump;
            count++;
            i = i+jump;
        }
        return count;
    }


}
