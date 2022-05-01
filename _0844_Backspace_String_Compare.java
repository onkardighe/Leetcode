// https://leetcode.com/problems/backspace-string-compare/

import java.util.*;
public class _0844_Backspace_String_Compare
{
    public static void main(String[] args)
    {

        String s = "bxj##tw";
        String t = "bxo#j##tw";
        System.out.println(backspaceCompare(s, t));
    }


    public static boolean backspaceCompare(String s, String t)
    {
        // check both strings for equality
        return check(s).equals(check(t));    
    }
    
    public static String check(String str)
    {
        Stack<Character> chStack = new Stack<>();


        // add characters into stack
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch == '#' && !chStack.isEmpty())
            {
                chStack.pop();
            }
            else if(ch != '#')
            {
                chStack.addElement(ch);
            }
        }
        return chStack.toString();
    }
}