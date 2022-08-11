// https://leetcode.com/problems/middle-of-the-linked-list/


public class _0876_Middle_of_Linked_List
{
    public static void main(String[] args) {
        // Creating Linked List
        int[] arr = {1,2,3,4,5};
        ListNode head = createLinkedList(arr);
        head.print(head);       // Oroginal 
        head = new Solution876Optimised().middleNode(head);
        head.print(head);       // Middle
        
    }

    private static ListNode createLinkedList(int[] arr)
    {
        
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }
}

class Solution876Optimised {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
        
    }
}
class Solution876 {
    public ListNode middleNode(ListNode head)
    {
        int size = getSize(head);
        int mid = (size/2)+1;
        
        while(mid != 1)
        {
            mid--;
            head = head.next;
        }
        return head;
        
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