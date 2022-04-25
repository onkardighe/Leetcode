// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

public class _0019_Remove_Nth_Node_From_End_of_List {
    public static void main(String[] args)
    {
        // Creating Linked List
        int[] arr = {1,2,3,4,5};
        int n  = 5;
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        // 
        Solution obj = new Solution();
        head.print(head);
        head = obj.removeNthFromEnd(head, n);
        head.print(head);

        
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getSize(head);
        
        // only one element
        if(size == 1 && n >= size)
        {
            return null;
        }
        
        // for first element
        if((size - n) < 1)
        {
            head = head.next;
            return head;
        }
        
        ListNode temp = head;
        int i = 1;
        while(i < size-n)
        {
            temp = temp.next;
            i++;
        }
        if(temp != null)
        {
            temp.next = temp.next.next;
        }        
        return head;
    }
    
    public int getSize(ListNode head)
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