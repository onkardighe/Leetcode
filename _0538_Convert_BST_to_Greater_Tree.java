// https://leetcode.com/problems/convert-bst-to-greater-tree/

public class _0538_Convert_BST_to_Greater_Tree
{
    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.convertBST(new TreeNode());

    }
}

class Solution {
    public TreeNode convertBST(TreeNode root) {
        DFSConvert(root, 0);
        return root;
    }
    
    public void DFSConvert(TreeNode root, int sumParent)
    {
        if(root == null)
        {
            return;
        }
        
        // Changing value
        root.val = root.val + getSum(root.right) + sumParent;
        if(root.left != null)
        {
            DFSConvert(root.left, root.val);
        }
        
        if(root.right != null)
        {
            DFSConvert(root.right, sumParent);    
        }
            
    }
    
    
    // Simply returns sum of given tree
    public int getSum(TreeNode root)
    {
        if(root == null)
        {
         return 0;   
        }
        
        return root.val + getSum(root.left) + getSum(root.right);
    }
}