// https://leetcode.com/problems/design-underground-system/


import java.util.*;
public class _1396_Design_Underground_System
{
    public static void main(String[] args)
    {
        UndergroundSystem obj = new UndergroundSystem();
        obj.checkIn(45, "Leyton", 3);
        obj.checkIn(32, "Paradise", 8);
        obj.checkIn(27, "Leyton", 10);
        obj.checkOut(45, "Waterloo", 15);
        obj.checkOut(27, "Waterloo", 20);
        obj.checkOut(32, "Cambridge", 22);
        System.out.println(obj.getAverageTime("Paradise", "Cambridge"));
        System.out.println(obj.getAverageTime("Leyton", "Waterloo"));
        obj.checkIn(10, "Leyton", 24);
        obj.checkOut(10, "Waterloo", 38);
        System.out.println(obj.getAverageTime("Leyton", "Waterloo"));
    }
}


class UndergroundSystem {
    HashMap<Integer,Transaction> persons;
    HashMap<String, SumTotal> avg;

    public UndergroundSystem()
    {
        avg = new HashMap<>();
        persons = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t)
    {
        // Adding new transaction on record
        persons.put(id, new Transaction(id, stationName, t));
    }
    
    public void checkOut(int id, String stationName, int endT)
    {
        // Added to record 
        Transaction t = persons.get(id);        
        double totalTime = endT-t.startTime;
        
        String route = t.startStation+"-"+stationName;
        if(avg.containsKey(route))      
        {
            // Updating previous record for route
            avg.get(route).sum += totalTime;
            avg.get(route).transNo++;
        }
        else  
        {
            // Adding new record
            avg.put(route, new SumTotal(totalTime));
        }        
    }
    
    public double getAverageTime(String startStation, String endStation)
    {
        String route = startStation+"-"+endStation;
        return avg.get(route).sum / avg.get(route).transNo;
    }
}

// class to Store Sum and number of transactions 
class SumTotal
{
    public double sum;
    public int transNo;
    public SumTotal(double dist)
    {
        this.sum = dist;
        this.transNo = 1;
    }
}

class Transaction
{
    public int id;
    public String startStation;
    public int startTime;
    public Transaction(int tTd, String stationName, int t)
    {
        this.id = tTd;
        this.startStation = stationName;
        this.startTime = t;
    }    
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */