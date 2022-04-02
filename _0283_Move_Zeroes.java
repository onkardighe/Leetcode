// https://leetcode.com/problems/move-zeroes/submissions/


import java.util.Arrays;
public class _0283_Move_Zeroes {
    public static void main(String[] args)
    {
        int[] arr = {0,0,2,3};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums)
    {
        int iCnt = 0; 
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[iCnt++] = nums[i];
            }
        }
        for(int i = iCnt; i < nums.length; i++)
        {
            nums[i] = 0;
        }
    }
}
