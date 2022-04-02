// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/


public class _2011_Final_Value_Variable_After_Performing_Operations {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));

    } 
    public static int finalValueAfterOperations(String[] operations)
    {
        
        int plusCnt = 0;
        int minusCnt = 0;
        for(String operation : operations)
        {
            if(operation.endsWith("+") || operation.startsWith("+"))
            {
                plusCnt++;
            }
            else
            {
                minusCnt--;
            }
        }
        return plusCnt+minusCnt;
    }
}
