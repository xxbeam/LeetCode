package com.xx;

/**
 * 66. 加一
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length-1; i >= 0 ; i--) {
            int nums = digits[i]+1;
            if(nums<10){
                digits[i] = nums;
                return digits;
            }else{
                digits[i] = nums-10;
                if(i==0){
                    //最高位需要加一，重新新建数组
                    int[] newArr = new int[digits.length+1];
                    newArr[0] = 1;
                    for (int j = 1; j < newArr.length; j++) {
                        newArr[j] = digits[j-1];
                    }
                    return newArr;
                }

            }
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(new PlusOne().plusOne(new int[]{9,9}));
    }


}
