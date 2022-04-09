// https://leetcode.com/problems/kth-largest-element-in-a-stream/

// More ooptimised with priority queue

 import java.util.*;

 public class _0703_Kth_Largest_Element_Stream{
     public static void main(String[] args)
     {
        int[] nums = {4, 5, 8, 2};
        int k = 3;
        KthLargest obj = new KthLargest(k, nums);

        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));
        System.out.println(obj.add(4));
    }
}

class KthLargest
{
    public int k;
    public PriorityQueue<Integer> l ;
    public KthLargest(int kth, int[] nums)
    {
        l =  new PriorityQueue<>();
        this.k = kth;  

        for(int a : nums)
        {
            l.add(a);
        }
    }

    public int add(int val)
    {
        l.add(val);

        // Removing unwanted elements 
        // till size becomes k
        while(l.size() > k)
        {
            l.remove();
        }
        
        return l.peek();
    }
}

 /**
  * Your KthLargest object will be instantiated and called as such:
  * KthLargest obj = new KthLargest(k, nums);
  * int param_1 = obj.add(val);
  */
 // 3
 // 4 
 // 5
 // 5
 // 8
 // 8
 // 2 3 4 4 5 5 8 9 10    size = 9 k = 3
 // 0 1 2 3 4 5 6 7 8
