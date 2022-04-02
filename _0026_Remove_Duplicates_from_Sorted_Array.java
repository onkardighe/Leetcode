// https://leetcode.com/problems/remove-duplicates-from-sorted-array


public class _0026_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args)
    {
        int[] arr = {0,0,2};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums)
    {
        if(nums.length == 1)
        {
            return 1;
        }

        int iCnt = 1;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != nums[i-1])
            {
                
                nums[iCnt++] = nums[i];
            }
        }
        return iCnt;
    }
}
