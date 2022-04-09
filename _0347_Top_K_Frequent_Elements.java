// https://leetcode.com/problems/top-k-frequent-elements/

import java.util.*;
public class _0347_Top_K_Frequent_Elements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k)
    {
        HashMap<Integer, Integer> hm = new HashMap();
        for(int a : nums)
        {
            if(hm.containsKey(a))
            {
                hm.replace(a, hm.get(a)+1);
            }
            else
            {
                hm.put(a, 1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->hm.get(a)-hm.get(b));

        for(int key : hm.keySet())
        {
            pq.add(key);
        }
        while(pq.size() > k)
        {
            pq.remove();
        }
        
        int[] ans = new int[k];
        int i = 0;
        while(!pq.isEmpty())
        {
            ans[i++] = pq.poll();
        }
        return ans;
    }
}
