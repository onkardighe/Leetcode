// https://leetcode.com/problems/find-smallest-letter-greater-than-target/


public class _0744_Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) 
    {
        char[] cArr = {'c','f','j'};
        char target  = 'k';

        System.out.println(ceilingOfElement(cArr,target));
    }


    // Function to check ceiling 
    public static char ceilingOfElement(char[] arr, char target)
    {
        if(target >= arr[arr.length-1])
        {
            return arr[0];
        }

        int iStart = 0, iEnd = arr.length-1, iMid = -1;

        while(iStart <= iEnd)
        {
            iMid = iStart + (iEnd-iStart)/2;
            if(target < arr[iMid])
            {
                iEnd = iMid -1;
            }
            else
            {
                iStart = iMid+1;
            }
        }        
        return arr[iStart];
    }
}