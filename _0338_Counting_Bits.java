// https://leetcode.com/problems/counting-bits/

import java.util.Arrays;

public class _0338_Counting_Bits
{
    public static void main(String[] args) {
        int iNo = 5;
        System.out.println(Arrays.toString(countBits(iNo)));
    }



    // UPDATED Solution O(n)
    public static int[] countBits(int iNo)
    {
        int[] ans  = new int[iNo+1];
        ans[0] = 0;

        for(int i = 1; i <= iNo; i++)
        {
            if((i & 1) == 0)
            {
                ans[i] = ans[i>>1];
            }
            else
            {
                ans[i] = ans[i>>1]+1;
            }
        }
        return ans;
    }


    // PREVIOUS Solution O(n^2)
    public static int[] oldCountBits(int iNo)
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
