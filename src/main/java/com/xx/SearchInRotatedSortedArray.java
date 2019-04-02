package com.xx;

/**
 * 35. 搜索插入位置
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int l = nums.length;
        if(l==0){
            return -1;
        }
        return searchArr(nums,target,0,l-1);
    }

    public int searchArr(int[] nums, int target,int x,int y){
        if(x>y){
            return -1;
        }else if(x==y){
            if(nums[x]==target){
                return x;
            }else{
                return -1;
            }
        }
        int midP = x+(y-x)/2;
        int begin = nums[x];
        int mid = nums[midP];
        if(mid==target){
            return midP;
        }
        if(begin>mid){
            //中间点已经超过旋转点
            if(target>mid){
                if(target<begin){
                    //在右边
                    return serarchSort(nums,target,midP+1,y);
                }else{
                    //在左边
                    return searchArr(nums,target,x,midP-1);
                }
            }else if(target<mid){
                //在左边
                return searchArr(nums,target,x,midP-1);
            }
        }else{
            //中间点未超过旋转点
            if(target>mid){
                //在右边
                return searchArr(nums,target,midP+1,y);
            }else if(target<mid){
                if(target<begin){
                    //在右边
                    return searchArr(nums,target,midP+1,y);
                }else{
                    //在左边
                    return serarchSort(nums,target,x,midP-1);
                }
            }
        }
        return -1;
    }

    public int serarchSort (int[] nums, int target,int x,int y){
        while (x<=y){
            int midP = x+(y-x)/2;
            int mid = nums[midP];
            if(target>mid){
                x = midP+1;
            }else if(target<mid){
                y = midP-1;
            }else{
                return midP;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums ={4,5,6,7,8,1,2,3};
        System.out.println(new SearchInRotatedSortedArray().search(nums,8));
    }

}
