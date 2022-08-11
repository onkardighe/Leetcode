// https://leetcode.com/problems/number-of-islands/

import java.util.*;
public class _0200_Number_of_Islands {
    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'}, 
            {'1', '1', '1', '1', '0'}, 
            {'1', '1', '0', '0', '1'}, 
            {'0', '0', '0', '0', '0'}, 
        };

        System.out.println(new Solution0200().numIslands(grid));
    }
}




class Solution0200 {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];

        int ansCnt = 0;
        
        
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(grid[i][j] == '1' && !vis[i][j])
                {
                    vis[i][j] = true;
                    bfs(grid,vis,i, j);
                    // System.out.println(grid[i][j]+" : "+i+j);
                    ansCnt++;
                } 
            }
        }
        return ansCnt;
    }
    
    public void bfs(char[][] grid, boolean[][] vis, int i, int j)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(i, j));
        vis[i][j] = true;
        
        while(!q.isEmpty())
        {
            Node curr = q.remove();
            i = curr.i;
            j = curr.j;
            // check for neighbours
            // up
            if(i > 0 && grid[i-1][j] == '1' && !vis[i-1][j])
            {
                q.add(new Node(i-1, j));
                vis[i-1][j] = true;
            }
            
            // down
            if(i < grid.length-1 && grid[i+1][j] == '1' && !vis[i+1][j])
            {
               q.add(new Node(i+1, j)); 
                vis[i+1][j] = true;
            }
            
            // left
            if(j > 0 && grid[i][j-1] == '1' && !vis[i][j-1])
            {
                q.add(new Node(i, j-1)); 
                vis[i][j-1] = true;
            }
            
            // right
            if(j < grid[0].length-1 && grid[i][j+1] == '1' && !vis[i][j+1])
            {
                q.add(new Node(i, j+1)); 
                vis[i][j+1] = true;
            }
        }
    }
}

class Node
{
    int i;
    int j;
    
    Node(int _i, int _j)
    {
        this.i = _i;
        this.j = _j;
    }
}
