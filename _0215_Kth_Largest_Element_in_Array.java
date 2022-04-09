// https://leetcode.com/problems/kth-largest-element-in-an-array/


import java.util.*;
public class _0215_Kth_Largest_Element_in_Array {
    public static void main(String[] args) {
        int[] nums  = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        System.out.println(findKthLargest(nums, k));
    }
    public static int findKthLargest(int[] nums, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int a: nums)
        {
            pq.add(a);
        }
        
        while(pq.size() > k)
        {
            pq.remove();
        }
        return pq.peek();
    }
}