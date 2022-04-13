// https://leetcode.com/problems/minimum-bit-flips-to-convert-number/

public class _2220_Minimum_Bit_Flips_to_Convert_Number {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int start = 3;
        int goal = 4;
        System.out.println(obj.minBitFlips(start, goal));
    }
    
}

class Solution {
    public int minBitFlips(int start, int goal)
    {
        int iCnt = 0;
        while((start != 0) || (goal != 0))
        {
            if(!(((start & 1) == 0 && (goal & 1) == 0) || ((start & 1) != 0 && (goal & 1) != 0)))
            {
                iCnt++;
            }

            start = start>>1;
            goal = goal >> 1;
        }
        return iCnt;
    }
}

// Halving both numbers
// 1010
// 0111

// 101
// 011

// 10
// 01

// 1
// 0