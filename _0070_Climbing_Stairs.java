// https://leetcode.com/problems/climbing-stairs/


public class _0070_Climbing_Stairs {
    public static void main(String[] args) 
    {
        Solution obj = new Solution();
        int n = 45;
        System.out.println(obj.climbStairs(n));    
    }
}

class Solution {
    public int climbStairs(int n)
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