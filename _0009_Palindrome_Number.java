// https://leetcode.com/problems/palindrome-number/

public class _0009_Palindrome_Number {
    public static void main(String[] args) {
        int iValue =  -121;
        System.out.println(isPalindrome(iValue));


    }
    static boolean isPalindrome(int iValue)
    {
        int iDigit = 0, iRet = 0, iNo = iValue;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iRet = (iRet*10)+iDigit;
            iNo = iNo / 10;
        }

        if(iValue == iRet)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
