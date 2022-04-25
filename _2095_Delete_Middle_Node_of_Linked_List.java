// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

public class _2095_Delete_Middle_Node_of_Linked_List
{
    public static void main(String[] args)
    {
        // Creating Linked List
        int[] arr = {1,2,3,4,5};
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        // 
        Solution obj = new Solution();
        head.print(head);
        head = obj.deleteMiddle(head);
        head.print(head);

        
    }
}
class Solution {
    public ListNode deleteMiddle(ListNode head)
    {
        
         int size = getSize(head);
         // get middle
        int n = (size&1) == 0 ? size/2 : (size/2)+1;
        
         
         // only one element
         if(size == 1 && n >= size)
         {
             return null;
         }
         
         // for first element
         if((size - n) < 1)
         {
             head = head.next;
             return head;
         }
         
         ListNode temp = head;
         int i = 1;
         while(i < size-n)
         {
             temp = temp.next;
             i++;
         }
         if(temp != null)
         {
             temp.next = temp.next.next;
         }        
         return head;
     }
     
     public int getSize(ListNode head)
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