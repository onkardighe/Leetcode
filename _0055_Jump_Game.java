// https://leetcode.com/problems/jump-game/


import java.util.*;
public class _0055_Jump_Game {
    public static void main(String[] args)
    {
        int[] arr = {3,2,1,0,4};
        Solution0055 obj = new Solution0055();
        System.out.println(obj.canJump(arr));   
    }
}


class Solution0055 {
    
    int[] check;
    public boolean canJump(int[] nums)
    {
        check = new int[nums.length];
        Arrays.fill(check, -1);
        return dp(nums, 0);    
    }
    
    public boolean dp(int[] nums, int current)
    {
        if(current == nums.length-1)
        {
            return true;
        }
        if(current >= nums.length)
        {
            return false;
        }
        
        if(check[current] != -1)
        {
            if(check[current] == 1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
        boolean ans = false;
        int val = nums[current];
        while(!ans)
        {
            if(val < 1)
            {
                break;
            }
            ans = ans || dp(nums, current+val); 
            val--;
        }

        
        if(ans)
        {
            check[current] = 1;
        }
        else
        {
            check[current] = 0;
        }    
        return ans;
    }
}