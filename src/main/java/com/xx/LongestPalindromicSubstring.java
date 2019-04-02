package com.xx;

/**
 * 5. 最长回文子串
 */
public class LongestPalindromicSubstring {

    /**
     * 遍历，先确定一个回文串中心点，得到该中心点的最长回文串，最后汇总
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int start = 0;
        int end = 0;
        for (int i = 0;i<s.length();i++) {
            int test = getPalindrome(s,i,i);
            int test1 = getPalindrome(s,i,i+1);
            int temp = Math.max(test,test1);
            if(temp>end-start){
                start = i - (temp-1)/2;
                end = i + temp/2 ;
            }

        }
        return s.substring(start,end+1);
    }

    public static int getPalindrome(String s,int begin,int end){
        int i = 0;
        while(begin>=0&&end<s.length()&&s.charAt(begin)==s.charAt(end)){
            i = end-begin;
            begin--;
            end++;
        }
        return i+1;
    }

    public static void main(String[] args) {


//        String b = "cbbd";
//        System.out.println(longestPalindrome(b));
//        System.out.println("预期：bb");

        String c = "a";
        System.out.println(longestPalindrome(c));
        System.out.println("预期：a");

        String d = "aaaaaaaaaaaaaaaaa";
        System.out.println(longestPalindrome(d));
        System.out.println("预期：aaaaaaaaaaaaaaaaa");

    }

}
