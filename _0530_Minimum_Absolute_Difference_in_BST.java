// https://leetcode.com/problems/minimum-absolute-difference-in-bst/

import java.util.*;
public class _0530_Minimum_Absolute_Difference_in_BST {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.getMinimumDifference(new TreeNode()));
    }
}

class Solution {
    PriorityQueue<Integer> pq;
    public int getMinimumDifference(TreeNode root)
    {
        pq = new PriorityQueue<>();
        DFS(root);
        
        int iMin = 100000;
        int curr = pq.poll();
        int temp;
        while(!pq.isEmpty())
        {
            temp = pq.poll();
            if(iMin > temp-curr)
            {
                iMin = temp-curr;
            }
            curr = temp;
        }
        return iMin;
    }
    
    
    // Adding all elements in PriorityQueue
    public void DFS(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        
        pq.add(root.val);
        DFS(root.left);
        DFS(root.right);
    }
}