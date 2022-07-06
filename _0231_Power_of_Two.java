// https://leetcode.com/problems/power-of-two/

public class _0231_Power_of_Two {
    public static void main(String[] args) {
        int n = 1073741825;
        System.out.println(new Solution0231().isPowerOfTwo(n));
    }
}

class Solution0231 {
    public boolean isPowerOfTwo(int n) {
        long temp = 1;
        while(temp < n)
        {
            temp = temp << 1;
        }
        
        return temp==n;
    }
}
