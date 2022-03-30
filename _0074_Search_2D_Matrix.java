// https://leetcode.com/problems/search-a-2d-matrix/

public class _0074_Search_2D_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                        {1},
                    };
        int target = 1;
        System.out.println(searchMatrix(arr, target));

        
            
    }
    public static boolean searchMatrix(int[][] matrix, int target)
    {
        int start = 0;
        int end = matrix.length-1;
        int mid = -1;
        while(start<=end)
        {
            mid = start+(end-start)/2;
            if(matrix[mid][0] <= target && matrix[mid][matrix[mid].length-1] >= target)
            {
                break;
            }
            else if(matrix[mid][0] > target)
            {
                end  = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        if(start<=end)
        {
            start = 0;
            end = matrix[mid].length-1;
            int midMiddle = -1;
            while(start<=end)
            {
                midMiddle = start+(end-start)/2;
                if(matrix[mid][midMiddle] == target)
                {
                    return true;
                }
                else if(matrix[mid][midMiddle] > target)
                {
                    end  = midMiddle-1;
                }
                else
                {
                    start = midMiddle+1;
                }
            }
        }
        return false;        
    }
}
