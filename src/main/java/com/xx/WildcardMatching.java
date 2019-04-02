package com.xx;

/**
 * 44. 通配符匹配
 */
public class WildcardMatching {

    public boolean isMatch(String s, String p) {

        char[] sarr = s.toCharArray();
        char[] parr = p.toCharArray();
        int x = 0;
        int y = 0;
        int index = -1;
        int pos = 0;
        while (x<s.length()){
            if(y<p.length()&&(parr[y]=='?'||sarr[x]==parr[y])){
                x++;
                y++;
            }else if(y<p.length()&&parr[y]=='*'){
                pos = x;
                index = y;
                y++;
            }else{
                if(index!=-1){
                    //将*号匹配的字符串+1并且重新匹配*之后的字符串
                    pos++;
                    x = pos;
                    y=index+1;
                }else{
                    return false;
                }
            }
        }
        while(y<p.length()&&parr[y]=='*'){
            y++;
        }
        return y==p.length();
    }

    public static void main(String[] args) {

        String a = "aaaa";
        String b = "***a";
        System.out.println(new WildcardMatching().isMatch(a,b));
        System.out.println(0<b.length());
    }
}
