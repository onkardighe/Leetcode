import java.util.Arrays;

// https://leetcode.com/problems/first-missing-positive/

public class _0041_First_Missing_Positive {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));

    }

    public static int firstMissingPositive(int[] nums)
    {

        int i = 0, correctIndex; 
        while(i < nums.length)
        {
            correctIndex = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length  && nums[i] != nums[correctIndex])
            {
                swap(nums, i, correctIndex);
            }
            else
            {
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++)
        {
            if(nums[j] != j+1)
            {
                return j+1;
            }
        }
        return nums.length+1;
    }

    public static int swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;   
        return -1;
    }
}
