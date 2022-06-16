// https://leetcode.com/problems/longest-string-chain

import java.util.*;
public class _1048_Longest_String_Chain
{
    public static void main(String[] args) {
        String[] words = {"a","b","ba","bca","bda","bdca"};
        System.out.println(new Solution1048().longestStrChain(words));
    }
}
class Solution1048 {
    HashMap<Integer, List<String>>length;
    HashMap<String, Integer> memo;
    public int longestStrChain(String[] words)
    {
            length = new HashMap<>();
            for(String word : words)
            {
                length.putIfAbsent(word.length(), new ArrayList<>());
                                
                length.get(word.length()).add(word);
            }        
        memo = new HashMap<>();
        int maxLength = 0;
        for(String word : words)
        {
            maxLength = Math.max(maxLength, dfs(word));
        }
        return maxLength;
    }
    
    public int dfs(String word)
    {
        // end case
        if(!length.containsKey(word.length()+1))
        {
            return 1;
        }
    
        // check in memo
        if(memo.containsKey(word))
        {
            return memo.get(word);
        }
        
        // check for all words
        int max = 0;
        List<String> nextWords = length.get(word.length()+1);
        for(String nextWord : nextWords)
        {
            if(wordcheck(word, nextWord))
            {
                max = Math.max(max, dfs(nextWord));
            }
        }    
        // store in memory again
        memo.put(word, max+1);
        return memo.get(word);
    }
    
    public boolean wordcheck(String a, String b)
    {
        int iCnt = 0;
        for(int i = 0, j = 0; i < b.length() && j < a.length() && iCnt <= 1; i++)
        {
            if(a.charAt(j) != b.charAt(i))
            {
                iCnt++;
            }
            else
            {
                j++;
            }
        }
        return iCnt <= 1;
    }
}