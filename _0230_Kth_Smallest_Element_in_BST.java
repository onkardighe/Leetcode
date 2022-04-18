// https://leetcode.com/problems/kth-smallest-element-in-a-bst/


import java.util.*;
public class _0230_Kth_Smallest_Element_in_BST
{

}


class Solution {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    
    public int kthSmallest(TreeNode root, int k)
    {   
       createHeap(root);
        int ans = 0;
        while(k != 0)
        {
            ans = heap.poll();
            k--;
        }
        return ans;
    }
    
    
    public void createHeap(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        
        heap.add(root.val);
        createHeap(root.left);
        createHeap(root.right);
     }
}