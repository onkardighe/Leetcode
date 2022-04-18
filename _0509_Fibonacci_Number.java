// https://leetcode.com/problems/fibonacci-number/

import java.util.*;
public class _0509_Fibonacci_Number 
{
    public static void main(String[] args) {
        int n = 5;
        Solution obj = new Solution();
        System.out.println(obj.fib(n));
    }
    
}

class Solution {
    public int fib(int n) {
        return fibonacci(n);
    }
    
    public int fibonacci(int iNo)
    {
        if(iNo < 2)
        {
            return iNo;
        }
        
        return fibonacci(iNo-1) +  fibonacci(iNo-2);
    }
}