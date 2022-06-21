// https://leetcode.com/problems/n-queens-ii/

import java.util.*;
public class _0052_N_Queens_II {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(new Solution0052().totalNQueens(n));
    }
}


class Solution0052 {
    int iCnt;
    public int totalNQueens(int n) {
        iCnt = 0;
        boolean[][] arr = new boolean[n][n];
        for(boolean[] ch : arr)
        {
            Arrays.fill(ch, false);
        }
        getQueens(arr, n, 0);
        return iCnt;
    }
    public void getQueens(boolean[][] arr, int n, int row)
    {
        if(row == n)
        {
            iCnt++;
            return;
        }
        
        for(int col = 0 ; col < n; col++)
        {
            if(isSafe(arr, row, col))
            {
                arr[row][col] = true;
                getQueens(arr, n, row+1);
                arr[row][col] = false;
            }
        }
        return;
    }
    public boolean isSafe(boolean[][] arr, int row, int col)
    {
        // check row
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[row][i])
            {
                return false;
            }
        }
        
        // check columns
        for(int j = 0;  j < arr.length; j++)
        {
            if(arr[j][col])
            {
                return false;
            }
        }
        
        
        // Upper Left Diagonals 
        int rLeft = row;
        int cLeft = col;
        while(rLeft >= 0 && cLeft >= 0)
        {
            if(arr[rLeft][cLeft])
            {
                return false;   
            }
            rLeft--;
            cLeft--;
        }
        
        // check Uppper Right diagonals
        int rRight = row;
        int cRight = col;
        while(rRight >= 0 && cRight < arr.length)
        {
            if(arr[rRight][cRight])
            {
                return false;   
            }
            rRight--;
            cRight++;
        }

        
        // check Lower Left diagonals
        rLeft = row;
        cLeft = col;
        while(rLeft > arr.length && cLeft >= 0)
        {
            if(arr[rLeft][cLeft])
            {
                return false;   
            }
            rLeft++;
            cLeft--;
        }
        
        // check Lower Right diagonals
        rRight = row;
        cRight = col;
        while(rRight > arr.length && cRight < arr.length)
        {
            if(arr[rRight][cRight])
            {
                return false;   
            }
            rRight++;
            cRight++;
        }
        
        // Queen is safe
        return true;
    }
}