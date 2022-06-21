// https://leetcode.com/problems/n-queens/

import java.util.*;;
public class _0051_N_Queens {
    public static void main(String[] args) {
        int n = 4;
        Solution0051 obj = new Solution0051();
        List<List<String>> ans = obj.solveNQueens(n);
    }
}

class Solution0051 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] arr = new char[n][n];
        for(char[] ch : arr)
        {
            Arrays.fill(ch, '.');
        }
        getQueens(ans, arr, n, 0);
        return ans;
    }
    public void print(char[][] arr)
    {
        for(char[] ch : arr)
        {
            System.out.println(Arrays.toString(ch));
        }
        System.out.println("____________________________");
        
    }
    
    public void getQueens(List<List<String>> ans, char[][] arr, int n, int row)
    {
        if(row == n)
        {
            print(arr);
            List<String> l = new ArrayList<>();
            for(char[] c : arr)
            {
                l.add(Arrays.toString(c).replaceAll("[ ,]", "").replace("[", "").replace("]", ""));
            }
            ans.add(l);
            return;
        }
        
        for(int col = 0 ; col < n; col++)
        {
            if(isSafe(arr, row, col))
            {
                arr[row][col] = 'Q';
                getQueens(ans, arr, n, row+1);
                arr[row][col] = '.';
            }
        }
        return;
    }
    
    public boolean isSafe(char[][] arr, int row, int col)
    {
        // check row
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[row][i] == 'Q')
            {
                return false;
            }
        }
        
        // check columns
        for(int j = 0;  j < arr.length; j++)
        {
            if(arr[j][col] == 'Q')
            {
                return false;
            }
        }
        
        
        // Upper Left Diagonals 
        int rLeft = row;
        int cLeft = col;
        while(rLeft >= 0 && cLeft >= 0)
        {
            if(arr[rLeft][cLeft] == 'Q')
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
            if(arr[rRight][cRight] == 'Q')
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
            if(arr[rLeft][cLeft] == 'Q')
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
            if(arr[rRight][cRight] == 'Q')
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













