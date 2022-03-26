// https://leetcode.com/problems/binary-search/

public class _0704_Binary_Search
{
    public static void main(String[] args) {
        
        int[] arr = {-1,0,3,5,9,12};
        int target  = 13;
        System.out.println(search(arr, target));
    }


    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int mid = -1;
        
        while((start <= end))
        {
            mid = start + (end - start)/2;
            if(target < nums[mid])
            {
                end = mid -1;
            }
            else if(target > nums[mid])
            {
                start = mid +1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}