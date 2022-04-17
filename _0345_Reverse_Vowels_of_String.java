// https://leetcode.com/problems/reverse-vowels-of-a-string/


import java.util.*;
public class _0345_Reverse_Vowels_of_String {
    public static void main(String[] args) {

        String s = "leetcode";
        
        Solution obj = new Solution();
        System.out.println(obj.reverseVowels(s));
    }
}

class Solution {
    public String reverseVowels(String s) {
        List<Character> charArr = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||ch == 'O' || ch == 'U')
            {
                charArr.add(ch);
            }
        }
        
        StringBuilder str = new StringBuilder(s);
        int iCnt = charArr.size()-1;
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||ch == 'O' || ch == 'U')
            {
                str.replace(i,i+1, Character.toString(charArr.get(iCnt)));
                iCnt--;
            }
        }
        return str.toString();
        
    }
}

