// https://leetcode.com/problems/linked-list-cycle-ii/

public class _0142_Linked_List_Cycle_II {
    public static void main(String[] args) {
        
    }
}


class Solution0142 {
    public ListNode detectCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        
        while(f != null && f.next != null)
        {
            s = s.next;
            f = f.next.next;
            
            if(f == s)
            {
                
                ListNode t = head;
                while(t != s)
                {
                    t = t.next;
                    s = s.next;
                }
                return s;
            }
            
        }
        return null;  
    }
}