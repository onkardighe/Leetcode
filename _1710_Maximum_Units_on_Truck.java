// https://leetcode.com/problems/maximum-units-on-a-truck/

public class _1710_Maximum_Units_on_Truck {
    public static void main(String[] args) {
        int[][] boxTypes = {
            {5,10},
            {2,5},
            {4,7},
            {3,9}
        };
        int truckSize = 10;
        System.out.println(new Solution1710().maximumUnits(boxTypes, truckSize));
    }
}


class Solution1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize)
    {
        for(int i = 0; i < boxTypes.length; i++)    
        {
            for(int j = i+1; j<boxTypes.length; j++)
            {
                if(boxTypes[j][1] > boxTypes[i][1])
                {
                    // swap
                    int temp = boxTypes[i][0];
                    boxTypes[i][0] = boxTypes[j][0];
                    boxTypes[j][0] = temp;
                    
                    temp = boxTypes[i][1];
                    boxTypes[i][1] = boxTypes[j][1];
                    boxTypes[j][1] = temp;
                }
            }
        }
        
        
        int ans = 0;
        int i = 0;
        while((i < boxTypes.length) && (truckSize > 0))
        {
            int box = boxTypes[i][0];
            int units = boxTypes[i][1];
            
            if(box <= truckSize)
            {
                ans += box*units;
                truckSize -= box;
            }
            else
            {
                ans += truckSize * units;
                truckSize = 0;
            }            
            i++;
        }
        return ans;
    }
}