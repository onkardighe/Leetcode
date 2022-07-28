// https://leetcode.com/problems/valid-anagram/

public class _0242_Valid_Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(new Solution0242().isAnagram(s, t));
    }
}


class Solution0242 {
    public boolean isAnagram(String s, String t) {

        // filter
        if(s.length() != t.length())
        {
            return false;
        }
        
        int[] a = new int[26];
        int[] b = new int[26];
        
        
        for(int i = 0; i < s.length(); i++)
        {
            
            a[s.charAt(i)-'a']++;
            b[t.charAt(i)-'a']++;
        }
        
        for(int i = 0; i < 26; i++)
        {
            if(a[i] != b[i])
            {
                return false;
            }
        }
        
        return true;
        
    }
}