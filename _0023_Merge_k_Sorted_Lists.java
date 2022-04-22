// https://leetcode.com/problems/merge-k-sorted-lists/

import java.util.*;
public class _0023_Merge_k_Sorted_Lists {
    public static void main(String[] args) {
        
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // converting into Priority Queue
        for(ListNode a : lists)
        {
            while(a != null)
            {
                pq.add(a.val);
                a = a.next;
            }
        }
        
        // Converting back to Linked List
        ListNode ans = new ListNode();
        if(pq.size() == 0)
        {
            return null;
        }
        else
        {
            ans.val = pq.poll();
            ListNode temp = ans;
            while(pq.size() != 0)
            {
                temp.next = new ListNode(pq.poll());
                temp = temp.next;
            }
            return ans;
        } 
    }
}