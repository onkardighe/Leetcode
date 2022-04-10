// https://leetcode.com/problems/crawler-log-folder/

public class _1598_Crawler_Log_Folder {
    public static void main(String[] args) {
        String[] logs  = {"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs));
    }
    public static int minOperations(String[] logs)
    {
        int steps = 0;
        for(String str  : logs)
        {
            if(str.equals("../") )
            {
                if(steps!= 0)
                {
                    steps--;
                }
            }
            else if(str.equals("./"))
            {
                steps = steps;
            }
            else
            {
                steps++;
            }
        }
        return steps;
    }
}
