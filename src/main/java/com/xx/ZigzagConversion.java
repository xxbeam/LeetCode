package com.xx;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. Z 字形变换
 */
public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        List<String[]> list = new ArrayList<String[]>();
        int row = 1;
        if(numRows==1){
            return s;
        }else{
            row =  s.length()/(numRows*2-2);
        }

        int base = (numRows-1)*2;
        for (int i = 0; i < numRows; i++) {
            String[] array = new String[(numRows-1)*(row+1)];
            list.add(array);
        }
        for (int i = 1; i <= row+1 ; i++) {
            for (int j = 0; j < numRows; j++) {
                int x = base*(i-1)+j;
                if(x>s.length()-1){
                    break;
                }
                list.get(j)[(i-1)*(numRows-1)]=String.valueOf(s.charAt(x));
                if(j==0||j==numRows-1){

                }else{
                    int y = base*(i)-j;
                    if(y>s.length()-1){
                        continue;
                    }
                    list.get(j)[(i-1)*(numRows-1)+numRows-j-1]=String.valueOf(s.charAt(y));
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            String[] array = list.get(i);
            for (String a:array) {
                if(a!=null){
                    sb.append(a);
                }
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
//        String a = "";
       String a = "ABC";
        System.out.println(convert(a,3));
        System.out.println("预期：PAHNAPLSIIGYIR");

        System.out.println(convert(a,4));
        System.out.println("预期：PINALSIGYAHRPI");
    }


}
