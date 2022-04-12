// https://leetcode.com/problems/boats-to-save-people/

import java.util.*;
public class _0881_Boats_Save_People
{
    public static void main(String[] args) 
    {
        int[] arr = {3,2,2,1};
        int limit = 5;

        System.out.println(numRescueBoats(arr, limit));
        System.out.println(Arrays.toString(arr));

    }    

    public static int numRescueBoats(int[] arr, int limit)
    {
        // Sorting 
        Arrays.sort(arr);
        
        // Two pointers Method
        int iStart = 0, iEnd = arr.length-1,iSum = 0, boats = 0;
        while(iStart <= iEnd)
        {
            iSum  = arr[iStart]+arr[iEnd];
            if(iSum <= limit)
            {
                boats++;
                iStart++;
                iEnd--;
            }
            else
            {
                boats++; 
                iEnd--;
            }
        }

        return boats; 
    }

}
