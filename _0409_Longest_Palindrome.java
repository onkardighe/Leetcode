
import java.util.*;

public class _0409_Longest_Palindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(new Solution0409().longestPalindrome(s));
    }
    
}

class Solution0409 {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        
        
        int iCnt = 0;
        for(char ch : s.toCharArray())
        {
            if(hs.contains(ch))
            {
                hs.remove(ch);
                iCnt++;
            }
            else 
            {
                hs.add(ch);
            }
        }
        
        if(hs.isEmpty())
        {
            return iCnt*2;
        }
        else
        {
            return (iCnt*2)+1;
        }
        
    }
}