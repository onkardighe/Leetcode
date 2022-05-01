// https://leetcode.com/problems/counting-words-with-a-given-prefix/

import java.util.*;
public class _2255_Count_Prefixes_of_Given_String
{
    public static void main(String[] args)
    {
        String[] arr = {"a","b","c","ab","bc","abc"};
        String pref = "abc";
        
        Solution obj = new Solution();
        System.out.println(obj.countPrefixes(arr, pref));

    }    
}

class Solution {
    public int countPrefixes(String[] words, String s)
    {
        int iCnt = 0;
        for(String str : words)
        {
            if(s.startsWith(str))
            {
                iCnt++;
            }
        }
        return iCnt;    
    }
}
