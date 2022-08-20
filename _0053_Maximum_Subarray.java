public class _0053_Maximum_Subarray {
    public static void main(String[] args) {
        
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new Solution0053().maxSubArray(nums));
    }
}

class Solution0053 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            
            max = Math.max(max, sum);
            
            if(sum < 0)
            {
                 sum = 0;
            }
        }
        return max;
        
    }
}