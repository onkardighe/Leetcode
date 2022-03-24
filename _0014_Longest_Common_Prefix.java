public class _0014_Longest_Common_Prefix
{
    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs)
    {
        String ans = "";
        String sub = "";
        int i = 0;


        while(i < strs[0].length())
        {
            ans  = strs[0].substring(0, i+1);
            for(String element : strs)
            {
                if(i >= element.length())
                {
                    return ans.substring(0, ans.length()-1);
                }
                sub = element.substring(0, i+1);
                if(!(ans.equals(sub))) 
                {
                    return ans.substring(0, ans.length()-1);
                }  
            }
            i++;
        }
        return ans;
    }
}