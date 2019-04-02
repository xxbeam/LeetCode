package com.xx;

import java.util.*;

/**
 * 30. 串联所有单词的子串
 */
public class SubstringWithConcatenationOfAllWords {

    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> list = new ArrayList<>();
        if("".equals(s)||words.length==0){
            return list;
        }

        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> tempMap = new HashMap<>();
        for (String str:words) {
            map = getMap(str,map);
            tempMap.put(str,0);
        }
        int k = words[0].length();
        for(int i=0;i<=s.length()-k*words.length;i++){
            int begin = i;
            int end = i+k;
            int count = 0;
            Map<String,Integer> inputMap = new HashMap<>(tempMap);
            while (end-i<=k*words.length&&end<=s.length()){
                String temp = s.substring(begin,end);
                if(check(temp,inputMap,map)){
                    begin = end;
                    end = end+k;
                    count++;
                    if(count==words.length){
                        break;
                    }
                }else{
                    break;
                }
            }
            if(count==words.length){
                list.add(i);
            }
        }
        return list;
    }

    public static boolean check(String str,Map<String,Integer> tempMap,Map<String,Integer> map){
        if(tempMap.get(str)==null){
            return false;
        }else{
            tempMap = getMap(str,tempMap);
            int x = tempMap.get(str);
            int y = map.get(str);
            if(y>=x){
                return true;
            }
        }
        return false;
    }
    public static Map<String,Integer> getMap(String str,Map<String,Integer> map){
        if(map.get(str)==null){
            map.put(str, 1);
        }else{
            map.put(str,map.get(str)+1);
        }
        return map;
    }

    public static void main(String[] args) {
        String s = "wordgoodgoodgoodbestword";
        String[] words =  {"word","good","best","word"};
        System.out.println(findSubstring(s,words));

        String a = "barfoothefoobarman";
        String[] as =  {"foo","bar"};
        System.out.println(findSubstring(a,as));
    }

}
