//   https://leetcode.com/problems/sqrtx/submissions/


public class _0069_SqrtX
{
    public static void main(String[] args) {
        


        System.out.println(mySqrt(35));
    }
    static int mySqrt(int x) {
        int start = 1;
        int end = 2;
        while(end < (x/end))
        {
            int newStart = end +1;
            end  = end + (end-start+1)*10;
            start = newStart;
        }
        return BinarySearch(start,end,x);
    }
    static int BinarySearch(int start, int end, int iNo)
    {
        int mid = -1;
        while(start <= end)
        {
            mid  = start + (end-start)/2;
            if(mid == (iNo/mid))
            {
                return mid;
            }
            else if(mid < (iNo/mid))
            {
                start = mid +1;
            }
            else
            {
                end = mid -1;
                
            }
        }
        return end;
    }
}