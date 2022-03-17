// https://leetcode.com/problems/missing-number/

public class _0268_missing_number {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(getMissingElement(arr));
    }


    public static int getMissingElement(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int corectIndex = arr[i];
            if(arr[i] < arr.length && i != corectIndex)
            {
                swap(arr, i, corectIndex);
            }
            else
            {
                i++;
            }
        }

        for(int j = 0;  j<arr.length; j++)
        {
            if(arr[j] !=j)
            {
                i = j;
                break;
            }
        }
        return i;
        
    }


    public static int swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;   
        return -1;
    }
}
