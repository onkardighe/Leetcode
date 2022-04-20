// https://leetcode.com/problems/valid-parentheses/


import java.util.*;
public class _0020_Valid_Parentheses{
    public static void main(String[] args) {
        String str = "([)]";

        Solution obj = new Solution();
        System.out.println(obj.isValid(str));
    }

}

class Solution {
    HashMap<Character, Character>temp;
    Stack<Character> stack = new Stack<>();
    public boolean isValid(String s)
    {
        temp = new HashMap<>();
        temp.put('(',')');
        temp.put('{','}');
        temp.put('[',']');
        
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(temp.containsKey(ch))
            {
                stack.add(temp.get(ch));
            }
            else if(ch == ')' || ch=='}' || ch==']')
            {
                
                if((stack.size() == 0) || ch != stack.pop())
                {
                    return false;
                }
            }
        }
        if(stack.size() == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
        
    }  
}
