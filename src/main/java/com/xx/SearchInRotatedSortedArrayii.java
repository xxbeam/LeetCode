package com.xx;

/**
 * 81. 搜索旋转排序数组 II
 */
public class SearchInRotatedSortedArrayii {

    public boolean search(int[] nums, int target) {
        if(nums.length==0){
            return false;
        }
        return search(0,nums.length-1,target,nums);
    }

    public boolean search(int b,int e,int target,int[] nums){
        int mid = (e-b+1)/2+b;
        int x = nums[b];
        int y = nums[e];
        int z = nums[mid];
        if(x==target||y==target||z==target){
            return true;
        }
        if(e-b<=1){
            return false;
        }

        if(z==x){
            int a = nums[mid-1];
            if(a!=z){
                //旋转点在左边
                if(target>x){
                    return search(b,mid,target,nums);
                }else{
                    if(target>z){
                        return search(mid,e,target,nums);
                    }else{
                        return search(b,mid,target,nums);
                    }
                }
            }else{
                return search(mid,e,target,nums)||search(b,mid,target,nums);
            }
        }else if(z<x){
            //旋转点在左边
            if(target>x){
                return search(b,mid,target,nums);
            }else{
                if(target>z){
                    return search(mid,e,target,nums);
                }else{
                    return search(b,mid,target,nums);
                }
            }
        }else{
            //旋转点在右边
            if(target<x){
                return search(mid,e,target,nums);
            }else{
                if(target>z){
                    return search(mid,e,target,nums);
                }else{
                    return search(b,mid,target,nums);
                }
            }
        }
    }
}
