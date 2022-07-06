// https://leetcode.com/problems/power-of-three/

public class _0326_Power_of_Three {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(new Solution0326().isPowerOfThree(n));
    }
}


class Solution0326 {
    public boolean isPowerOfThree(int n) {
        long temp = 1;
        while(temp < n)
        {
            temp = temp *3;
        }
        
        return temp==n;
    }
}

