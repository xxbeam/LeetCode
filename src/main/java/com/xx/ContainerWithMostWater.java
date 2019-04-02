package com.xx;

/**
 * 11. 盛最多水的容器
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int x = 0; int y = height.length-1;
        while (x<y){
            int area = (y-x)*Math.min(height[x],height[y]);
            maxArea = Math.max(maxArea,area);
            if(height[x]>height[y]){
                y--;
            }else {
                x++;
            }
        }
        return maxArea;
    }


    public static void main(String[] args) {

        int[] a = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));

    }


}
