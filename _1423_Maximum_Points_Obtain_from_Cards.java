// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/


import java.util.*;
public class _1423_Maximum_Points_Obtain_from_Cards
{
    public static void main(String[] args) {
        int[] cardPoints = {9,7,7,9,7,7,9};
        int k = 7;
        System.out.println(new Solution1423().maxScore(cardPoints, k));
    }
}

class Solution1423 {
    
    public int maxScore(int[] cardPoints, int k) {

        int iSize = cardPoints.length-k;
        int preSum[] = new int[cardPoints.length]; 
        int totalSum = 0;

        // creating Prefix Sum array
        for(int i = 0; i < cardPoints.length; i++)
        {
            if(i > 0)
            {
                preSum[i] = cardPoints[i] + preSum[i-1];
            }
            else
            {
                preSum[i] =  cardPoints[i];
            }
        }

        // checking for window size
        if(iSize == 0)
        {
            return preSum[preSum.length-1];
        }

        int max = 0;
        for(int i = 0; i <= cardPoints.length - iSize; i++)
        {   
            int start = i;
            int end = i + iSize - 1;
            int sum;
            if(start > 0)
            {
                sum = preSum[end] - preSum[start-1];
            }
            else
            {
                sum = preSum[end];
            }
            max = Math.max(max, preSum[preSum.length-1]-sum);
        }
        return max;
    }
}















//____________________GRAPH DP-MEMOIZATION APPROACH 

// class Solution1423 {
//     int[] memo;
//     public int maxScore(int[] cardPoints, int k) {
//         memo = new int[cardPoints.length];
//         // return Math.max(rec(cardPoints, k, 0, cardPoints.length-1, 0, 0), rec(cardPoints, k, 0, cardPoints.length-1, cardPoints.length-1, 0));
//         return rec(cardPoints, k, 0, cardPoints.length-1, 0);
//     }
    
//     public int rec(int[] arr, int k, int start, int end, int i)
//     {
//         if(k < 1)
//         {
//             return 0;
//         }

//         int s, e;
//         if(memo[i] != 0)
//         {
//             return memo[i];
//         }

//         memo[i] = arr[i] + Math.max(rec(arr, k-1, start+1, end, start+1),  rec(arr, k-1, start, end-1,  end-1));
//         return memo[i];      
//     }
// }





// custom input
// [96,90,41,82,39,74,64,50,30]
// 8