// https://leetcode.com/problems/baseball-game/

import java.util.*;

public class _0682_Baseball_Game {
    public static void main(String[] args) {
        String[] ops  = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));

    }
    public static int calPoints(String[] ops)
    {
        int score = 0;
        Stack<Integer> check = new Stack<>();
        
        for(String str : ops)
        {
            if(str.equals("C"))
            {
                check.pop();
            }
            else if(str.equals("D"))
            {
                check.push(2*check.peek());
            }
            else if(str.equals("+"))
            {
                int temp = check.pop();
                int temp2 = check.peek();
                check.push(temp);
                check.push(temp + temp2);
            }
            else
            {
                check.push(Integer.parseInt(str));
            }  
        }
        while(!check.isEmpty())
        {
            score += check.pop();
        }
        return score;
    }
}

