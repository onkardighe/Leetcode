// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

import java.util.*;
public class _0121_Best_Time_Buy_Sell_Stock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(new Solution0121().maxProfit(prices));
    }
}


class Solution0121 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        int todayRevenue = 0;
        
        for(int i = 0; i < prices.length; i++)
        {
            if(minPrice > prices[i])
            {
                minPrice = prices[i];
            }
            
            todayRevenue = prices[i] - minPrice;
            if(todayRevenue > profit)
            {
                profit = todayRevenue;
            }
        }
        return profit;
    }
}