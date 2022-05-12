// https://leetcode.com/problems/permutations-ii/

import java.util.*;;
public class _0047_Permutations_II
{
    public static void main(String[] args)
    {
        int[] nums  = {1,1,2};
        Solutionperm obj = new Solutionperm();
        obj.permuteUnique(nums);
        System.out.println(obj.permuteUnique(nums));
    }
}

class Solutionperm {
    List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums)
    {
        ans = new ArrayList<>();
        recursion(nums, 0);    
        return ans;
    }

    public void recursion(int[] arr, int a)
    {
        if(a >= arr.length)
        {
            List<Integer> z = new ArrayList<>();
            for(int x : arr)
            {
                z.add(x);
            }

            // check for duplicates
            if(!ans.contains(z))
            {
                ans.add(z);
            }
            return;
        }

        for(int i = a; i < arr.length; i++)
        {
            swap(arr, a, i);
            recursion(arr, a+1);
            swap(arr, a, i);
            
        }
    }
    public void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }  
}