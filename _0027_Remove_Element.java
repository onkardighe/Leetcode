// https://leetcode.com/problems/remove-element/

import java.util.Arrays;
public class _0027_Remove_Element {
    public static void main(String[] args)
    {
        int[] arr = {3,2,2,3};
        int val = 3; 
        System.out.println(removeElement(arr, val));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeElement(int[] nums, int val)
    {
        int iCnt = 0; 
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != val)
            {
                nums[iCnt++] = nums[i];
            }
        }
        return iCnt;
    }
}
