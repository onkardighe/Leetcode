// https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/


import java.util.*;
public class _1689_Partitioning_Minimum_Number_of_Deci_Binary_Numbers
{
    public static void main(String[] args) {
        String n = "27346209830709182346";
        System.out.println(new Solution1689().minPartitions(n));
    }
}


// Simply return maximum digit in that number
class Solution1689 {
    public int minPartitions(String n)
    {
        char max = '0';
        for(int i = 0; i < n.length() && max != 9; i++)
        {
            if(n.charAt(i) > max)
            {
                max = n.charAt(i);
            }
        }
        return max-'0';
    }
}   
    
    
// 8 2 7 3 4

// 1 1 1 1 1,
// 1 1 1 1 1,
// 1 0 1 1 1,
// 1 0 1 0 1,
// 1 0 1 0 0,
// 1 0 1 0 0,
// 1 0 1 0 0,
// 1 0 0 0 0


