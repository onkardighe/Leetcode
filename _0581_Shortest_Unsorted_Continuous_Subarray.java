// https://leetcode.com/problems/shortest-unsorted-continuous-subarray/

import java.util.*;
public class _0581_Shortest_Unsorted_Continuous_Subarray {
    public static void main(String[] args)
    {
        int[] arr = {2,6,4,8,10,9,15};
        System.out.println(new Solution().findUnsortedSubarray(arr));
    }
}

class Solution {
    public int findUnsortedSubarray(int[] nums)
    {

        // Sort and copy array
        int[] arr = nums.clone();
        Arrays.sort(arr);
        
        int lower = 0;
        int upper = 0;

        // search for lower bound Index
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != arr[i])
            {
                lower = i;
                break;
            }
        }

        // Search for upper bound Index
        for(int i = nums.length-1; i >= 0; i--)
        {
            if(nums[i] != arr[i])
            {
                upper = i;
                break;
            }
        }        
        int ans  = upper - lower;

        // check for wrong positions
        if(ans <= 0 || ans > nums.length)
        {
            return 0;
        }
        else
        {
            return ans+1;
        }
    }
}


