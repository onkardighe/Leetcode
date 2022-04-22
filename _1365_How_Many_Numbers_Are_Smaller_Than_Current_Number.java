// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.*;
public class _1365_How_Many_Numbers_Are_Smaller_Than_Current_Number {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};

        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.smallerNumbersThanCurrent(arr)));
    }
}

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums)
    {
        int[] ans= new int[nums.length];
        int iCnt = 0;
        for(int i = 0; i < nums.length; i++)
        {
            iCnt = 0;
            // check for every ith elemement in nums
            for(int j = 0; j < nums.length; j++)
            {
                if(i != j && nums[i] > nums[j])
                {
                    iCnt ++;
                }
            }
            ans[i] = iCnt;
        }
        return ans;
    }
}
