public class _0724_Find_Pivot_Index {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(new Solution0724().pivotIndex(arr));
    }
}

class Solution0724 {
    public int pivotIndex(int[] nums) {
        int[] pre = new int[nums.length];
        pre[0] = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            pre[i] = nums[i] + pre[i-1];
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(i == 0)
            {
                if(pre[nums.length-1]-pre[i] == 0)
                {
                    return 0;
                }
            }
            else if(pre[i-1] == pre[nums.length-1]-pre[i])
            {
                return i;
            }
        }
        return -1;
        
    }
}