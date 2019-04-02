package com.xx;

/**
 *8. 字符串转换整数 (atoi)
 */
public class StringToIntegerAtoi {

    public static int myAtoi(String str) {
        String sign = "";
        int res = 0;
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '&&flag){
                continue;
            }
            if(str.charAt(i)=='+'||str.charAt(i)=='-'){
                if(!flag){
                    break;
                }
                sign = str.substring(i,i+1);
                flag = false;
                continue;
            }
            if(Character.isDigit(str.charAt(i))){
                flag = false;
                int num = str.charAt(i) - '0';
                if(sign.equals("-")){
                    if(Integer.MIN_VALUE/10-res>=1||(Integer.MIN_VALUE/10-res>=0&&Integer.MIN_VALUE%10+num>=0)){
                        return Integer.MIN_VALUE;
                    }
                    res = res*10 + (0-num);
                }else{
                    if(Integer.MAX_VALUE/10-res<=-1||(Integer.MAX_VALUE/10-res<=0&&Integer.MAX_VALUE%10-num<=0)){
                        return Integer.MAX_VALUE;
                    }
                    res = res*10 + num;
                }
            }else{
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String a = "2147483646";
        System.out.println(myAtoi(a));
        //563847412
        System.out.println(Integer.MAX_VALUE/10-(214748365));
        System.out.println(Integer.MAX_VALUE);
    }

}
