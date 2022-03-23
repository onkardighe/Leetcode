
import java.util.*;
public class _0645_Set_Mismatch
{
    public static void main(String[] args) 
    {
        int[] arr = {1};
        System.out.println(Arrays.toString(findErrorNums(arr)));

        
    }
    public static  int[] findErrorNums(int[] nums) 
    {
        int i = 0;
        int correctIndex;
        int[] ans = new int[2];
        while(i < nums.length)
        {
            correctIndex = nums[i]-1;

            if(nums[i] != nums[correctIndex])
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
                ans[0] = nums[j];
                ans[1] = j+1;
            }
        }

        return ans;

        
    }

    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;   
    }
}




    