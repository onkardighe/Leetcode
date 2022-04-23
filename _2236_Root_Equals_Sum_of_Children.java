// https://leetcode.com/problems/root-equals-sum-of-children/

public class _2236_Root_Equals_Sum_of_Children {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.checkTree(new TreeNode()));
        
    }
}


class Solution {
    public boolean checkTree(TreeNode root)
    {
        return root.val == root.left.val+root.right.val;
    }
}