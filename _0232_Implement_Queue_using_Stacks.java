// https://leetcode.com/problems/implement-queue-using-stacks/

import java.util.*;
public class _0232_Implement_Queue_using_Stacks {
    public static void main(String[] args)
    {
        MyQueue obj = new MyQueue();
        obj.push(1);    
        obj.push(2);     
        // System.out.println(obj.top());
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.empty());

    }
}

class MyQueue {

    Stack<Integer> queue;
    Stack<Integer> temp;
    public MyQueue() {
        queue = new Stack<>();
        temp = new Stack<>();
    }
    
    public void push(int x)
    {
        queue.push(x);
    }
    
    public int pop()
    {

        if(queue.isEmpty())
        {
            return -1;
        }

        while(!queue.isEmpty())
        {
            temp.push(queue.pop());
        }

        int ans = temp.pop();

        while(!temp.isEmpty())
        {
            queue.push(temp.pop());
        }
        return ans;
    }
    
    public int peek()
    {
        if(queue.isEmpty())
        {
            return -1;
        }

        while(!queue.isEmpty())
        {
            temp.push(queue.pop());
        }

        int ans = temp.peek();

        while(!temp.isEmpty())
        {
            queue.push(temp.pop());
        }
        return ans;
    }
    
    public boolean empty() {
        return queue.isEmpty();

    }
}