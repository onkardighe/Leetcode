public class _0234_Palindrome_Linked_List {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 5, 4, 6, 1};
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;

        }

        System.out.println("Original Linked List \t");
        head.print(head);
        System.out.println(new Solution0234().isPalindrome(head));
    }
}

class Solution0234 {
    public boolean isPalindrome(ListNode head) {
        
        if(head.next == null) return true;
            
        
        // 1. find middle of linked list
        ListNode slow = head, fast = head, prev, temp;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow)
            {
                break;
            }
        }
        
        prev = slow;
        slow = slow.next;
        prev.next = null;
                
        // 2. reverse ll from middle + 1
        while(slow != null)
        {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        
        // check for head= temp and prev
        temp = head;
        
        
        while(prev != null)
        {
            if(temp.val != prev.val)
            {
                return false;
            }
            
            temp = temp.next;
            prev = prev.next;
        }
        
        return true;
        
        
    }
}

