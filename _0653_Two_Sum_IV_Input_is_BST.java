// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/


import java.util.*;
public class _0653_Two_Sum_IV_Input_is_BST {
    public static void main(String[] args) {

        int k = 9;
        int[] nodes = {5,3,6,2,4,-1,7};

        Solution0653 obj = new Solution0653();
        System.out.println(obj.findTarget(new TreeNode(nodes[0]), k));
        
    }
}

class Solution0653 {
    HashSet<Integer> set;
    public boolean findTarget(TreeNode root, int k)
    {
        set = new HashSet<>();
        return DFS(root, k);
    }
    
    public boolean DFS(TreeNode root, int target)
    {
        if(root == null)
        {
            return false;
        }
        
        if(set.contains(target-root.val))
        {
            return true;
        }
        else
        {
            set.add(root.val);
            return DFS(root.left, target) || DFS(root.right, target);
        }
    }
}