// https://leetcode.com/problems/remove-linked-list-elements/

public class _0203_Remove_Linked_List_Elements {
    public static void main(String[] args)
    {
        // Creating Linked List
        int[] arr = {1,2,6,3,4,5,6};
        int n = 1;
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        Solution obj = new Solution();
        head.print(head);
        head = obj.removeElements(head, n);
        head.print(head);
    }
}


class Solution {
    public ListNode removeElements(ListNode head, int val)
    {
        ListNode temp = head;
        ListNode prev = null;
        
        while(temp != null)
        {
            // First element
            if(prev == null && temp.val == val)
            {
                head = temp.next;
                temp = temp.next;
            }
            else if(temp.val == val)
            {
                prev.next = temp.next;
                temp = temp.next;
            }
            else
            {
                prev = temp;
                temp = temp.next;
            } 
        }
        return head;
    }
}