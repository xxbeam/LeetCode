package com.xx;

/**
 *151. 翻转字符串里的单词
 */
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        if(s==null){
            return null;
        }
        if(s.equals("")){
            return "";
        }
        String[] arr = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = arr.length-1;i>=0;i--){
            String a = arr[i];
            if(!"".equals(a)){
                sb.append(a+" ");
            }
        }
        if(sb.length()>0){
            return sb.substring(0,sb.length()-1);
        }else{
            return "";
        }

}

    public static void main(String[] args) {
        String a = "sadsad";
        System.out.println(new ReverseWordsInAString().reverseWords(a));
    }

}
