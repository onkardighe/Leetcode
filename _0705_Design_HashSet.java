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
    private ArrayList<Integer> obj;
    public MyHashSet()
    {
        obj = new ArrayList<>();   
    }
    
    public void add(int key)
    {
        if(!(obj.contains(key)))
        {
            obj.add(key);
        }
    }
    
    public void remove(int key)
    {
        if(obj.contains(key))
        {
            obj.remove(obj.indexOf(key));
        }
    }
    
    public boolean contains(int key)
    {
        return obj.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */