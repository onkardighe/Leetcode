// https://leetcode.com/problems/binary-tree-inorder-traversal/


import java.util.*;
public class _0094_Binary_Tree_Inorder_Traversal
{
    public static void main(String[] args) {
        
    }
}

class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root)
    {
        getInorder(root);
        return ans;
    }
    
    public void getInorder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        
        getInorder(root.left);
        ans.add(root.val);
        getInorder(root.right);
     }
}