public class _1816_Truncate_Sentence
{
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s,k));
    }
    public static String truncateSentence(String s, int k)
    {
        String[] words = s.split(" ");
        
        String ans = "";
        for(String word : words)
        {
            if(k == 0)
            {
                break;
            }
            ans +=" "+word;
            k--;
        }
        return ans.trim();
    }
}