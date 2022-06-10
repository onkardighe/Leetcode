// https://leetcode.com/problems/surface-area-of-3d-shapes/


import java.util.*;;
public class _0892_Surface_Area_of_3D_Shapes {
    public static void main(String[] args) {
        int[][] grid = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };

        Solution0892 obj = new Solution0892();
        System.out.println(obj.surfaceArea(grid));
    }
}

class Solution0892 {
    public int surfaceArea(int[][] grid)
    {
        int n = grid.length;
        
        // upper and below faces
        int upDawn = 2*(n * n);
        
        if(n == 1)
        {
            return 4*grid[0][0] + upDawn;
        }
        
        int iCnt = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int curr = grid[i][j];
                if(curr == 0)
                {
                    iCnt -= 2;
                    continue;
                }
                // check for corners
                // first row
                else if(i == 0)
                {
                    // upper left corner
                    if(j == 0)
                    {
                        iCnt += (2*(curr) + checkSide(grid, i, j, false, true, false, true));
                    }
                    // upper right corner
                    else if(j == n-1)
                    {
                        iCnt += (2*(curr) + checkSide(grid, i, j, true, false, false, true));
                    }
                    // for upper side middle
                    else
                    {
                        iCnt += curr + checkSide(grid, i, j, true, true, false, true);
                    }
                }
                // last row
                else if(i == n-1)
                {
                    // lower left corner
                    if(j == 0)
                    {
                        iCnt += (2*(curr) + checkSide(grid, i, j, false, true, true, false));
                    }
                    // lower right corner
                    else if(j == n-1)
                    {
                        iCnt += (2*(curr) + checkSide(grid, i, j, true, false, true, false));
                    }
                    // for lower side middle
                    else
                    {
                        iCnt += curr + checkSide(grid, i, j, true, true, true, false);
                    }
                }
                // for left side middle 
                else if(j == 0)
                {
                    iCnt += curr + checkSide(grid, i, j, false, true, true, true);
                }
                // for right side middle
                else if(j == n-1)
                {
                    iCnt += curr + checkSide(grid, i, j, true, false, true, true);
                }
                // check for block covered all sides
                else
                {
                    iCnt += checkSide(grid, i, j, true, true, true, true);
                }
            }
        }
        return upDawn+iCnt;
    }
    
    public int checkSide(int[][] arr, int i ,int j, boolean left, boolean right, boolean up, boolean dawn)
    {
        int curr = arr[i][j];
        int ans = 0;
        if(left)
        {
            int valLeft = arr[i][j-1];
            if(valLeft < curr)
            {
                ans += curr-valLeft;
            }
        }
        
        if(right )
        {
            int valRight = arr[i][j+1];
            if(valRight < curr)
            {
                ans += curr-valRight;
            }
        }
        
        if(up)
        {
            int valUp = arr[i-1][j];
            if(valUp < curr)
            {
                ans += curr-valUp;
            }
        }
        
        if(dawn)
        {
            int valDawn = arr[i+1][j];
            if(valDawn < curr)
            {
                ans += curr-valDawn;
            }
        }
        return ans;
    }
}