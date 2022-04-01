// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

// ShortCut Function check2Digits 

public class _1295_Numbers_with_Even_Digit
{
    public static void main(String[] args) {
        int[] arr = {555,901,482,1771};
        System.out.println(even(arr));
    }


    static int even(int[] arr)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        int count = 0;

        for(int a : arr)
        {
            if(check2Digits(a))
            {
                count++;
            }
        }
        return count;
    }

    static boolean check2Digits(int iNo)
    {
        int iDigit = (int)Math.log10(iNo)+1;

        if(iDigit % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    static boolean checkDigits(int iNo)
    {
        int iDigit = 0;
        while(iNo > 0)
        {
            iDigit++;
            iNo = iNo / 10;
        }

        if(iDigit % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}