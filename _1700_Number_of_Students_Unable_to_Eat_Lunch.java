// https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/


import java.util.*;
public class _1700_Number_of_Students_Unable_to_Eat_Lunch {
    public static void main(String[] args)
    {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};    
        System.out.println(new Solution().countStudents(students, sandwiches));
    }
}
class Solution {
    public int countStudents(int[] students, int[] sandwiches)
    {
        boolean able = true;
        
        int current = 0;     
        while(able)
        {
            able = false;
            for(int i = 0; i < students.length; i++)
            {
                    // take and leave
                if(students[i] != -1 && students[i] == sandwiches[current])
                {
                    able = true;
                    students[i] = -1;
                    current++;
                }
            }
        }
        
        // check for unable students
        int iCnt = 0;
        for(int a : students)
        {
            if(a != -1)
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}
