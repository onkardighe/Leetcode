// https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/


import java.security.Parameters;
import java.util.Arrays;
public class _1337_K_Weakest_Rows_in_Matrix {

    public static void main(String[] args)
    {

        int[][] arr = {
                        {1,1,0,0,0},
                        {1,1,1,1,0},
                        {1,0,0,0,0},
                        {1,1,0,0,0},
                        {1,1,1,1,1},
                    };
        System.out.println(Arrays.toString(kWeakestRows(arr,3)));
    }

    // Driving Function
    public static int[] kWeakestRows(int[][] mat, int k)
    {
        int[] ans  = new int[k];
        

        reValue(mat);
        sort(mat);

        for(int  i = 0; i<k; i++)
        {
            ans[i] = mat[i][1];
        }
        return ans;
    }


    // Sorts 2-D array w.r.t 0th & 1st index
    public static void sort(int[][] arr)
    {
        int max;
        for(int i = 0; i<arr.length; i++)
        {
            max = 0;
            for(int j = 0; j<arr.length-i; j++)
            {

                if(arr[j][0] > arr[max][0])
                {
                    max = j;
                }
                else if(arr[j][0] == arr[max][0])
                {
                    if(arr[j][1] > arr[max][1])
                    {
                        max = j;
                    }
                }
            }
            swap(arr, max, arr.length-1-i, 0);
        }
    }

    // Swap in 2-D Array
    // Parameters : (int[][], First index, Second Index, Index to be swapped)
    public static void swap(int[][] arr, int a, int b, int index)
    {
        int temp0 = arr[a][index];
        int temp1 = arr[a][1];
        
        arr[a][index] = arr[b][index];
        arr[a][1] = arr[b][1];

        arr[b][index] = temp0;
        arr[b][1] = temp1;
    }

    
// Function : changes values in  array
    // arr[i][0] = Total number of 1's present 
    // arr[i][1] = Original index of array
    // rest all elemnts set to 0
    public static void reValue(int[][] mat)
    {
        int sum;
        for(int i = 0; i < mat.length; i++)
        {
            sum = 0;
            for(int j = 0; j < mat[i].length; j++)
            {
                sum+=mat[i][j];
            }
            Arrays.fill(mat[i], 0);
            mat[i][0]= sum;
            mat[i][1] = i;
        }
    }

    // Function is to just print a 2-D array
    public static void print(int[][] arr)
    {
        for(int[] a:arr)
        {
            System.out.println(Arrays.toString(a));
        }
        System.out.println("___________________________________________________");
    }
}

  

