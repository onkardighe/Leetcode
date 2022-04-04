
// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/submissions/

 class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) 
      { 
           this.val = val; 
     }
     ListNode(int val, ListNode next) 
       { 
            this.val = val; this.next = next; 
       }
 }
 
public class _1721_Swapping_Nodes_Linked_List {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public ListNode swapNodes(ListNode head, int k) 
    {
        ListNode temp = head;
        int len = 0;
        while(temp != null)
        {
            len ++;
            temp = temp.next;
        }
        
        temp = head;
        int i = 0;
        ListNode first= head, last= head;
        while(temp != null)
        {
            i++;
            if(i == k)
            {
                first = temp;
            }
            if(i == len-k+1)
            {
                last = temp;
            }
            temp = temp.next;
        }
        swap(head, first, last);
        return head;
    }
    
    public void swap(ListNode head, ListNode a, ListNode b)
    {
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }
}


