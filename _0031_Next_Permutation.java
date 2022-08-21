// https://leetcode.com/problems/next-permutation/

import java.util.Arrays;
public class _0031_Next_Permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        new Solution0031().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}


class Solution0031 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        if(n == 1)
        {
            return;
        }
        
        int i = n-2, j = 0;
        while(i >= 0 && nums[i] >= nums[i+1])
        {
            i--;
        }
        
        
        // Iff BreakPoint found at i
        if(i >= 0)
        {
            j = n-1;
            while(nums[j] <= nums[i])
            {
                j--;
            }
            
            // nums[j] is smallest greater number that nums[i] in nums
            swap(nums, i, j);
        }
        
        // reverse array greater than break Point

        i++;
        j = n-1;
        while(i < j)
        {
            swap(nums, i++, j--);
        }
    }
    
    public void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}