// https://leetcode.com/problems/min-cost-climbing-stairs/


import java.util.*;
public class _0746_Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(new Solution746().minCostClimbingStairs(cost));
    }
}

class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        
        int[] memo = new int[cost.length+1];
        return Math.min(climb(cost, memo, 0), climb(cost, memo, 1));
        
    }
    
    int climb(int[] arr, int[] memo, int curr)
    {
        if(curr >= arr.length)
        {
            return 0;
        }
        
        else if(curr == arr.length-1)
        {
            return arr[arr.length-1];
        }
        
        if(memo[curr] != 0)
        {
            return memo[curr];
        }
        
        memo[curr] =  arr[curr] + Math.min(climb(arr, memo, curr+1), climb(arr, memo, curr+2));
        
        
        return memo[curr];
    }
}