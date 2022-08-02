// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/

import java.util.*;
public class _0378_Kth_Smallest_Element_Sorted_Matrix {
    public static void main(String[] args) {
        int k = 8;
        int[][] matrix = {
                {1,5,9},
                {10,11,13}, 
                {12,13,15}
        };
        System.out.println(new Solution0378().kthSmallest(matrix, k));
    }
}

class Solution0378 {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                arr.add(matrix[i][j]);
            }

        }
        
        
        return arr.get(k-1);

            
    }
}