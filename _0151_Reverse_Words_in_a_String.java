import java.util.Arrays;

public class _0151_Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String str = "  Bob    Loves  Alice   ";
        System.out.println(reverseWords(str));
        // reverseWords(str);
    }
    static String reverseWords(String str) 
    {
        String ans  = "";
        String[] strArr = str.trim().split("\\s+");
        for(int i = strArr.length-1; i>=0; i--)
        {

            ans += strArr[i]+" "; 
        }
        return ans.trim();
    }
}