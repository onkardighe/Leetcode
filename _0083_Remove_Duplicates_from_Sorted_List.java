// https://leetcode.com/problems/remove-duplicates-from-sorted-list/


public class _0083_Remove_Duplicates_from_Sorted_List {
    public static void main(String[] args)
    {
        ListNode obj = new ListNode();

    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head)
    {
        ListNode temp = head;
        while(temp != null)
        {
            if(temp.next == null)
            {
                break;
            }
            // Condition to check whether next element is same as current element or NOT
            if(temp.val == temp.next.val)
            {
                temp.next = temp.next.next;
            }
            else
            {
                temp = temp.next;
            }
        }
        return head;
    }
}


// Definition for Singly Linked List
class ListNode
{
    int val;
    ListNode next;
    ListNode()
    {

    }
    ListNode(int val)
    {
        this.val = val; 
    }
    ListNode(int val, ListNode next)
    {
        this.val = val; this.next = next; 
    }
}