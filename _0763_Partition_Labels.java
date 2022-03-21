import java.util.*;

public class _0763_Partition_Labels {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));

    }
    public static List<Integer> partitionLabels(String s) {
        List<Integer> ans  = new ArrayList<>();

        int lastIndex = s.lastIndexOf(s.charAt(0));
        int iCnt = 1;
        int temp;
        for(int i = 1; i < s.length(); i++)
        {
            
            if(i > lastIndex)
            {
                ans.add(iCnt);
                iCnt = 0;
                lastIndex = s.lastIndexOf(s.charAt(i));
            }

            temp = s.lastIndexOf(s.charAt(i));
            if(temp > lastIndex)
            {
                lastIndex = temp;
            }

            iCnt++;
        }
        ans.add(iCnt);
        return ans;
    }
}