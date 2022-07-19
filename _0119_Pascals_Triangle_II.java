// https://leetcode.com/problems/pascals-triangle-ii/


import java.util.*;
public class _0119_Pascals_Triangle_II {
    public static void main(String[] args) {
        int numRows = 5;
        
        for(List<Integer> a : new Solution0118().generate(numRows))
        {
            System.out.println(a);
        }
    }
}

class Solution0119 {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        
        for(int i = 1 ; i <= rowIndex; i++)
        {    
            ans.add(new ArrayList<Integer>());
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
        return ans.get(rowIndex);
    }
}