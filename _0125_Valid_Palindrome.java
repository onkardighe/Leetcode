// https://leetcode.com/problems/valid-palindrome


public class _0125_Valid_Palindrome {
    public static void main(String[] args)
    {
        String str = "00P00";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s)
    {
        s = s.replace(" ", "").trim();

        for(int i = 0 ; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if((ch < 'a' || ch > 'z') && (ch < '0' || ch > '9'))
            {
                if(ch >= 'A' && ch <= 'Z')
                {
                    s = s.replace(ch, (char)(ch+32));
                }
                else 
                {
                    String c = ch+"";
                    s = s.replace(c,"");
                    i--;
                }
            }
        }
        return checkPalindrome(s);
    }

    public static boolean checkPalindrome(String str)
    {
        int start = 0; 
        int end = str.length()-1;
        while(start <= end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }   
        return true; 
    }
}
