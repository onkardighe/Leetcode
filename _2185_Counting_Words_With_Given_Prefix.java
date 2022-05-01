// https://leetcode.com/problems/counting-words-with-a-given-prefix/

import java.util.*;
public class _2185_Counting_Words_With_Given_Prefix
{
    public static void main(String[] args)
    {
        String[] arr = {"pay","attention","practice","attend"};
        String pref = "at";
        
        Solution obj = new Solution();
        System.out.println(obj.prefixCount(arr, pref));

    }    
}

class Solution {
    public int prefixCount(String[] words, String pref)
    {
        int iCnt = 0;
        for(String str : words)
        {
            if(str.startsWith(pref))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}
