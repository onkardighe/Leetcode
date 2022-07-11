// https://leetcode.com/problems/binary-tree-right-side-view/


import java.util.*;
public class _0199_Binary_Tree_Right_Side_View {
    public static void main(String[] args) {
        int[] nodes = {1,2,3,-1,5,-1,4};
        BinaryTree tree = new BinaryTree();
        TreeNode root  = tree.buildBinaryTree(nodes);

        System.out.println(new Solution0199().rightSideView(root));
    }
}

class Solution0199 {
    int max = 0;
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        dfs(root, 1, ans);
        return ans;  
    }
    
    public void dfs(TreeNode node, int h, List<Integer> ans)
    {
        if(node == null)
        {
            if(h-1 > max)
            {
                max = h;
            }
            return;
        }
        
        // if current Height if greater than maximum height
        if(h > max)
        {
            max = h;
            ans.add(node.val);
        }
        
        dfs(node.right, h+1, ans);
        dfs(node.left, h+1, ans);
    }
}




// class to build a binary Tree
class BinaryTree
{
    private int idx = 0;
    public TreeNode buildBinaryTree(int[] arr)
    {
        if(idx >= arr.length)
        {
            return null;
        }

        int data = arr[idx++];
        if(data == -1)
        {
            return null;
        }
        TreeNode node  = new TreeNode(data);
        node.left = buildBinaryTree(arr);
        node.right = buildBinaryTree(arr);
        return node;
    }
}

