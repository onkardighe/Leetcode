// https://leetcode.com/problems/divisor-game/


import java.util.*;
public class _1025_Divisor_Game
{
    public static void main(String[] args)
    {
        int n = 12;
        System.out.println(new Solution1025().divisorGame(n));    
    }
}

class Solution1025 {
    int iCnt= 0;
    int[] memo;
    public boolean divisorGame(int n) {
        memo = new int[n+1];
        Arrays.fill(memo, -1);
        return recur(n);
    }
    
    public boolean recur(int n)
    {
        
        if(n <= 1)
        {
            if((iCnt & 1) == 0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        
        iCnt++;
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                // check for memo
                if(memo[i] != -1)
                {
                    if(memo[i] == 1)
                    {
                        return true;
                    }
                    return false;
                }
                else
                {
                    boolean ans = recur(n-i);
                    if(ans)
                    {
                        memo[i] = 1;
                    }
                    else
                    {
                        memo[i] = 0;
                    }
                    return ans;
                }  
            }
        }
        
        if((iCnt & 1) == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}