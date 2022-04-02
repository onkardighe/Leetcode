// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/

public class _2108_Find_First_Palindromic_String_Array {
    public static void main(String[] args) {
        String[] strs = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(strs));
    }
    public static String firstPalindrome(String[] words)
    {
        for(String word : words)
        {
            if(checkPalindrome(word))
            {
                return word;
            }
        }
        return "";
    }
    
    public static boolean checkPalindrome(String s)
    {
        int start = 0;
        int end  = s.length()-1;
        
        while(start <= end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

