
import java.util.*;
public class _0890_Find_and_Replace_Pattern {
    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        System.out.println(new Solution0890().findAndReplacePattern(words, pattern));
    }
}


class Solution0890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> ans = new ArrayList<>();
        boolean[] alpha = new boolean[26];
        for(String s : words)
        {
            HashMap<Character, Character> hm = new HashMap<>();
            Arrays.fill(alpha, false);
            boolean match = true;
            if(pattern.length()  != s.length())
            {
                continue;
            }
            
            for(int i = 0; i < s.length(); i++)
            {
                char sC = s.charAt(i);
                char pC = pattern.charAt(i); 
                if(hm.containsKey(pC))
                {
                    if(sC != hm.get(pC))
                    {
                        // System.out.println(s+" : "+i);
                        match = false;
                        break;
                    }
                }
                else
                {
                    if(alpha[sC-'a'])
                    {
                        match = false;
                        break;
                    }
                    alpha[sC-'a'] = true;
                    hm.put(pC, sC);
                }
            }
            
            if(match)
            {
                ans.add(s);
            }
        }
        return ans;
    }
}