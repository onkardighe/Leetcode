// https://leetcode.com/problems/set-matrix-zeroes/

import java.util.*;
public class _0073_Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] arr = {
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };
    
        Solution0073 obj = new Solution0073();
        obj.setZeroes(arr);

        obj.print(arr);
    }

}


class Solution0073 {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] ans = new int[m][n];
        
        boolean[] tempR = new boolean[m];
        boolean[] tempC = new boolean[n];
        
        
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(matrix[i][j] == 0)
                {
                    tempR[i] = true;
                    tempC[j] = true;
                }
            }
        }
        
        // check for rows
        for(int i = 0; i < m; i++)
        {
            if(tempR[i])
            {
                setRowZero(matrix, i);
            }
        }
        
        // check for columns
        for(int i = 0; i < n; i++)
        {
            if(tempC[i])
            {
                setColZero(matrix, i);
            }
        }
    }

    public void setRowZero(int[][] arr, int row)
    {
        
        // iterating horizontally
        for(int i = 0; i < arr[0].length; i++)
        {
            arr[row][i] = 0;
        }
    }
    
    public void setColZero(int[][] arr, int col)
    {
        // iterating vertically
        for(int i = 0; i < arr.length; i++)
        {
            arr[i][col] = 0;
        }
        
    }
    
    public void print(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("________________________________");
    }
}