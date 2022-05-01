// https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/


import java.util.*;
public class _1961_Check_If_String_Is_Prefix_of_Array
{    
    public static void main(String[] args) {

        String s = "iloveleetcode";
        String[] words = {"apples","i","love","leetcode"};
        
        Solution1961 obj = new Solution1961();
        System.out.println(obj.isPrefixString(s, words));
    }
}

class Solution1961 {
    public boolean isPrefixString(String s, String[] words)
    {
        for(String word : words)
        {
            if(s.length() == 0)
            {
                return true; 
            }
            else if(s.startsWith(word))
            {
                System.out.println(word);
                s = s.replaceFirst(word, "");
            }
            else
            {
                break;
            }
        }
        
        System.out.println(s);
        return s.length() == 0? true : false;
    }
}