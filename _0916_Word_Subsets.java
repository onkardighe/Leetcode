// https://leetcode.com/problems/word-subsets


import java.util.*;
public class _0916_Word_Subsets {
    public static void main(String[] args) {

        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","o"};
        System.out.println(new Solution0916().wordSubsets(words1, words2));
    }
}


class Solution0916 {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] second = new int[26];
        for(String s : words2)
        {
            int[] temp = new int[26];
            for(char ch : s.toCharArray())
            {
                temp[ch-'a']++;
                second[ch-'a'] = Math.max(temp[ch-'a'], second[ch-'a']);
            }
        }
        
        // check for each word in words1
        for(String word : words1)
        {
            int[] val = new int[26];
            for(char ch : word.toCharArray())
            {
                val[ch-'a']++;
            }
            if(isValid(val, second))
            {
                // System.out.println(word);
                ans.add(word); 
            }
        }        
        return ans;
    }
    
    public boolean isValid(int[] src, int[] target)
    {
        for(int i = 0; i < target.length; i++)
        {
            if(target[i] > src[i])
            {
                return false;
            }
        }
        return true;
    }
}