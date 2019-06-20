package com.xx;

/**
 * 65. 有效数字
 */
public class ValidNumber {

    public boolean isNumber(String s) {
        int numCount = 0;
        boolean isE = false;
        boolean eSign = false;
        boolean point = false;
        boolean lastIsNum = false;
        s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c>='0'&&c<='9'){
                numCount++;
                lastIsNum = true;
                continue;
            }else if(c==' '){
                return false;
            }else if(c=='+'||c=='-'){
                if(i==0){
                    lastIsNum = false;
                    continue;
                }else if(isE==true&&eSign==false){
                    eSign=true;
                    lastIsNum = false;
                    continue;
                }else{
                    return false;
                }
            }else if(c=='.'&&isE==false&&point==false){
                point=true;
                lastIsNum = true;
                continue;
            }else if(c=='e'&&isE==false&&numCount>0){
                isE=true;
                lastIsNum = false;
                continue;
            }else{
                return false;
            }
        }
        if(numCount==0){
            return false;
        }else if(lastIsNum == false){
            return false;
        }
        return true;
    }

}
