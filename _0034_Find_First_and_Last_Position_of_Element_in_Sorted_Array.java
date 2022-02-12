
public class _0034_Find_First_and_Last_Position_of_Element_in_Sorted_Array
{
    public static void main(String[] args) {
        int arr[] = {};
        int target  = 6;
        int[] iPrt = searchRange(arr, target);
        System.out.println(iPrt[0]);
        System.out.println(iPrt[1]);
    }    


    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = binarySearch(nums, target, true);
        ans[1] = binarySearch(nums, target, false);
        return ans;
    }



    // This function simply returns index of target
    // if searchFirstPosition==true then for first occurance
    // else inedx for last occurance
    static int binarySearch(int[] arr,int target, boolean searchFirstPosition)
    {

        if(arr.length == 0)
        {
            return -1;
        }


        int start = 0;
        int end = arr.length-1;
        int flagIndex = -1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid] == target)
            {
                // potential ans is found
                flagIndex = mid;
                if(searchFirstPosition)
                {
                    end  = mid-1;
                }
                else
                {
                    start  = mid+1;
                }
            }
            else if(target < arr[mid])
            {
                end  = mid-1;
            }
            else
            {
                start = mid +1;
            }
        }

        return flagIndex;
    }
}

