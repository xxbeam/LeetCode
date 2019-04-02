package com.xx;

/**
 * 7. 整数反转
 */
public class ReverseInteger {

    public static int reverse(int x) {
        String a = String.valueOf(x);
        String sign = "";
        int idx = a.indexOf("-");
        if(idx>=0){
            sign = "-";
            a = a.replaceAll("-","");
        }
        StringBuffer sb  = new StringBuffer();
        sb.append(a);
        sb.reverse();
        a = sb.toString();
        int res = 0;
        boolean flag = true;
        for (int i = 0; i < a.length(); i++) {
            int num = a.charAt(i) - '0';
            if(sign.equals("-")){
                if(Integer.MIN_VALUE/10-res>=10||(Integer.MIN_VALUE/10-res>=0&&Integer.MIN_VALUE%10+num>=0)){
                    return 0;
                }
                res = res*10 + (0-num);
            }else{
                if(Integer.MAX_VALUE/10-res<=-10||(Integer.MAX_VALUE/10-res<=0&&Integer.MAX_VALUE%10-num<=0)){
                    return 0;
                }
                res = res*10 + num;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int a = 1563847412;
        System.out.println(reverse(a));

    }

}
