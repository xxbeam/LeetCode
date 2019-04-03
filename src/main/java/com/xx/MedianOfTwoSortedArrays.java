package com.xx;

/**
 * 4. 寻找两个有序数组的中位数
 *
 * 将两个数组有序合并，取中间的数为中位数
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = 0;
        int b = 0;
        int i = 0;
//        int n = nums1.length;
//        int m = nums2.length;
        int[] arr = new int[nums1.length+nums2.length];
        while (a<nums1.length||b<nums2.length){
            if(a<nums1.length&&b>=nums2.length){
                arr[i] = nums1[a];
                a++;
            }else if(a>=nums1.length&&b<nums2.length){
                arr[i] = nums2[b];
                b++;
            }else{
                int x = nums1[a];
                int y = nums2[b];
                if(x<y){
                    arr[i] = x;
                    a++;
                }else{
                    arr[i] = y;
                    b++;
                }
            }
            i++;
        }
        int dis = (nums1.length+nums2.length)/2;
        int left = (nums1.length+nums2.length)%2;
        if(left == 0){
            return (arr[dis-1]+arr[dis])/2.0;
        }else{
            return arr[dis];
        }
    }

    public static void main(String[] args) {

        System.out.println(new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1,3},new int[]{2}));

    }

}
