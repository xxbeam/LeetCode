package com.xx;

/**
 * 12. 整数转罗马数字
 */
public class IntegerToRoman {

    public String intToRoman(int num) {
        StringBuffer sb = new StringBuffer("");
        if(num>=1000){
            int x = num/1000;
            num = num%1000;
            for (int i = 0; i < x; i++) {
                sb.append("M");
            }
        }
        if(num>=900){
            int x = num/900;
            num = num%900;
            for (int i = 0; i < x; i++) {
                sb.append("CM");
            }
        }
        if(num>=500){
            int x = num/500;
            num = num%500;
            for (int i = 0; i < x; i++) {
                sb.append("D");
            }
        }
        if(num>=400){
            int x = num/400;
            num = num%400;
            for (int i = 0; i < x; i++) {
                sb.append("CD");
            }
        }
        if(num>=100){
            int x = num/100;
            num = num%100;
            for (int i = 0; i < x; i++) {
                sb.append("C");
            }
        }
        if(num>=90){
            int x = num/90;
            num = num%90;
            for (int i = 0; i < x; i++) {
                sb.append("XC");
            }
        }
        if(num>=50){
            int x = num/50;
            num = num%50;
            for (int i = 0; i < x; i++) {
                sb.append("L");
            }
        }
        if(num>=40){
            int x = num/40;
            num = num%40;
            for (int i = 0; i < x; i++) {
                sb.append("XL");
            }
        }
        if(num>=10){
            int x = num/10;
            num = num%10;
            for (int i = 0; i < x; i++) {
                sb.append("X");
            }
        }
        if(num>=9){
            int x = num/9;
            num = num%9;
            for (int i = 0; i < x; i++) {
                sb.append("IX");
            }
        }
        if(num>=5){
            int x = num/5;
            num = num%5;
            for (int i = 0; i < x; i++) {
                sb.append("V");
            }
        }
        if(num>=4){
            int x = num/4;
            num = num%4;
            for (int i = 0; i < x; i++) {
                sb.append("IV");
            }
        }
        if(num>=1){
            int x = num/1;
            for (int i = 0; i < x; i++) {
                sb.append("I");
            }
        }
        return sb.toString();
    }

}
