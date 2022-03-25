// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class _0852_Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {

        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(arr));

    }
    static int peakIndexInMountainArray(int[] arr) 
    {
        int start = 0;
        int end = arr.length-1;
        int mid = -1;

        while(start < end)
        {
            mid  = start + (end - start)/2;
        
            if( arr[mid] > arr[mid+1])
            {
                end = mid;
            }
            else if(arr[mid] < arr[mid+1])
            {
                start = mid+1;
            }
        }
        return start;
    }
}

