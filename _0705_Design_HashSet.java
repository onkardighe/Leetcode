// https://leetcode.com/problems/design-hashset/



import java.util.*;
public class _0705_Design_HashSet
{
    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(1);
        obj.add(2);
        System.out.println(obj.contains(1));
        System.out.println(obj.contains(3));
        obj.add(2);
        System.out.println(obj.contains(2));
        obj.remove(2);
        System.out.println(obj.contains(2));
    }

}
class MyHashSet
{
    int iSize;
    boolean[] set;
    public MyHashSet()
    {
        iSize = (int)Math.pow(10, 6)+1;
        set = new boolean[iSize];
    }
    
    public void add(int key)
    {
        set[key]  = true;    
    }
    
    public void remove(int key)
    {
        set[key] = false;    
    }
    
    public boolean contains(int key)
    {
        return set[key];    
    }
}



/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
