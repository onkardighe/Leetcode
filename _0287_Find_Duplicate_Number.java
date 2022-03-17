// https://leetcode.com/problems/find-the-duplicate-number/



public class _0287_Find_Duplicate_Number {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicateElement(arr));
    }


    public static int findDuplicateElement(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correctIndex = arr[i]-1;
            if(arr[i] < arr.length && i != correctIndex)
            {
                if(arr[correctIndex] == arr[i])
                {
                    return arr[correctIndex];
                }
                swap(arr, i, correctIndex);
            }
            else
            {
                i++;
            }
        }
        return i;
    }


    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;   
    }
}
