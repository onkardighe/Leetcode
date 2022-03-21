// https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/


import java.util.*;
public class _0442_Find_All_Duplicates_in_Array {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(findDuplicates(arr));
        
    }

    public static List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        while(i < nums.length)
        {
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex])
            {
                swap(nums, i, correctIndex);
            }
            else
            {
                i++;
            }
        }

        for(int j = 0; j<nums.length; j++)
        {
            if(nums[j] != j+1)
            {
                ans.add(nums[j]);
            }
        }

        return ans;
    }

    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;   
    }
}
