public class _2114_Maximum_Number_Words_Found_Sentences
{
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences)
    {
        int ans = 0;
        for(String str : sentences)
        {
            int temp =  str.split(" ").length;
            if(temp > ans)
            {
                ans  = temp;
            }
        }   
        return ans; 
    }
}