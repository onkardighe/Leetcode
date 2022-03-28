import java.util.Arrays;

public class _0344_Reverse_String {
    public static void main(String[] args) {
        char[] str = {'h','e','l','l','o'};
        reverseString(str);
    }
    static void reverseString(char[] strArr) 
    {
        int iStart = 0; 
        int iEnd = strArr.length-1;

        while(iStart <= iEnd)
        {
            char temp = strArr[iStart];
            strArr[iStart] = strArr[iEnd];
            strArr[iEnd] = temp;
            iStart++;
            iEnd--;
        }
        // System.out.println(Arrays.toString(strArr));
    }
}