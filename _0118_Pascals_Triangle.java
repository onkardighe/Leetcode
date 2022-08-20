// https://leetcode.com/problems/pascals-triangle/

import java.util.*;

public class _0118_Pascals_Triangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> ans  = new Solution0118Optimised().generate(numRows);

        for(List<Integer> a : ans)
        {
            System.out.println(a);
        }
    }
}

class Solution0118Optimised {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> pre = null;
        
        for(int i = 0; i < numRows; i++)
        {
            List<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++)
            {
                if(j == 0 || j == i)
                {
                    temp.add(1);
                }
                else
                {
                    temp.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre = temp;
            ans.add(temp);
        }
        
        return ans;
        
        
    }
}

class Solution0118 {
    public List<List<Integer>> generate(int numRows) {
        
        
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        
        for(int i = 1 ; i < numRows; i++)
        {    
            ans.add(new ArrayList());
            for(int j = 0; j <= i; j++)
            {
                List<Integer> curr = ans.get(i);
                if(j == 0)
                {
                    curr.add(ans.get(i-1).get(j));
                }
                else if(j == i)
                {
                    curr.add(ans.get(i-1).get(j-1));
                }
                else
                {
                    curr.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                }
            }
        }
        return ans;
        
    }
}