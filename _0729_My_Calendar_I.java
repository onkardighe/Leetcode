// https://leetcode.com/problems/my-calendar-i/submissions/

import java.util.*;
public class _0729_My_Calendar_I {
    public static void main(String[] args) {
        
    }
}

class MyCalendar0729 {
    ArrayList<int[]> arr;
    public MyCalendar() {
        arr = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int[] a : arr)
        {
            if(Math.max(a[0] , start) < Math.min(a[1], end))
            {
                return false;
            }
        }
        arr.add(new int[]{start, end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 
 
 start  |   0   |  end  |     1
 start  |   0   |   1   |       end
 0      | start |   1   |       end
 0      | start |  end  |     1
 
 
 
 
 
 
 */