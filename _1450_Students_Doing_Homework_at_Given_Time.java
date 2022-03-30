// https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/submissions/

public class _1450_Students_Doing_Homework_at_Given_Time
{
    public static void main(String[] args) {
        int[] statTime = {1,2,3};
        int[] endTime = {3,2,7};
        int queryTime = 4;

        System.out.println(busyStudent(statTime, endTime, queryTime));
    }
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime)
    {
        int iCnt = 0;
        for(int i = 0; i < startTime.length; i++)
        {
            if(queryTime >= startTime[i] && queryTime <= endTime[i])
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}