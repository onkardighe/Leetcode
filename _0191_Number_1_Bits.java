import java.util.Arrays;

public class _0191_Number_1_Bits
{
    public static void main(String[] args) {
        int iNo = 11111111111111111111111111111101;
        System.out.println(hammingWeight(iNo));
    }

    public static int hammingWeight(int iNo)
    {
        int iCnt = 0;
        while(iNo != 0)
        {
            iNo = iNo & iNo-1;
            iCnt++;
        }
        return iCnt;
    }
}