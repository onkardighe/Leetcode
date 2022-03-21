import java.util.Arrays;

public class _0338_Counting_Bits
{
    public static void main(String[] args) {
        int iNo = 5;
        System.out.println(Arrays.toString(countBits(iNo)));
    }

    public static int[] countBits(int iNo)
    {
        int[] ans  = new int[iNo+1];
        int bin;
        for(int i = 0; i <= iNo; i++)
        {   
            bin = i;
            while(bin!=0)
            {
                bin  = bin & bin-1;
                ans[i]++;
            }
        }
        return ans;
    }
}