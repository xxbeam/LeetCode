package com.xx;


/**
 * 80. 删除排序数组中的重复项 II
 */
public class RemoveDuplicatesFromSortedArrayii {

    public int removeDuplicates(int[] nums) {

        /**
         * 长度只有2的肯定没有重复项
         */
        if(nums.length<=2){
            return nums.length;
        }
        int x = -1;//重复项出现的位置
        int i = 2;
        int count = 2;
        while (i<nums.length){
            int num = nums[i];
            //之前没有重复项出现时，只需要比较前面两个是否相等即可
            if(x==-1){
                if(num==nums[i-2]){
                    x=i;
                }else{
                    count++;
                }
            }else{
                //有重复项出现后，数组位置已经发生变化，需要与没有重复项的那串数组进行比较
                if(num==nums[x-1]&&num==nums[x-2]){
                    //出现重复项，不操作
                }else{
                    count++;
                    nums[x] = num;
                    x++;
                }
            }
            i++;
        }
        return count;
    }

}
