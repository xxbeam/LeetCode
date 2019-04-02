package com.xx;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. 罗马数字转整数
 */
public class RomanToInt {


    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] arr = s.toCharArray();
        int num = 0;
        for (int i=0;i<arr.length;i++){
            char temp = arr[i];
            int a = map.get(temp);
            if(i+1<s.length()){
                int b = map.get(arr[i+1]);
                if(a<b){
                    a = b-a;
                    i++;
                }
            }
            num = num + a;
        }

        return num;
    }


}
