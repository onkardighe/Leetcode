// https://leetcode.com/problems/longest-consecutive-sequence/


import java.util.*;
public class _0128_Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(new Solution0128().longestConsecutive(nums));
    }
}

class Solution0128 {
    public int longestConsecutive(int[] nums)
    {
        if(nums.length < 2)
        {
            return nums.length;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int a : nums)
        {
            pq.add(a);
        }
        
        int max = 1;
        int tempMax = 1;
        int prev = pq.remove();
        while(!pq.isEmpty())
        {
            int curr = pq.remove();
            if(curr == prev + 1)
            {
                tempMax++;
            }
            else if(prev != curr)
            {
                max = Math.max(max, tempMax);
                tempMax = 1;
            }
            prev = curr;
        }
        return max = Math.max(max, tempMax);
    }
}