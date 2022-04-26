// https://leetcode.com/problems/reorder-list/

import java.util.*;
public class _0143_Reorder_List {
    public static void main(String[] args)
    {
        // Creating Linked List
        int[] arr = {1,2,3,4,5,6,7};
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        Solution obj = new Solution();
        head.print(head);
        obj.reorderList(head);
        head.print(head);    
    }
}

class Solution {
    public void reorderList(ListNode head)
    {
        int size = getSize(head);
        int half = size/2;
        Stack<ListNode> rev = new Stack<>();
        
        // Add half values to stack
        ListNode temp = head;
        while(temp != null)
        {
            if(((size&1) == 0) && half <= 1)
            {
                ListNode a = temp;
                temp = temp.next;
                a.next = null;
                rev.add(a);
            }
            else if(((size&1) != 0) && half <= 0)
            {
                ListNode a = temp;
                temp = temp.next;
                a.next = null;
                rev.add(a);
            }
            else 
            {
                half--;
                temp = temp.next;
            }
        }
        
        temp = head;
        while(!rev.isEmpty() && temp != null)
        {   
            ListNode current = rev.pop();
            if(temp.equals(current))
            {
                temp.next = null;
                break;
            }
            current.next = temp.next;
            temp.next = current;
            temp = current.next;
        }        
    }
    
    private int getSize(ListNode head)
    {
        int ans = 0;
        while(head != null)
        {
            ans++;
            head = head.next;
        }
        return ans;
    }   
}

