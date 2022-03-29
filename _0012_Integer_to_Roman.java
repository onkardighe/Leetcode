// https://leetcode.com/problems/integer-to-roman/

import java.util.HashMap;

public class _0012_Integer_to_Roman {
    public static void main(String[] args) {
        int number = 96;
        System.out.println(intToRoman(number));
    }
    public static String intToRoman(int num)
    {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");

        String ans = "";
        int Cnt = 1;
        int iDigit;
        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit !=0)
            {
                if(((iDigit*Cnt) % (5*Cnt)) == (4*Cnt))
                {
                    ans = map.get(Cnt) + map.get(Cnt+(iDigit*Cnt)) + ans;
                }
                else if(((iDigit*Cnt) % (5*Cnt)) == Cnt)
                {
                    if(((iDigit*Cnt) % (10*Cnt)) == Cnt)
                    {
                        ans = map.get(Cnt) +ans;
                    }
                    else
                    {
                        ans  = map.get((iDigit*Cnt)-Cnt)+map.get(Cnt) +ans;
                    }
                }
                else if(((iDigit*Cnt) % (5*Cnt)) == 2*Cnt)
                {
                    if(((iDigit*Cnt) % (10*Cnt)) == 2*Cnt)
                    {
                        ans = map.get(Cnt)+map.get(Cnt)+ans;
                    }
                    else
                    {
                        ans  = map.get((iDigit*Cnt)-2*Cnt)+map.get(Cnt)+map.get(Cnt)+ans;
                    }
                }
                else if(((iDigit*Cnt) % (5*Cnt)) == 3*Cnt)
                {
                    if(((iDigit*Cnt) % (10*Cnt)) == 3*Cnt)
                    {
                        ans = map.get(Cnt)+map.get(Cnt)+map.get(Cnt)+ans;
                    }
                    else
                    {
                        ans  = map.get((iDigit*Cnt)-3*Cnt)+map.get(Cnt)+map.get(Cnt)+map.get(Cnt)+ans;
                    }
                }
                else
                {
                    ans  = map.get(iDigit*Cnt)+ans;
                }
            }
            Cnt *= 10;
            num = num / 10;
        }
        return ans;
    }
}
