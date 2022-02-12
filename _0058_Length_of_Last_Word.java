// https://leetcode.com/problems/length-of-last-word/

public class _0058_Length_of_Last_Word {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(lengthOfLastWord(str));
    }
    static int lengthOfLastWord(String str) {

        String[] words = str.trim().split("\\s");
        return words[words.length-1].length();
        
    }

}
