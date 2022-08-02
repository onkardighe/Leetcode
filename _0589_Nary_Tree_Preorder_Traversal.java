// https://leetcode.com/problems/n-ary-tree-preorder-traversal/


import java.util.*;
public class _0589_Nary_Tree_Preorder_Traversal {
    public static void main(String[] args) {
        
    }

}

class Solution0589 {
    public List<Integer> preorder(Node root) {
         List<Integer> ans = new ArrayList<Integer>();
        dfs(root, ans);
        return ans;
    }
    
    public void dfs(Node curr,List<Integer> ans)
    {
        if(curr == null)
        {
            return;
        }
        
        ans.add(curr.val);
        for(Node nb : curr.children)
        {
            dfs(nb, ans);
        }
    }
}
