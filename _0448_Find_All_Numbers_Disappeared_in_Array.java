import java.util.*;
public class _0448_Find_All_Numbers_Disappeared_in_Array {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,7,2,3,1};
        System.out.println(findDisappearedNumbers(arr));

    }

    public static  List<Integer> findDisappearedNumbers(int[] nums)
    {
        List<Integer> ans  = new ArrayList<>();
        int i = 0;
        while(i < nums.length)
        {
            int correctIndex = nums[i]-1;
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
            if(j != nums[j]-1)
            {
                ans.add(j+1);
            }
        }
        return ans;
    }

    public static int swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;   
        return -1;
    }
}
