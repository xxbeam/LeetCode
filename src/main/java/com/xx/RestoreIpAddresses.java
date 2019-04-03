package com.xx;

import java.util.ArrayList;
import java.util.List;

/**
 * 93. 复原IP地址
 */
public class RestoreIpAddresses {

    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        getIp(s,0,0,list,"");
        return list;
    }

    public void getIp(String s,int idx,int pos,List<String> list,String ipPre){
        int count=1;
        while (idx<s.length()&&idx+count<=s.length()&&count<=3){
            String str = s.substring(idx,idx+count);
            int ipNum = Integer.parseInt(str);
            if(ipNum>255||String.valueOf(ipNum).length()!=str.length()) {
                count++;
                continue;
            }
            String ip = ipPre + str;
            if(pos+1==4){
                if(idx+count==s.length()){
                    list.add(ip);
                }
            }else{
                getIp(s,idx+count,pos+1,list,ip+".");
            }
            count++;
        }
    }

    public static void main(String[] args) {
        String a = "25525511135";
        System.out.println(new RestoreIpAddresses().restoreIpAddresses(a));
    }
}
