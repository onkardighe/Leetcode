// https://leetcode.com/problems/roman-to-integer/submissions/


import java.util.HashMap;
public class _0013_Roman_to_Integer {
    public static void main(String[] args) {
        String roman = "MMMCMXCIX";
        System.out.println(romanToInt(roman));

    }
    public static int romanToInt(String str)
    {
        int i = str.length()-1;
        int ans = 0;
        HashMap<String, Integer> romanNo = new HashMap<>();
        romanNo.put("I", 1);
        romanNo.put("V", 5);
        romanNo.put("X", 10);
        romanNo.put("L", 50);
        romanNo.put("C", 100);
        romanNo.put("D", 500);
        romanNo.put("M", 1000);


        while(i >=0)
        {
            int number = romanNo.get(""+str.charAt(i));
            if(i > 0)
            {
                int prevNumber = romanNo.get(""+str.charAt(i-1));
                if( number > prevNumber)
                {
                   ans-=prevNumber;
                   i--;
                }
                ans+=number;
            }
            else
            {
                ans+=number;
            }
            i--;

        }    
        return ans;
    }
}
