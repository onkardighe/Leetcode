// https://leetcode.com/problems/combination-sum-iv/


import java.util.*;
public class _0377_Combination_Sum_IV {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 4;
        System.out.println(new Solution0377().combinationSum4(nums, target));
    }
}


class Solution0377 {
    int iCnt = 0;
    
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp, -1);
        return rec(nums, target, 0, dp);    
        // return iCnt;
    }
    
    public int rec(int[] nums, int target, int sum, int[] dp)
    {
        if(sum > target)
        {
            return 0;
        }
        else if(sum == target)
        {
            return 1;
        }
        
        if(dp[sum] != -1)
        {
            return dp[sum];
        }
        
        int ans = 0;
        for(int a : nums)
        {
            ans += rec(nums, target, sum + a,dp);
        }
        
        dp[sum] = ans;
        return ans;
        
    }
}