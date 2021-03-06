// https://leetcode.com/problems/binary-search-tree-iterator/

public class _0173_Binary_Search_Tree_Iterator
{
    public static void main(String[] args) {
        
        BSTIterator obj = new BSTIterator(new TreeNode());
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


import java.util.*;
class BSTIterator {
    private Queue<Integer> ele;
    private int current;

    public BSTIterator(TreeNode root) 
    {
        ele = new LinkedList<>();
        convert(root);
    }

    
    public int next()
    {
        return this.ele.remove();
    }
    
    public boolean hasNext()
    {
        if(this.ele.size() > 0)
        {
            return true;
        }
        return false;
    }
    
    private void convert(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        
        convert(root.left);
        ele.add(root.val);
        convert(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
