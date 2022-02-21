import java.lang.*;
import java.util.*;

class _0217_contains_Duplicate
{
    public static void main(String[] args)
    {

        int arr[] = {1,1,1,3,3,4,3,2,4,2};


        boolean bRet = checkDuplicate(arr);

        if(bRet)
        {
            System.out.println("No Duplicate !");
        }
        else
        {
            System.out.println("Duplicate Found!");
        }


    }

    static boolean checkDuplicate(int[] arr)
    {

        HashSet hobj = new HashSet();

        for(int i : arr)
        {
            if(hobj.contains(i))
            {
                return false;
            }
            else
            {
                hobj.add(i);
            }
        }
        return true;
    }
}