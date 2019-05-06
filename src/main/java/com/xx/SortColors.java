package com.xx;

import java.util.Arrays;

/**
 * 75. 颜色分类
 */
public class SortColors {

    public void sortColors(int[] nums) {
        int x = 0;
        int y = nums.length-1;
        int i = 0;
        while (y!=0&&i<=y){
            int num = nums[i];
            if(num==0){
                int temp = nums[x];
                nums[x] = num;
                nums[i] = temp;
                if(x==i){
                    i++;
                }
                x++;
            }else if(num==2){
                int temp = nums[y];
                nums[y] = num;
                nums[i] = temp;
                if(y==i){
                    i++;
                }
                y--;
            }else{
                i++;
            }
        }
    }


    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};
        new SortColors().sortColors(nums);
        Arrays.stream(nums).forEach(num -> System.out.println(num));

    }

}
