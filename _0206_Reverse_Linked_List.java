// https://leetcode.com/problems/reverse-linked-list/

public class _0206_Reverse_Linked_List {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        if(arr.length == 0)
        {
            return;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        System.out.println("Original :");
        head.print(head);
        
        ListNode rev = new Solution0206().reverseList(head);
        System.out.println("Reversed :");
        head.print(rev);
    }
}

class Solution0206 {
    public ListNode reverseList(ListNode head) {
        ListNode rev = null;
            
        ListNode temp, orig = head;
        
        while(orig != null)
        {
            temp = orig.next;
            orig.next = rev;
            rev = orig;
            orig = temp;
        }
        
        return rev;   
    }
}
