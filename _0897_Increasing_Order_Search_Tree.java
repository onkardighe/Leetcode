//https://leetcode.com/problems/increasing-order-search-tree/


import java.util.*;
public class _0897_Increasing_Order_Search_Tree {
    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.increasingBST(new TreeNode());
    }
}
class Solution {
    private PriorityQueue<Integer> ans  = new PriorityQueue<>();
    private void addQueue(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        ans.add(root.val);
        addQueue(root.left);
        addQueue(root.right);
    }
    public TreeNode increasingBST(TreeNode root)
    {
        addQueue(root);
        TreeNode node = new TreeNode(ans.poll());
        TreeNode temp = node;

        while(!ans.isEmpty())
        {
            temp.right = new TreeNode(ans.poll());
            temp = temp.right;
        }

        temp.right = null;
        return node;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode()
    {

    }
    TreeNode(int val)
    {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}




