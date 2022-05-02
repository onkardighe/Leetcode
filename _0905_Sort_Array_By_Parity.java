// https://leetcode.com/problems/sort-array-by-parity/

import java.util.*;
public class _0905_Sort_Array_By_Parity
{
    public static void main(String[] args)
    {
        int[] nums = {3,1,2,4};
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.sortArrayByParity(nums)));    
    }    
}

class Solution {
    public int[] sortArrayByParity(int[] nums)
    {
        int slow = 0; 
        int fast = 0;
        while(fast < nums.length)
        {
            if(nums[fast]%2 == 0)
            {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            fast++;   
        }
        return nums;
    }
}
