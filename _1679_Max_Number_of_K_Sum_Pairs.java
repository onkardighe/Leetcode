// https://leetcode.com/problems/max-number-of-k-sum-pairs/


import java.util.*;
public class _1679_Max_Number_of_K_Sum_Pairs
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 5;
        System.out.println(new Solution().maxOperations(arr, k));
    }

}

class Solution {
    public static int maxOperations(int[] nums, int k)
    {

        HashMap<Integer, Integer>  hs = new HashMap<>();
        int iCnt = 0;
        for(int a : nums)
        {
            if(hs.containsKey(k-a))
            {
                int value = hs.get(k-a);
                if(value <= 1)
                {
                    hs.remove(k-a);
                }
                else 
                {
                    hs.replace(k-a, value-1);
                }
                iCnt++;
            }
            else if(a < k)
            {
                if(hs.containsKey(a))
                {
                    hs.replace(a, hs.get(a)+1);
                }
                else
                {
                    hs.put(a, 1);
                }
            }
        }
        return iCnt;  
    }
}