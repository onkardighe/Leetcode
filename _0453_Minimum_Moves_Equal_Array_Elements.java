// https://leetcode.com/problems/minimum-moves-to-equal-array-elements/

public class _0453_Minimum_Moves_Equal_Array_Elements {
    public static void main(String[] args) {
        int[] arr = {1,1000000000};
        System.out.println(minMoves(arr));
    }
    public static int minMoves(int[] nums)
    {
        int ans = 0;
        int min = getMin(nums);

        for(int x : nums)
        {
            ans  = ans + x-min;
        }

        return ans;
    }

    public static int getMin(int[] arr)
    {
        int ans = arr[0];

        for(int num : arr)
        {
            if(num < ans)
            {
                ans = num;
            }
        }
        return ans;
    }
}

