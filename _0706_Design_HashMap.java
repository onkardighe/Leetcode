// https://leetcode.com/problems/design-hashmap/

import java.util.*;
public class _0706_Design_HashMap
{
    public static void main(String[] args)
    {
        MyHashMap obj = new MyHashMap();
        obj.put(1, 1);    
        obj.put(2, 2);    
        System.out.println(obj.get(1));    
        System.out.println(obj.get(3));    
        obj.put(2, 1);    
        System.out.println(obj.get(2)); 
        obj.remove(2);   
        System.out.println(obj.get(2)); 
    }    
}


class MyHashMap
{
    int[] map;
    public MyHashMap()
    {
        map = new int[(int)Math.pow(10, 6)+1];
        Arrays.fill(map, -1);
    }
    
    public void put(int key, int value) {
        map[key] = value;
    }
    
    public int get(int key)
    {
        return map[key];
    }
    
    public void remove(int key)
    {
        map[key] = -1;    
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */