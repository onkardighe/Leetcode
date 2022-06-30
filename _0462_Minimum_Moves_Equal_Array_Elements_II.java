// https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/

import java.util.*;
public class _0462_Minimum_Moves_Equal_Array_Elements_II {
    public static void main(String[] args) {
        int[] arr = {1,10,2,9};
        System.out.println(new Solution0462().minMoves2(arr));
    }
}

class Solution0462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        
        int mid = nums[nums.length/2];
        
        int ans =0 ;
        for(int a : nums)
        {
            ans += Math.abs(a-mid);
        }
        
        return ans;
    }
} 


