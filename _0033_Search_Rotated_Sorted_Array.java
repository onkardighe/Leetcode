public class _0033_Search_Rotated_Sorted_Array
 
{
    public static void main(String[] args) {
        int[] arr = {1, 3};
        int target = 4;
        System.out.println(search(arr, target));
    }    



    public static int search(int[] arr, int target)
    {
        int peak  = getPeak(arr);

        // pivot NOT found
        // OR
        // Array not rotated
        if(peak == -1)
        {
            return binarySearch(arr, target, 0 , arr.length-1); 
        }
        else
        {
            if(peak < arr.length && target == arr[peak])
            {
                return peak;
            }
            else if(target >= arr[0])
            {
                return binarySearch(arr, target, 0, peak-1);
            }
            else
            {
                return binarySearch(arr, target, peak+1, arr.length-1);
            }

        }
    }

    // 0 1 
    // 1 3
    public static int binarySearch(int[] arr, int target, int start, int end)
    {
        if(arr.length <= 0)
        {
            return -1;
        }    
        int mid = 0;

        while(start <= end)
        {
            mid = start + (end-start)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                start = mid+1;
            }
            else if(target < arr[mid])
            {
                end = mid-1;
            }
        }
        return -1;
    }



    public static int getPeak(int[] arr)
    {
        int start = 0;
        int end= arr.length-1;
        int mid = 0;
        if(arr.length == 1)
        {
            return 1;
        }

        if(arr[start] < arr[end])
        {
            return -1;
        }


        while(start < end)
        {   
            mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            if(arr[start] <= arr[mid])
            {
                start = mid;
            }
            else
            {
                end = mid-1;
            }
        }    
        return -1;
    }
}

