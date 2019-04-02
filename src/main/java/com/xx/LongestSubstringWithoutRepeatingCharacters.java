package com.xx;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int j = -1;
        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i);
            if(map.get(t)==null){
                map.put(t,i);
                max = i-j>max?i-j:max;
            }else{
                j = map.get(t);
                map.clear();
                i = j;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String a = "ppyfzt";
        System.out.println(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(a));
        System.out.println("预期值3");

        String b = "bbbbb";
        System.out.println(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(b));
        System.out.println("预期值1");

        String c = "pwwkew";
        System.out.println(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(c));
        System.out.println("预期值3");

    }


}
