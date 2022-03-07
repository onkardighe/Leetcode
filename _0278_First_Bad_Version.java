// https://leetcode.com/problems/first-bad-version/


public class _0278_First_Bad_Version
{
    static int iBad = 1;
    public static void main(String[] args) {
    
    int iNo = 1;
    System.out.println(firstBadVersion(iNo));
        

    }
    static int firstBadVersion(int n)
    {
        int start = 0;
        int end  = n;
        int mid = -1; 
        int ans = -1;
        while(start <= end)
        {
            mid = start + (end-start)/2;
            if(isBadVersion(mid))
            {
                ans  = mid;
                end = mid-1;
            }
            else 
            {
                start = mid + 1;
            }
        }
        return ans;   
    }

    static boolean isBadVersion(int iNo)
    {
        if(iNo == iBad)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}