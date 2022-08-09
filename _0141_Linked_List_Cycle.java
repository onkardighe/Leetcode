// https://leetcode.com/problems/linked-list-cycle/

public class _0141_Linked_List_Cycle {
    
}

class Solution0141 {
    public boolean hasCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }
}
