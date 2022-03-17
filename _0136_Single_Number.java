public class _0136_Single_Number {
    public static void main(String[] args) {
        int[] arr = {4 };
        System.out.println(singleNumber(arr));

    }

    public static int singleNumber(int[] arr)
    {
        int ans  = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}