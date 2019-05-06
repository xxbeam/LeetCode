package com.xx;

/**
 * 88. 合并两个有序数组
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j = n-1;
        int l = m+n-1;

        while (i>=0&&j>=0){
            int x = nums1[i];
            int y = nums2[j];
            if(x>y){
                nums1[l] = x;
                i--;
            }else{
                nums1[l] = y;
                j--;
            }
            l--;
        }
        //如果i大于0，则不需要处理，j大于零，说明num1中的原数组均比剩余num2中的要大，已经排序在后面了
        if(j>=0){
            while (j>=0){
                nums1[j] = nums2[j];
                j--;
            }
        }

    }

    public static void main(String[] args) {
        int [] a = new int[]{1,2,3,0,0,0};
        new MergeSortedArray().merge(a,3,new int[]{2,5,6},3);
        System.out.println(a);
    }
}
