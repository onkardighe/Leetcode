// https://leetcode.com/problems/rotate-image/

import java.util.Arrays;

public class _0048_Rotate_Image {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
        rotate(arr);
        print(arr);
    }
    public static void rotate(int[][] matrix)
    {
        // Transpose of Matrix        
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = i; j < matrix[i].length; j++)
            {
                swap(matrix, i, j, j, i);
            }
        }  
        
        // Making rows reverse in matrix
        int start, end;
        for(int i = 0; i < matrix.length; i++)
        {
            start = 0;
            end = matrix[i].length-1;
            while(start < end)
            {
                swap(matrix[i], start, end);
                start++;
                end--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;    
    }

    public static void swap(int[][] arr, int i, int j, int a, int b)
    {
        int temp = arr[i][j];
        arr[i][j] = arr[a][b];
        arr[a][b] = temp;    
    }

    public static void print(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }    
    }
}
