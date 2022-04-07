// https://leetcode.com/submissions/detail/675497943/


import java.util.*;
public class _1046_Last_Stone_Weight 
{
    public static void main(String[] args)
	{
        int[] arr = {9,3,2,10};

		System.out.println(lastStoneWeight(arr));

		
    }


	public static int lastStoneWeight(int[] stones)
    {

        List<Integer> l = new ArrayList<>();
		for(int a : stones)
		{
			l.add(a);
		}
		int[] max;
		
		while(l.size() > 1)
		{
			max = getmax(l);
			if(max[0] != max[1])
			{
				l.add(max[1]-max[0]);
			}
			l.remove(l.indexOf(max[0]));
			l.remove(l.indexOf(max[1]));
		}
		if(l.size() == 0)
		{
			return 0;
		}
		else
		{
			return l.get(0);
		} 
    }

	// Function to get highest and second highest element in an array
	public static int[] getmax(List<Integer> l)
	{
		l.sort(null);
		int[] ans = {l.get(0), l.get(0)};
		int maxIndex = 0;

        
		for(int i = 0; i < l.size(); i++)
        {
            if(l.get(i) > ans[0])
            {
                ans[0] = l.get(i);
				maxIndex = i;
            }
        }

		for(int i = 0; i <l.size(); i++)
		{
			if(l.get(i) > ans[1] && i!= maxIndex)
            {
                ans[1] = l.get(i);
            }
		}
		Arrays.sort(ans);
		return ans;
	}
}

