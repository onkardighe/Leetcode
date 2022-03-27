// https://leetcode.com/problems/distance-between-bus-stops/



public class _1184_Distance_Between_Bus_Stops {
    public static void main(String[] args)
    {
        int[] arr = {6,47,48,31,10,27,46,33,52,33,38,25,32,45,36,3,0,33,22,53,8,13,18,1,44,41,14,5,38,25,48};
        int start = 22;
        int destination = 0;
        System.out.println(distanceBetweenBusStops(arr, start, destination));
    }
    public static int distanceBetweenBusStops(int[] distance, int start, int destination)
    {
        int minDist = 0;
        
        // Check from front
        int fsum = 0, bsum = 0;
        int  i = start;
        while(i!=destination)
        {
            fsum = fsum + distance[i%distance.length];
            
            if(i == distance.length-1)
            {
                i = 0;
            }
            else
            {
                i++;
            }
        }

        // Check for back
        int j = start;
        while(j != destination)
        {
            

            if(j == 0)
            {
                j = distance.length-1;
            }
            else
            {
                j--;
            }
            bsum = bsum + distance[j];

        }
        if(fsum<=bsum)
        {
            minDist = fsum;
        }
        else
        {
            minDist = bsum;
        }
        return minDist;
    }
}
