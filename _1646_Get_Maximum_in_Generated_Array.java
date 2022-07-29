// https://leetcode.com/problems/get-maximum-in-generated-array/


import java.util.*;
public class _1646_Get_Maximum_in_Generated_Array {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(new Solution1646().getMaximumGenerated(n));
    }
}


class Solution1646 {

    // TABULATION METHOD
    public int getMaximumGenerated(int n) {
        
        if(n < 2)
        {
            return n;
        }
        
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 2; i < n+1; i++)
        {
            if((i & 1) == 0)        // EVEN
            {
                dp[i] = dp[i/2];
            }
            else                    // ODD
            {
                dp[i] = dp[i/2] + dp[(i/2)+1];
            }
        }
        
        int maxNo = 0;
        for(int a : dp)
        {
            maxNo = Math.max(maxNo, a);
        }
        return maxNo;
    }
    
    
    // DP RECURSION + MEOISATION 
    // NOT REQUIRED
    int rec(int n, int[] dp)
    {
        if(n < 2)
        {
            return n;
        }
        
        if(dp[n] != -1)
        {
            return dp[n];
        }
        
        // EVEN
        if((n & 1) == 0)
        {
            dp[n] =  rec(n/2, dp);
        }
        else        // ODD
        {
            dp[n] =  rec(n/2, dp) + rec((n/2) + 1, dp);
        }
        return dp[n];
    }
}