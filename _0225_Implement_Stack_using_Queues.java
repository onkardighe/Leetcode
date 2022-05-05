// https://leetcode.com/problems/implement-stack-using-queues/


import java.util.*;
public class _0225_Implement_Stack_using_Queues {
    public static void main(String[] args)
    {
        MyStack obj = new MyStack();
        obj.push(1);    
        obj.push(2);    
        obj.push(3);    
        // System.out.println(obj.top());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.empty());

    }
}


class MyStack
{
    Queue<Integer> stack;
    Queue<Integer> temp;
    private int top;
    
    public MyStack()
    {
        top = -1;
        stack = new LinkedList<>();
        temp = new LinkedList<>();
    }
    
    public void push(int x)
    {
        if(top == -1)
        {
            top = x;
        }
        else
        {
            stack.add(top);
            top = x;
        }
    }
    
    public int pop()
    {
        int ans = top;
        if(stack.isEmpty())
        {
            top = -1;
        }
        else
        {
            while(stack.size() > 1)
            {
                temp.add(stack.poll());
            }
            top = stack.poll();
            
            while(!temp.isEmpty())
            {
                stack.add(temp.poll());
            }
        }
        return ans;
    }
    
    public int top()
    {
        return top;
    }
    
    public boolean empty()
    {
        if(top == -1)
        {
            return true;
        }
        return false;
    }
}
