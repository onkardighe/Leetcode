// https://leetcode.com/problems/peeking-iterator/

import java.util.*;
public class _0284_Peeking_Iterator {
    public static void main(String[] args) {
        
    }
}

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer>
{
    private Queue<Integer> ele;
	public PeekingIterator(Iterator<Integer> iterator)
    {
	    ele = new LinkedList<>();
        convert(iterator);
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek()
    {
        return this.ele.peek();
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next()
    {
	    return this.ele.remove();
	}
	
	@Override
	public boolean hasNext()
    {
	    if(this.ele.size() > 0)
        {
            return true;
        }
        return false;
	}
    
    private void convert(Iterator<Integer> iterator)
    {
        while(iterator.hasNext())
        {
            ele.add(iterator.next());
        }
    }
}