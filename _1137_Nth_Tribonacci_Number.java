// https://leetcode.com/problems/n-th-tribonacci-number/


public class _1137_Nth_Tribonacci_Number {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 37;
        System.out.println(obj.tribonacci(n));
    }
}

class Solution {
    public int tribonacci(int n)
    {
        if(n < 2)
        {
            return n;
        }
        else if(n == 2)
        {
            return 1;
        }
        
        int a = 0;
        int b = 1;
        int sum  = 1;
        n-=2;
        while(n > 0)
        {
            
            int temp = sum;
            sum = a+b+sum;
            a = b;
            b = temp;
            n--;
        }
        return sum;
    }
}
