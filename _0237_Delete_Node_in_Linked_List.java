// https://leetcode.com/problems/delete-node-in-a-linked-list/


public class _0237_Delete_Node_in_Linked_List {
    public static void main(String[] args) {
        // Creating Linked List
        int[] arr = {4,5,1,9};
        int n = 5;
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        temp = head;
        while(temp.val != n)
        {
            temp = temp.next;
        }

        Solution obj = new Solution();
        head.print(head);
        obj.deleteNode(temp);
        head.print(head);
    }
}

class Solution {
    public void deleteNode(ListNode node)
    {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}


