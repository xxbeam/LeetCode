package com.xx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 22. 括号生成
 */
public class GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
        String[] arr = new String[]{"(",")"};
        Map<String,Integer> map = new HashMap<String,Integer>();
        String a = "(";
        map.put(a,1);
        for (int i = 1; i < n*2 ; i++) {
            Map<String,Integer> newMap = new HashMap<String,Integer>();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    String str = entry.getKey();
                    int left = entry.getValue();
                    if(left==0){
                        newMap.put(str+arr[0],left+1);
                    }else if(left>0){
                        if(2*n-i==left){
                            newMap.put(str+arr[1],left-1);
                        }else{
                            newMap.put(str+arr[0],left+1);
                            newMap.put(str+arr[1],left-1);
                        }
                    }
            }
            map = newMap;
        }
        List<String> list = new ArrayList<String>(map.keySet());
        return list;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }


}
