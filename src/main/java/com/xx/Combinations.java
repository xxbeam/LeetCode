package com.xx;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. 组合
 */
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        getNum(1,n,k,new ArrayList<Integer>(),list);
        return list;
    }

    public void getNum(int begin,int n,int left,List<Integer> list,List<List<Integer>> returnList){
        for (int i = begin; i <= n; i++) {
            if(n-i+1<left){
                continue;
            }
            List<Integer> listTemp = new ArrayList<>(list);
            listTemp.add(i);
            if(left-1==0){
                returnList.add(listTemp);
            }else{
                getNum(i+1,n,left-1,listTemp,returnList);
            }
        }
    }

    public static void main(String[] args) {

        List<List<Integer>> list = new Combinations().combine(4,2);

    }


}
