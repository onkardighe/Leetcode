// https://leetcode.com/problems/two-sum/


// Optimised  O(N) Time Complexity
// HashMap Used


public class _0001_Two_Sum {
    public static void main(String[] args) 
    {
        int arr[] = {-1,-2,-3,-4,-5};
        int iTarget = -8;

        // int ans[] = twoSum(arr,iTarget);
        int ans[] = twoSumOptimised(arr,iTarget);
        for(int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i]+"\t");
        }

        
        
    }

    // Optimised Function 
    public static int[] twoSumOptimised(int[] arr, int target) {
        
        int[] ans  = {-1, -1};
        HashMap<Integer, Integer> distinctElements = new HashMap<>(); 
        
        for(int i = 0; i < arr.length; i++)
        {
            if(distinctElements.containsKey(target - arr[i]))
            {
                ans[0] = i;
                ans[1] = distinctElements.get(target - arr[i]);
                break;
            }
            else
            {
                distinctElements.put(arr[i], i);
            }
        }
        return ans;
    }

    static int[] twoSum(int arr[], int iTarget)
    {
        int res[] = {0,0};

        for(int i = 0; i < arr.length-1; i++)
        {
            if((arr[i] <= iTarget) && (iTarget >= 0))
            {
                for(int j = i+1; j< arr.length; j++)
                {
                    if(arr[i]+arr[j] == iTarget)
                    {
                        res[0] = i;
                        res[1] = j;
                    }
                }
            }
            else
            {
                for(int j = i+1; j< arr.length; j++)
                {
                    if(arr[i]+arr[j] == iTarget)
                    {
                        res[0] = i;
                        res[1] = j;
                    }
                }
            }
            
        }

        return res;
    }
}
