// https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/

import java.util.*;
public class _1465_Maximum_Area_Piece_Cake_After_Horizontal_Vertical_Cuts {
    public static void main(String[] args) {
        int[] horizontalCuts = {3,1};
        int[] verticalCuts = {1};
        int h = 5;
        int w = 4;
        System.out.println(new Solution1465().maxArea(h, w, horizontalCuts, verticalCuts)); 
    }
}

class Solution1465 {
    
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int mod = 1000000007;
        return (int)((getMaxDist(horizontalCuts, h)*getMaxDist(verticalCuts, w))%mod);
    }
    
    public long getMaxDist(int[] arr, int n)
    {
        // sorting
        Arrays.sort(arr);
        
        long maxDist = 0;
        for(int i = 1; i < arr.length; i++)
        {
            maxDist = Math.max(maxDist, arr[i]-arr[i-1]);
        }
        
        // check for zero 
        maxDist = Math.max(maxDist, arr[0]);
        // check for end case
        maxDist = Math.max(maxDist, n-arr[arr.length-1]);
        return maxDist;
    }
}
