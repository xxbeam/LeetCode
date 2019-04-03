package com.xx;

/**
 * 50. Pow(x, n)
 */
public class PowXN {

    public double myPow(double x, int n) {
        if(n<0){
            if(n==Integer.MIN_VALUE){
                //无法转换为绝对值的整数int，做单独处理
                return 1/(myPow(x,Integer.MAX_VALUE)*x);
            }else{
                n = Math.abs(n);
                return 1/pow(x,n);
            }
        }else{
            return pow(x,n);
        }
    }

    public double pow(double x,int n){
        double res = 0;
        if(n==0){
            res = 1;
        }else if(n==1){
            res = x;
        }else{
            int left = n%2;
            res = pow(x,n/2);
            res = res * res*pow(x,left);
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(new PowXN().myPow(1.00000,-2147483648));

    }


}
