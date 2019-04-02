package com.xx;

/**
 * 9. 回文数
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int dev = 0;
        int test = x;
        while(x>0){
            int d = x%10;
            x = x/10;
            dev = dev*10+d;
        }
        System.out.println(dev);
        System.out.println(test);
        return dev == test;
    }

    public static void main(String[] args) {
        String a = "aab";
        System.out.println(a.matches("a"));
        System.out.println(a.matches("a*"));
        System.out.println(a.matches(".a*b"));
        System.out.println("mississippi".matches("mis*is*p*."));
    }
}
