package com.xx;

import java.util.LinkedList;

/**
 * 71. 简化路径
 */
public class SimplifyPath {

    public String simplifyPath(String path) {
        if(path.equals("/")){
            return "/";
        }
        String[] arr =path.split("/");
        LinkedList<String> list = new LinkedList<>();

        for (int i = 1; i < arr.length; i++) {
            if(arr[i].equals(".")||arr[i].equals("")){
                continue;
            }else if(arr[i].equals("..")){
                if(list.size()>0){
                    list.removeLast();
                }
            }else{
                list.addLast(arr[i]);
            }
        }
        if(list.size()==0){
            return "/";
        }
        String simplePath = "";
        while (list.size()!=0){
            simplePath = simplePath + "/" + list.pop();
        }
        return simplePath;
    }


    public static void main(String[] args) {
        String a = "/a/../../b/../c//.//";
        System.out.println(new SimplifyPath().simplifyPath(a));

    }

}
