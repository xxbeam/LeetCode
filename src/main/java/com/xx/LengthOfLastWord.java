package com.xx;

/**
 * 58. 最后一个单词的长度
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int l = 0;
        for (int i = s.length()-1; i>=0; i--) {
            if(s.charAt(i)==' '){
                if(l==0){
                    continue;
                }else{
                    break;
                }
            }
            l++;
        }
        return l;

    }

    public static void main(String[] args) {

        System.out.println(new LengthOfLastWord().lengthOfLastWord("Hello World"));

    }

}
