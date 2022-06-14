// https://leetcode.com/problems/triangle/import java.util.*;

import java.util.*;
public class _0120_Triangle
{
    public static void main(String[] args)
    {
        int[][] tri =  {
                {2},
                {3, 4},
                {6, 5, 7}, 
                {4, 1, 8, 3}
            };

        // converting Array to List
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0;  i < tri.length; i++)
        {
            arr.add(i, new ArrayList<Integer>());
            for(int j = 0; j < tri[i].length; j++)
            {
                arr.get(i).add(j, tri[i][j]);
            }
        }
        
        Solution0120 obj = new Solution0120();
        System.out.println(obj.minimumTotal(arr));
    }
}

// Ans : -3
// 1
//-5 -2
// 3  6  1
//-1  2  4 -3

class Solution0120 {
    Integer[][] memo;
    public int minimumTotal(List<List<Integer>> triangle)
    {
        int n = triangle.size();
        
        memo = new Integer[n][n];
        
        int ans =  dfs(triangle, 0, 0);
        return ans;
    }
    
    public int dfs(List<List<Integer>> tri, int row, int col)
    {
        if(row == tri.size()-1)
        {
            return tri.get(row).get(col);
        }
        
        
        // check for backUp
        if(memo[row+1][col] != null)
        {
            int left = memo[row+1][col];
            int right;
            if(memo[row+1][col+1] == null)
            {
                right = dfs(tri, row+1, col+1);
            }
            else
            {
                right = memo[row+1][col+1];
            }
            int ans = tri.get(row).get(col) + Integer.min(left, right);
            
            memo[row][col] = ans;
            return ans; 
        }
        else
        {
            int left = dfs(tri, row+1, col);
            int right = dfs(tri, row+1, col+1);
            int ans = Integer.min(left, right) + tri.get(row).get(col);
            
            memo[row][col] = ans ;
            return ans;
        }   
    }
}




//-1  2  4 -3
// 3  6  1
//-5 -2
// 1