// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;
public class _0167_Two_Sum_II_Input_Array_Sorted {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[]  numbers = {-1, 0};
        int target = -1;
        System.out.println(Arrays.toString(obj.twoSum(numbers, target)));
    }
    
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = {-1, -1};
        for(int i = 0; i< numbers.length; i++)
        {
            int temp  = binarySearch(numbers, i+1, numbers.length-1, target-numbers[i]);
            if(temp != -1)
            {
                ans[0] = i+1;
                ans[1] = temp+1;
                return ans;
            }
        }
        return ans;
    }
    

    // Simple Binary Search
    public int binarySearch(int[] arr, int left, int right, int target)
    {
        
        while(left <= right)   
        {
            int mid = left+(right-left)/2;
            if(arr[mid] == target)
            {
               return mid;
            }
            else if(arr[mid]  < target)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        } 
        return -1;
        
    }
}