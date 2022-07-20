// https://leetcode.com/problems/maximum-population-year/

public class _1854_Maximum_Population_Year {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{2000,2010}};
        System.out.println(new Solution1854().maximumPopulation(logs));
    }
}


class Solution1854 {
    public int maximumPopulation(int[][] logs) {
        
        // check for every year
        int maxP = 0;
        int maxYear = 1950;
        for(int i =  1950; i <= 2050; i++)
        {
            int currP = 0;
            for(int[] person : logs)
            {
                if(person[0] <= i && i < person[1])
                {
                    currP++;
                }
            }
            if(currP > maxP)
            {
                maxP = currP;
                maxYear = i;
            }
        }
        return maxYear;
        
    }
}