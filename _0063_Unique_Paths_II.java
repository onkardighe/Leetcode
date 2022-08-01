// https://leetcode.com/problems/unique-paths-ii/

import java.util.*;
public class _0063_Unique_Paths_II {
    public static void main(String[] args) {
        int[][] obstacleGrid = {
                                    {0, 0, 0}, 
                                    {0, 1, 0}, 
                                    {0, 0, 0}
                                };

        System.out.println(new Solution0063().uniquePathsWithObstacles(obstacleGrid));
        }    
}

class Solution0063 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int[][] dp = new int[m][n];
        for(int[] arr : dp)
        {
            Arrays.fill(arr, -1);
        }
        
        return rec(obstacleGrid, dp, m, n, 0, 0);        
    }
    
    public int rec(int[][] obstacleGrid, int[][] dp, int m, int n, int row, int col)
    {
        if(row >= m || col  >= n || obstacleGrid[row][col] == 1)
        {
            return 0;
        }
        
        if(row == m-1 && col  == n-1 && obstacleGrid[row][col] != 1)
        {
            return 1;
        }
        
        if(dp[row][col] != -1)
        {
            return dp[row][col];
        }
        
        int right = rec(obstacleGrid, dp, m, n, row, col+1);
        int down = rec(obstacleGrid, dp, m, n, row+1, col);
        dp[row][col] = right+down;
        return dp[row][col];  
    }
}
