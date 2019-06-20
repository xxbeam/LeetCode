package com.xx;


/**
 * 63. 不同路径 II
 */
public class UniquePathsii {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] arr = new int[obstacleGrid.length][obstacleGrid[0].length];

        for (int i = 0; i < obstacleGrid.length; i++) {
            if(obstacleGrid[i][0]==1){
                break;
            }else{
                arr[i][0] = 1;
            }
        }

        for (int i = 0; i < obstacleGrid[0].length; i++) {
            if(obstacleGrid[0][i]==1){
                break;
            }else{
                arr[0][i] = 1;
            }
        }
        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                if(obstacleGrid[i][j]==1){
                    continue;
                }else{
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
            }
        }
        return arr[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }

}
