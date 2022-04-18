// https://leetcode.com/problems/binary-tree-preorder-traversal/


import java.util.*;
public class _0144_Binary_Tree_Preorder_Traversal
{
    
}


class Solution
{
    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root)
    {
        getPreorder(root);
        return ans;
    }
    
    public void getPreorder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        ans.add(root.val);
        getPreorder(root.left);
        getPreorder(root.right);
     }
}