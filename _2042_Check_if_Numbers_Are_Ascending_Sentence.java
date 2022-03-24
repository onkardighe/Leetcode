public class _2042_Check_if_Numbers_Are_Ascending_Sentence {
    public static void main(String[] args) {
        String s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";

        System.out.println(areNumbersAscending(s));

    }

    public static boolean areNumbersAscending(String str) {
        String[] arr = str.split(" ");
        int nextNumber = 0, prevNumber = 0;
        boolean flag = true;
        for (String word : arr)
        {
            try{
                nextNumber = Integer.parseInt(word);
            } catch (NumberFormatException e) 
            {
                flag = false;
            }

    

            if ((flag) && nextNumber <= prevNumber) {
                return false;
            }
            prevNumber = nextNumber;
            flag = true;
        }

        return true;
    }
}