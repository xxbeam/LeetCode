package com.xx;

/**
 * 70. 爬楼梯
 */
public class ClimbingStairs {

    /**
     * f(n)=f(n-1)+f(n-2)
     * f(1)=1
     * f(2)=2
     * f(3)=f(1)+f(2)
     * f(4)=f(2)+f(3)
     * @param
     * @return
     */
    public int climbStairs(int n) {
        if(n<1){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }
        int i = 3;
        int x = 1;
        int y = 2;
        int count = 0;
        while (i<=n){
            count = x+y;
            x = y;
            y = count;
            i++;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(44));
    }

}
