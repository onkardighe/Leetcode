// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/



import java.util.Arrays;

public class _1886_Determine_Whether_Matrix_Obtained_Rotation {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] tar = {{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(arr, tar));
    }

    public static boolean findRotation(int[][] mat, int[][] target)
    {
        int cnt = 4;
        while(cnt > 0)
        {
            if(checkEqual(mat, target))
            {
                return true;
            }
            rotate(mat);
            cnt--;
        }
        return false;
    }

    public static boolean checkEqual(int[][] arr, int[][] mat)
    {
        String one  = "";    
        String two  = "";    

        for(int i = 0; i < arr.length; i++)
        {
            one +=Arrays.toString(arr[i]);
            two +=Arrays.toString(mat[i]);
        }

        if(one.equals(two))
        {
            return true;
        }
        else
        {
            return false;
        }
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
