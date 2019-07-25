package com.xx;

/**
 * 64. 最小路径和
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int[][] arr = new int[grid.length][grid[0].length];
        arr[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            arr[i][0] = grid[i][0] + arr[i-1][0];
        }
        for (int i = 1; i < grid[0].length; i++) {
            arr[0][i] = grid[0][i] + arr[0][i-1];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                arr[i][j] = Math.min(arr[i-1][j],arr[i][j-1]) + grid[i][j];
            }
        }
        return arr[grid.length-1][grid[0].length-1];
    }
}
