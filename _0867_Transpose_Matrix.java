// https://leetcode.com/problems/transpose-matrix/

import java.util.Arrays;
public class _0867_Transpose_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        Solution0887 obj = new Solution0887();
        int[][] ans = obj.transpose(arr);
        for(int i = 0; i < ans.length; i++)
        {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}

class Solution0887 {
    public int[][] transpose(int[][] matrix)
    {
        
        int[][] ans  = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
