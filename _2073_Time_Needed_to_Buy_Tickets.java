// https://leetcode.com/problems/time-needed-to-buy-tickets/


public class _2073_Time_Needed_to_Buy_Tickets
{
    public static void main(String[] args) {
        int[] arr = {84,49,5,24,70,77,87,8};
        int k = 3;
        System.out.println(new Solution().timeRequiredToBuy(arr, k));
    }
}

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k)
    {
        int time = 0;
        for(int i = 0; i < tickets.length; i++)
        {
            if(tickets[i] >= tickets[k])
            {
                if(i > k)
                {
                    time += tickets[k]-1;
                }
                else
                {
                    time += tickets[k];
                }
            }
            else
            {
                time += tickets[i];
            }
        }
        return time;
    }
}