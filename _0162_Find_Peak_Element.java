// https://leetcode.com/problems/find-peak-element/


public class _162_Find_Peak_Element{
    public static void main(String[] args) 
    {
    //               0   1 2 3  4  5   6   7 8
        int[] arr = {1, 2,3,5, 9, 13, 15, 6, 4};

        System.out.println(peakIndex(arr));
    }


    public static int peakIndex(int[] arr)
    {
        int iStart = 0;
        int iEnd = arr.length-1;

        while(iStart < iEnd)
        {
            int mid = iStart+(iEnd-iStart)/2;

            if(arr[mid] > arr[mid+1])
            {
                // Desc part of arr
                iEnd = mid;
            }
            else
            {
                iStart = mid+1;
            }
        }
        return iStart;
    }
}
