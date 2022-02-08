// https://leetcode.com/problems/add-digits/


public class _0258_Add_Digits {
    public static void main(String[] args) {
        int iNo = 38;

        System.out.println(checkNumber(iNo));


    }

    //  Initial Function
    public static int checkNumber(int iNo)
    {
        if(countDigits(iNo) == 1)
        {
            return iNo;
        }
        else
        {
            return checkNumber(sumDigits(iNo));
        }
        
    }

    // Function to get Sum  of digits
    public static int sumDigits(int iNo)
    {
        int iSum = 0, iDigit = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        return iSum;
    }


    // Function to count number of digits
    public static int countDigits(int iNo)
    {
        int iCnt = 0;

        if(iNo < 10)
        {
            return 1;
        }

        while(iNo != 0)
        {
            iCnt++;
            iNo = iNo / 10;
        }
        return iCnt;
    }
}