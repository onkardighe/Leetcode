import java.util.Arrays;

// https://leetcode.com/problems/median-of-two-sorted-arrays/

public class _0004_Median_of_Two_Sorted_Arrays
{
    public static void main(String[] args) {
     
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};

        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {

        int[] arr = new int[nums1.length+nums2.length];

        int i = 0, j = 0, ansCnt = 0;
        while(ansCnt < arr.length)
        {
            if(i <  nums1.length && j < nums2.length)
            {
                if(nums1[i] < nums2[j])
                {
                    arr[ansCnt] = nums1[i];
                    ansCnt++;
                    i++;
                }
                else
                {
                    arr[ansCnt] = nums2[j];
                    ansCnt++;
                    j++;
                }
            }
            else
            {
                if(i>=nums1.length)
                {
                    arr[ansCnt] = nums2[j];
                    ansCnt++;
                    j++;
                }
                else if(j>=nums2.length)
                {
                    arr[ansCnt] = nums1[i];
                    ansCnt++;
                    i++;
                }
            }
        }
        
        double ans;
        // Even
        if(arr.length % 2 ==0)
        {
            int midIndex = (arr.length-1)/2;
            ans = (double)(arr[midIndex]+arr[midIndex+1])/2;
        }
        else
        {
            int midIndex = (arr.length-1)/2;
            ans = arr[midIndex];
        }        
        return ans;
    }
}