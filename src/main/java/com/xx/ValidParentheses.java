package com.xx;

import java.util.HashMap;
import java.util.Map;

/**
 * 20. 有效的括号
 */
public class ValidParentheses {

    private static Map<String,String> map = null;

    static {
        map = new HashMap<String,String>();
        map.put("(",")");
        map.put("{","}");
        map.put("[","]");
    }

    /*
    可以用栈的方式处理
     */
    public static boolean isValid(String s) {
        int b = s.length()%2;
        if(b!=0){
            return false;
        }

        for (int i = s.length()-1; i >=0; i--) {
            String end = map.get(String.valueOf(s.charAt(i)));
            if(end==null){
               continue;
            }

            int endNum = i;
            int con = -1;
            while (con!=0&&endNum!=-1){
                endNum = s.indexOf(end,endNum+1);
                con = (endNum-i-1)%2;
            }
            if(endNum==-1||con!=0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        String a = "[({(())}[()])]";
        System.out.println(ValidParentheses.isValid(a));
        System.out.println(a.indexOf(")"));
        System.out.println(a.indexOf(")",1));
        System.out.println(a.indexOf(")",7));
        System.out.println(a.indexOf(")",8));
    }

}
