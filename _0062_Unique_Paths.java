// https://leetcode.com/problems/unique-paths/


// Recursion   : O(e^n)
// DP + Memo   : O(m*n)     Space = O(n*m)
// Combination : O(m)       Space = O(1) 


import java.util.*;

public class _0062_Unique_Paths
{
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(new Solution0062POptimised().uniquePaths(m, n));
    }
}


class Solution0062POptimised {
    public int uniquePaths(int m, int n) {
        int N = m+n-2;
        int R = Math.min(m, n)-1;
        double res = 1;
        
        
        // calculating NcR
        
        for(int i = 1; i <=R; i++)
        {
            res = res * (N-R+i)/i;
        }
        
        return (int)res;
        
    }
}

class Solution0062 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] arr : dp)
        {
            Arrays.fill(arr, -1);
        }
        
        return rec(dp, m, n, 0, 0);
        
    }
    
    public int rec(int[][] dp, int m, int n, int row, int col)
    {
        if(row >= m || col  >= n)
        {
            return 0;
        }
        
        if(row == m-1 && col  == n-1)
        {
            return 1;
        }
        
        if(dp[row][col] != -1)
        {
            return dp[row][col];
        }
        
        int right = rec(dp, m, n, row, col+1);
        int down = rec(dp, m, n, row+1, col);
        dp[row][col] = right+down;
        return dp[row][col];
            
    }
    
}