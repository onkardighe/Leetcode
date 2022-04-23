// https://leetcode.com/problems/climbing-stairs/

// Optimised with Dynamic Programming 

import java.util.*;
public class _0070_Climbing_Stairs {
    public static void main(String[] args) 
    {
        Solution obj = new Solution();
        int n = 45;
        System.out.println(obj.climbStairsOptimised(n));    
    }
}

class Solution {

    int[] arr = new int[46];
    public int climbStairsOptimised(int n)
    {
        Arrays.fill(arr,-1);
        return climb(0,n);
    }
    public int climb(int current, int top)
    {
        if(current == top)
        {
            return 1;
        }
        
        if(current > top)
        {
            return 0;
        }
        
        // check in cheche
        if(arr[current] != -1)
        {
            return arr[current];
        }
        
        int oneStep = climb(current+1, top);
        int twoStep = climb(current+2, top);
        arr[current] = oneStep+twoStep;
        return oneStep+twoStep;
    }



    public int climbStairsOld(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else if(n == 2)
        {
            return 2;
        }
        
        int prevSum = 1;
        int sum  = 2;
        n-=2;
        while(n > 0)
        {
            
            int temp = sum;
            sum = prevSum+sum;
            prevSum = temp;
            n--;
        }
        return sum;
    }
}