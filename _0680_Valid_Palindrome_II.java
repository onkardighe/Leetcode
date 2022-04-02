// https://leetcode.com/problems/valid-palindrome-ii/submissions/

public class _0680_Valid_Palindrome_II {
    public static void main(String[] args) {
        String str = "ebcbbececabbacecbbcbe";
        System.out.println(validPalindrome(str));
    }
    public static boolean validPalindrome(String s)
    {
        int start = 0;
        int end = s.length()-1;
        boolean removed = true;
        
        while(start <= end && removed)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                removed  = checkPalindrome(s.substring(0, end)+s.substring(end+1, s.length()));
                
                
                if(removed)
                {
                    return removed;
                }
                else
                {
                    removed  = checkPalindrome(s.substring(0, start)+s.substring(start+1, s.length()));
                }
                return removed;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkPalindrome(String s)
    {
        int start = 0;
        int end  = s.length()-1;
        
        while(start < end)
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