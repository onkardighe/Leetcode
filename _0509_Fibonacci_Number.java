// https://leetcode.com/problems/fibonacci-number/

import java.util.*;
public class _0509_Fibonacci_Number 
{
    public static void main(String[] args) {
        int n = 5;
        Solution0509 obj = new Solution0509();
        System.out.println(obj.fib(n));
        System.out.println(obj.fibonacciMemoisation(n, new int[n+1]));
        System.out.println(obj.fibonacciTabulation(n));
        System.out.println(obj.fibonacciStorageOptimisation(n));
    }
    
}

class Solution0509 {
    public int fib(int n) {
        return fibonacciRecursion(n);
    }

    // DP By Storage Optimisation
    // Time : O(n)
    // Space : O(1)
    public int fibonacciStorageOptimisation(int n)
    {
        
        if(n <= 1)
        {
            return n;
        }
        
        int prev1 = 1; 
        int prev2 = 0;
        
        int curr = 0;
        for(int i = 2; i <= n ; i++)
        {
            curr = prev1+prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }

    // DP by Tabulation
    // Time : O(n)
    // Space : O(n)
    public int fibonacciTabulation(int n)
    {
        
        if(n <= 1)
        {
            return n;
        }
        
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 2; i <= n ; i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    // DP By Recusrion + Memoisation
    // Time : O(n)
    // Space : O(n)
    public int fibonacciMemoisation(int n, int[] dp)
    {
        if(n <= 1)
        {
            return n;
        }
        
        if(dp[n] != 0)
        {
            return dp[n];
        }
        
        dp[n] =  fibonacciMemoisation(n-1, dp)+fibonacciMemoisation(n-2, dp);
        return dp[n];
    }
    
    // By Recursion
    // Time : O(2n)
    // Space : O(n)
    public int fibonacciRecursion(int iNo)
    {
        if(iNo < 2)
        {
            return iNo;
        }
        return fibonacciRecursion(iNo-1) +  fibonacciRecursion(iNo-2);
    }
}