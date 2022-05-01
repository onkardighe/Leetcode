// https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/

public class _1455_Check_If_Word_Occurs_As_Prefix_of_Any_Word_in_Sentence {
    public static void main(String[] args)
    {
        String arr = "this problem is an easy problem";
        String pref = "pro";
        
        Solution obj = new Solution();
        System.out.println(obj.isPrefixOfWord(arr, pref));

    }  
}

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord)
    {
        String[] words = sentence.split(" ");
        
        
        for(int i = 0; i < words.length; i++)
        {
            if(words[i].startsWith(searchWord))
            {
                return i+1;
            }
        }
        return -1;

    }
}