// https://leetcode.com/problems/power-of-four/

public class _0342_Power_of_Four {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(new Solution0342().isPowerOfFour(n));
    }
}

class Solution0342 {
    public boolean isPowerOfFour(int n) {
        long temp = 1;
        while(temp < n)
        {
            temp = temp *4;
        }
        
        return temp==n;
    }
}