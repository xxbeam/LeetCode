package com.xx;

/**
 * 56. 合并区间
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        int count = 0;
        for (int i = 0; i < intervals.length; i++) {
            if(intervals[i]==null){
                continue;
            }
            for (int j = i+1; j < intervals.length; j++) {
                if(intervals[j]==null){
                    continue;
                }
                if(intervals[i][0]>intervals[j][1]||intervals[i][1]<intervals[j][0]){
                    continue;
                }else{
                    //可以合并，则把第一个区间合并至后面的区间
                    intervals[j][0] = Math.min(intervals[i][0],intervals[j][0]);
                    intervals[j][1] = Math.max(intervals[i][1],intervals[j][1]);
                    intervals[i] = null;
                    count++;
                    break;
                }
            }
        }
        int[][] returnArr = new int[intervals.length-count][2];
        int idx = 0;
        for (int i = 0; i < intervals.length; i++) {
            if(intervals[i]!=null){
                returnArr[idx] = intervals[i];
                idx++;
            }
        }
        return returnArr;
    }

    public static void main(String[] args) {
        int[][] a = {{2,3},{2,2},{3,3},{1,3},{5,7},{2,2},{4,6}};
        new MergeIntervals().merge(a);
    }

}
