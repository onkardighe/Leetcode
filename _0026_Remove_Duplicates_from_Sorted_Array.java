public class _0026_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        // int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int[] arr = {0,0,1};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums)
    {
        if(nums.length == 1)
        {
            return 1;
        }

        int iCnt = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(!contains(nums, nums[i], iCnt) )
            {
                iCnt++;
                nums[iCnt] = nums[i];
            }

            if(i != iCnt)
            {
                nums[i] = '_';
            }
        }
        return iCnt+1;
    }

    public static boolean contains(int[] arr, int target, int n)
    {
        for(int i = 0; i <= n; i++ )
        {
            if(arr[i] == target)
            {
                return true;
            }
        }    
        return false;
    }
}
