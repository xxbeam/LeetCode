package com.xx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17. 电话号码的字母组合
 */
public class LetterCombinationsOfAPhoneNumber {
    private static final Map<String, String[]> map;

    static {
        map = new HashMap<String,String[]>();
        map.put("2",new String[]{"a","b","c"});
        map.put("3",new String[]{"d","e","f"});
        map.put("4",new String[]{"g","h","i"});
        map.put("5",new String[]{"j","k","l"});
        map.put("6",new String[]{"m","n","o"});
        map.put("7",new String[]{"p","q","r","s"});
        map.put("8",new String[]{"t","u","v"});
        map.put("9",new String[]{"w","x","y","z"});
    }
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < digits.length(); i++) {
            if(i==0){
                list.add(digits);
            }
            String[] d = map.get(String.valueOf(digits.charAt(i)));
            List<String> temp = new ArrayList<String>();
            for (int j = 0; j < list.size(); j++) {
                String a = list.get(j);
                for (int k = 0; k < d.length; k++) {
                    StringBuffer sb = new StringBuffer(a);
                    sb = sb.replace(i,i+1,d[k]);
                    temp.add(sb.toString());
                }
            }
            list = temp;
        }
        return list;
    }

    public static void main(String[] args) {
        String a = "23";
        System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations(a));
    }

}
