import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/


public class _1480_Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};


        Solution1480 obj = new Solution1480();
        System.out.println(Arrays.toString(obj.runningSum(nums)));
    }
}


class Solution1480 {
    public int[] runningSum(int[] nums) 
    {
        if(nums.length == 1)
        {
            return nums;
        }
        for(int i = 1; i < nums.length; i++)
        {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}