// https://leetcode.com/problems/binary-tree-postorder-traversal/


import java.util.*;
public class _0145_Binary_Tree_Postorder_Traversal {
    
}
class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root)
    {
        getPostorder(root);
        return ans;
    }
    
    public void getPostorder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        getPostorder(root.left);
        getPostorder(root.right);
        ans.add(root.val);
     }
}