// https://leetcode.com/problems/course-schedule/

import java.util.*;
public class _0207_Course_Schedule {
    public static void main(String[] args) {
        int[][] prerequisites = {{1,0},{0,1}};
        int numCourses = 2;
        System.out.println(new Solution0207().canFinish(numCourses, prerequisites));
    }
}

class Graph extends ArrayList<ArrayList<Integer>>
{
    public Graph(int vertex)
    {
        for(int i = 0; i < vertex; i++)
        {
            this.add(new ArrayList<Integer>());
        }
    }
    
    public void addEdge(int src, int dest)
    {
        this.get(src).add(dest);
    }
}

class Solution0207 {
    public boolean canFinish(int numCourses, int[][] prerequisites){
        Graph graph = new Graph(numCourses);
        
        for(int i = 0; i < prerequisites.length; i++)
        {
            graph.addEdge(prerequisites[i][0], prerequisites[i][1]);
        }
        
        
        
        
        boolean[] vis = new boolean[numCourses+1];
        boolean[] currStack = new  boolean[numCourses+1];
        for(int i = 0;  i < numCourses; i++)
        {
            if(!vis[i])
            {
                if(detectCycle(graph, vis, currStack, i))
                {
                    return false;
                }
            }
        }
        return true;
        
    }
    
    
    private boolean detectCycle(ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] currStack, int curr)
    {
        vis[curr] = true;
        currStack[curr] = true;
     
        for(Integer nb : adj.get(curr))
        {
            if(!vis[nb])
            {
                currStack[nb] = true;
                if(detectCycle(adj, vis, currStack, nb))
                {
                    return true;
                }
            }
            else if(currStack[nb])
            {
                return true;
            }
            
        }
        currStack[curr] = false;
        return false;
        
    }
}





















